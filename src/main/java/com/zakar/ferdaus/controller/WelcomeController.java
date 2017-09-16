package com.zakar.ferdaus.controller;


import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zakar.ferdaus.service.GenericWelcomeService;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    private static Logger LOG = LoggerFactory.getLogger(WelcomeController.class);


    @Autowired
    private GenericWelcomeService welcomeService;

    @RequestMapping(value = "/home")
    public String doWelcome(@RequestParam(value = "lang",required =false) String lang, Model model) {
        LOG.info("Home has been called param:" +lang);
        if(lang==null){
            model.addAllAttributes(welcomeService.getInnerTexts("home"));
            return "welcomeHome";
        }
        switch (lang) {
            case "":
                break;
            case "en":
                welcomeService.setResourceBundle(new Locale("en", "EN"));
                break;
            case "pa":
                welcomeService.setResourceBundle(new Locale("pa", "PA"));
                break;
             case "ur":
                welcomeService.setResourceBundle(new Locale("ur", "UR"));
                break;
             case "pe":
                welcomeService.setResourceBundle(new Locale("pe", "PE"));
                break;
        }
        model.addAllAttributes(welcomeService.getInnerTexts("home"));
        return "welcomeHome";
    }




}
