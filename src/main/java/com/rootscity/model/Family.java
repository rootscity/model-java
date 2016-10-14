package com.rootscity.model;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Family extends FirstClassObject {
    public String gedcomId;
    public Long husbandId;
    public Long wifeId;
    public Map<Long, ParentRelationships> childRels;
}
