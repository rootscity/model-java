package com.rootscity.model;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class FirstClassObject {
	public Long id;
	public Integer version;
	public Long changeId;
	public Map<String, ExternalID> externalIds;
  public Integer createdUser;
 	public Long createdDate;
 	public Integer editedUser;
 	public Long editedDate;
	public Boolean deleted; // set to true if the object is deleted
}
