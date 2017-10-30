package com.rootscity.model;

import java.io.Serializable;
import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class PersonFact extends Fact implements Serializable {
	protected static final transient long serialVersionUID = 345122962361477264L;
	public Boolean principal;
	public Long principalId1;
	public Long principalId2;
	public Boolean hidden;
	public Map<Long, Long> evidencePersonas;  // map EvidenceID -> PersonaID
}
