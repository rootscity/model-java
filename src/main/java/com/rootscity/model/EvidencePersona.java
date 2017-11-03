package com.rootscity.model;

import java.io.Serializable;
import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class EvidencePersona implements Serializable {
    protected static final transient long serialVersionUID = 2115224775116414512L;
    public Boolean principal;
    public Long relatedToKey;
    public String relationshipType;
    public Map<Long, Fact> facts;
    public Map<Long, Name> names;
}
