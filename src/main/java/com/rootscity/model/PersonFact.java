package com.rootscity.model;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class PersonFact extends Fact {
    public Boolean principal;
	public Long principalId1;
 	public Long principalId2;
	public Boolean hidden;
	public Map<Long, Integer> evidencePersonas;  // map EvidenceID -> PersonaID
}
