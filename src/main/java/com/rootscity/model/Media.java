package com.rootscity.model;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Media extends FirstClassObject {
    public String gedcomId;
    public String title;
    public String date;
    public String dateSort;
    public String place;
    public String placeStandard;
    public Double latitude;
    public Double longitude;
    public String text;
    public String url;
    public Map<Long, String> fileTypes;
    public Map<Long, Boolean> personIds;
}
