package com.rootscity.model;

import scala.Serializable;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Lead extends FirstClassObject implements Serializable {
    protected static final transient long serialVersionUID = 215200261477526412L;
    public String externalSource;
    public String externalId;
    public String title;
    public String url;
    public String text;
    public Boolean hidden;
    public Map<Long, Boolean> personIds;
}
