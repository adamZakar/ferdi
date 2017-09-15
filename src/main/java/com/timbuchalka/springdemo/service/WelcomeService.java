package com.timbuchalka.springdemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService implements GenericWelcomeService {

	private Locale locale;
	private ResourceBundle resourceBundle;
	private String DICTIONARY = "dictionary";

	public WelcomeService() {
		this.resourceBundle = ResourceBundle.getBundle(DICTIONARY);
	}

	public List<String> getWelcomeMessage(String name) {
		List<String> myWelcomeMessage = new ArrayList<>();

		// Add data to the list
		myWelcomeMessage.add("Hello! ");
		myWelcomeMessage.add(name);
		myWelcomeMessage.add(", welcome to the Spring course :-)");

		return myWelcomeMessage;
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
			return returnValue;
		} else {
			throw new IllegalArgumentException("Inappropriate key");
		}
	}

}
