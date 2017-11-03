package com.rootscity.model;

import java.io.Serializable;
import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class FirstClassObject implements Serializable {
	protected static final transient long serialVersionUID = 212152261477526412L;
	public Long id;
	public Integer version;
	public Long changeId;
	public Map<String, ExternalID> externalIds;
  public Integer createdUser;
 	public Long createdDate;
 	public Integer editedUser;
 	public Long editedDate;
}
