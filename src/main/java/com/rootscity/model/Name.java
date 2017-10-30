package com.rootscity.model;

import java.io.Serializable;
import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Name implements Serializable {
	protected static final transient long serialVersionUID = 7522152261477526412L;
	public Map<String, NameForm> nameForms;
	public String type;
}
