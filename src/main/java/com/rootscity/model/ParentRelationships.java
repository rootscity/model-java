package com.rootscity.model;

import java.io.Serializable;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class ParentRelationships implements Serializable {
    protected static final transient long serialVersionUID = 229536274614267524L;
    public String fatherRel;
    public String motherRel;

    public ParentRelationships() {
    }

    public ParentRelationships(String frel, String mrel) {
        fatherRel = frel == null ? "" : frel;
        motherRel = mrel == null ? "" : mrel;
    }
}
