package com.zakar.ferdaus.service;

import java.util.List;
import java.util.Locale;
import java.util.Map;

public interface GenericWelcomeService {
	public void setResourceBundle(Locale locale);
	public String getName(String key);
	public Map<String, String> getInnerTexts(String page);
}