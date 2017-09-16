package com.zakar.ferdaus.service;

import java.util.*;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service(value = "welcomeService")
public class WelcomeService implements GenericWelcomeService {

    private static Logger LOG = LoggerFactory.getLogger(WelcomeService.class);

    private Locale locale;
    private static ResourceBundle resourceBundle;
    private String DICTIONARY = "dictionary";

    public WelcomeService() {
        this.resourceBundle = ResourceBundle.getBundle(DICTIONARY);
    }

    @Override
    public void setResourceBundle(Locale locale) {
        if (locale != null) {
            this.resourceBundle = ResourceBundle.getBundle(DICTIONARY, locale);
        } else {
            this.resourceBundle = ResourceBundle.getBundle(DICTIONARY);
        }
    }

    @Override
    public String getName(String key) {
        String returnValue = resourceBundle.getString(key);
        if (returnValue != null) {
            LOG.info("Key: " + key + " has been found with value: " + returnValue);
            return returnValue;
        } else {
            throw new IllegalArgumentException("Inappropriate key");
        }
    }

    public Map<String, String> getInnerTexts(String page) {
        Set<String> keys = resourceBundle.keySet();
        Map<String, String> innerTexts = new HashMap();
        for (String key : keys) {
            if (key.contains(page)) {
                System.out.println(resourceBundle.getString(key));
                innerTexts.put(key.replace((page + "."), ""), resourceBundle.getString(key));
            }
        }
        return innerTexts;
    }
}
