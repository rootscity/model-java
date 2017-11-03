package com.rootscity.model;

import java.io.Serializable;

/**
 * Created by Nano on 06/01/2017.
 */
public class PersonSummary implements Serializable {
	protected static final transient long serialVersionUID = 1818522477511644512L;
	public Long id;
	public NameForm nameParts;
	public String gender;
	public String living;
	public String birthDate;
	public String birthDateSort;
	public String birthPlace;
	public String birthPlaceStandard;
	public String deathDate;
	public String deathDateSort;
	public String deathPlace;
	public String deathPlaceStandard;

}
