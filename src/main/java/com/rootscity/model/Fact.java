package com.rootscity.model;

import java.io.Serializable;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Fact implements Serializable {
	protected static final transient long serialVersionUID = 345122962361477264L;
	public String type;
	public String value;
	public String date;
	public String dateSort;
	public String place;
	public String placeDetails;
	public String placeStandard;
	public Double latitude;
	public Double longitude;
}
