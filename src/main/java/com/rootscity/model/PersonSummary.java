package com.rootscity.model;

/**
 * Created by Nano on 06/01/2017.
 */
public class PersonSummary {
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

	public String getName() {
		return nameParts.toString();
	}
}
