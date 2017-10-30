package com.rootscity.model;

import scala.Serializable;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Media extends FirstClassObject implements Serializable {
    protected static final transient long serialVersionUID = 2152261477521216412L;
    public String title;
    public String date;
    public String dateSort;
    public String place;
    public String placeStandard;
    public Double latitude;
    public Double longitude;
    public String text;
    public String url;
    public Map<Long, FileInfo> fileInfos;
    public Map<Long, Boolean> personIds;
}
