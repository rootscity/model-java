package com.rootscity.model;

import java.util.Map;

/**
 * User: dallan
 * Date: 10/13/16
 */
public class Evidence extends FirstClassObject {
	public Fact fact;
	public Map<Long, Boolean> mediaIds;
	public String externalImageURL;
	public String text;
	public EvidenceCitation citation;
	public Map<Long, EvidencePersona> personas;
}
