package com.timbuchalka.springdemo.service;

import java.util.List;
import java.util.Locale;

public interface GenericWelcomeService {
	public List<String> getWelcomeMessage(String name);
	public void setResourceBundle(Locale locale);
	public String getName(String key);
}
