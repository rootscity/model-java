package com.rootscity.model;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Person extends FirstClassObject {
	public Long profilePhoto;
	public Long coverPhoto;
	public Long preferredNameKey;  // key of the preferred name in the names map
	public Long preferredBirthKey;  // key of the preferred birth in the facts map
	public Long preferredDeathKey;  // key of the preferred death in the facts map
	public Long preferredParentsFamilyId;   // id of the preferred parents Family
	public Map<Long, PersonName> names;  // map 2^32 random number -> name
	public String living;
    public String gender;
    public Map<Long, PersonFact> facts;  // map 2^32 random number -> fact

}
