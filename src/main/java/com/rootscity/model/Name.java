package com.rootscity.model;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Name {
	public Map<String, NameForm> nameForms;
	public String type;

	@Override
	public String toString() {
		return nameForms == null || nameForms.isEmpty() ? "" : firstName().toString();
	}

	public NameForm firstName() {
		return nameForms == null || nameForms.isEmpty() ? null : nameForms.get(0);
	}
}
