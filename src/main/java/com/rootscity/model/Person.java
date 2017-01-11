package com.rootscity.model;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Person extends FirstClassObject {
	public Boolean living;
	public Long profilePhoto;
	public Long coverPhoto;
	public Long preferredNameKey;  // key of the preferred name in the names map
	public Long preferredBirthKey;  // key of the preferred birth in the facts map
	public Long preferredDeathKey;  // key of the preferred death in the facts map
	public Long preferredParentsFamilyId;   // id of the preferred parents Family
	public Map<Long, PersonName> names;  // map 2^32 random number -> name
  public String gender;
  public Map<Long, PersonFact> facts;  // map 2^32 random number -> fact

	public PersonFact getFact(String type, Long pid) {
		for (PersonFact pf: facts.values()) {
			if (pf.principalId1==pid || pf.principalId2==pid){
				if (type==null) {
					return pf;
				}
				if (pf.type != null && pf.type.equalsIgnoreCase(type)) {
					return pf;
				}
			}
		}
		return null;
	}

	public PersonName getName(){
		if (preferredNameKey!=null){
			return names.get(preferredNameKey);
		}
		for (PersonName pn: names.values()){
			return pn;
		}
		return null;
	}
}
