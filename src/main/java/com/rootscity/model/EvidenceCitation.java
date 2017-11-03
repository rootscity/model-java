package com.rootscity.model;

import java.io.Serializable;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class EvidenceCitation implements Serializable {
    protected static final transient long serialVersionUID = 1522471751116414512L;
    public Long sourceId;
    public String url;
    public String page;
    public String date;
    public String place;
}
