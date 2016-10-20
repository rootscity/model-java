package com.rootscity.model;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class EvidencePersona {
    public Boolean principal;
    public Long relatedToKey;
    public String relationshipType;
    public Map<Long, Fact> facts;
    public Map<Long, Name> names;
}
