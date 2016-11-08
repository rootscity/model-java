package com.rootscity.model;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Lead extends FirstClassObject {
    public String externalSource;
    public String externalId;
    public String title;
    public String url;
    public String text;
    public Boolean hidden;
    public Map<Long, Boolean> personIds;
}
