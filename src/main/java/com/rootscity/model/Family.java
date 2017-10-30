package com.rootscity.model;

import scala.Serializable;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Family extends FirstClassObject implements Serializable {
    protected static final transient long serialVersionUID = 2152261477521116412L;
    public Long husbandId;
    public Long wifeId;
    public Map<Long, ParentRelationships> childRels;
}
