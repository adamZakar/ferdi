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
        welcomeService.setResourceBundle(lang);
        model.addAllAttributes(welcomeService.getInnerTexts("home"));
        return "welcomeHome";
    }

    @RequestMapping(value = "/contact")
    public String doContact(@RequestParam(value = "lang",required =false) String lang, Model model) {
        LOG.info("Contact has been called param:" +lang);
        welcomeService.setResourceBundle(lang);
        model.addAllAttributes(welcomeService.getInnerTexts("contact"));
        return "contact";
    }


}
