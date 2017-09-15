package com.timbuchalka.springdemo.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.timbuchalka.springdemo.service.GenericWelcomeService;
import com.timbuchalka.springdemo.service.WelcomeService;

@Controller
public class WelcomeController {

    @Autowired
    private GenericWelcomeService welcomeService;
    
    @RequestMapping
    public String doWelcome(Model model) {

        List<String> welcomeMessage = welcomeService.getWelcomeMessage("Tim Buchalka");

        // 2.  Add data to the model
        model.addAttribute("myWelcomeMessage", welcomeMessage);
        model.addAttribute("title", "Ferdaus mommand");
        // 3.  Return logical view name
        return "welcomeHome";
    }
    
    
    @RequestMapping("/en")
    public String setToEn(Model model) {
    	welcomeService.setResourceBundle(new Locale("en","EN"));
      return doWelcome(model);
    	
    }
    
    @RequestMapping("/pa")
    public String setToPa(Model model) {
    	welcomeService.setResourceBundle(new Locale("pa","PA"));
      return doWelcome(model);	
    }
    
    @RequestMapping("/ur")
    public String setToUr(Model model) {
    	welcomeService.setResourceBundle(new Locale("ur","UR"));
      return doWelcome(model);
    	
    }
    @RequestMapping("/pe")
    public String setToPe(Model model) {
    	welcomeService.setResourceBundle(new Locale("pe","Pe"));
      return doWelcome(model);
    }
   
    
}
