package com.rootscity.model;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Story extends FirstClassObject {
    public String title;
    public String date;
    public String dateSort;
    public String place;
    public String placeStandard;
    public Double latitude;
    public Double longitude;
    public String text;
    public Map<Long, Boolean> mediaIds;
    public Map<Long, Boolean> personIds;
}
