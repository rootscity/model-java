package com.rootscity.model;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class EvidencePersona {
    public Boolean principal;
    public Integer relatedToKey;
    public String relationshipType;
    public Map<Integer, Fact> facts;
    public Map<Integer, Name> names;
}
