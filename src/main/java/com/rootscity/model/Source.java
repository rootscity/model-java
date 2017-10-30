package com.rootscity.model;

import scala.Serializable;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Source extends FirstClassObject implements Serializable {
    protected static final transient long serialVersionUID = 2152261477521916412L;
    public String abbr;
    public String externalSource;
    public String externalId;
    public String title;
    public String subtitle;
    public String creator;
    public String publisher;
    public String dateIssued;
    public String placeIssued;
    public String type;
    public String periodicalSeries;
    public String numVolumes;
    public String volumeFilmPages;
    public String repository;
    public String callNumber;
    public String url;
    public String shortFootnote;
    public String bibCitation;
    public String text;
    public Map<Long, Boolean> mediaIds;
}
