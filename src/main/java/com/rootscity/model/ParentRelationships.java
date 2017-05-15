package com.rootscity.model;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class ParentRelationships {
    public String fatherRel;
    public String motherRel;

    public ParentRelationships() {
    }

    public ParentRelationships(String frel, String mrel) {
        fatherRel = frel == null ? "" : frel;
        motherRel = mrel == null ? "" : mrel;
    }
}
