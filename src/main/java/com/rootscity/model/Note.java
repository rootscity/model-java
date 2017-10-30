package com.rootscity.model;

import scala.Serializable;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Note extends FirstClassObject implements Serializable {
    protected static final transient long serialVersionUID = 2152261477521716412L;
    public String title;
    public String text;
    public Map<Long, Boolean> personIds;
}
