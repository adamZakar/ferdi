package com.zakar.ferdaus.controller;

import com.zakar.ferdaus.service.ContactParser;
import com.zakar.ferdaus.service.ContactServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ádám on 2017. 09. 17..
 */
@Controller
public class ContactController {

    @Autowired
    private ContactServiceImpl contactService;

    private static Logger LOG = LoggerFactory.getLogger(ContactController.class);

    @RequestMapping(value = "/contact")
    public String getContactPage(@RequestParam(value = "lang",required =false) String lang, Model model) {
        LOG.info("Contact has been called param:" +lang);
        return "contactPage";
    }


    @RequestMapping(value ="/contact/submitContact" , method = RequestMethod.POST)
    public @ResponseBody ContactParser addNewWorker(@RequestBody ContactParser jsonString) {
        LOG.info("JSON has been received: "+jsonString.toString());

        return jsonString;
    }

}
