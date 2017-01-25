package com.rootscity.model;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Note extends FirstClassObject {
    public String title;
    public String text;
    public Map<Long, Boolean> personIds;
}
