package com.rootscity.model.hints;

public class Hint {
  public String personaUri;       // URI of the potentially matching "persona" in FamilySearch Records
  public String personaName;
  public String personaTitle;
  public String personaId;        // id of the persona (not the whole URI)
  public String recordId;         // id of the record that the persona belongs to
  public String collectionTitle;  // title of the collection that the record belongs to
  public Integer confidence;      // 1-5, 5 being "most confident" (by default you will see only values from 3-5)
  public Integer eventYear;       // optional
  public String eventPlace;       // optional
  public String eventType;        // optional - human (textual) description

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Hint hint = (Hint) o;

    if (personaUri != null ? !personaUri.equals(hint.personaUri) : hint.personaUri != null) {
      return false;
    }
    if (personaName != null ? !personaName.equals(hint.personaName) : hint.personaName != null) {
      return false;
    }
    if (personaTitle != null ? !personaTitle.equals(hint.personaTitle) : hint.personaTitle != null) {
      return false;
    }
    if (personaId != null ? !personaId.equals(hint.personaId) : hint.personaId != null) {
      return false;
    }
    if (recordId != null ? !recordId.equals(hint.recordId) : hint.recordId != null) {
      return false;
    }
    if (collectionTitle != null ? !collectionTitle.equals(hint.collectionTitle) : hint.collectionTitle != null) {
      return false;
    }
    if (confidence != null ? !confidence.equals(hint.confidence) : hint.confidence != null) {
      return false;
    }
    if (eventYear != null ? !eventYear.equals(hint.eventYear) : hint.eventYear != null) {
      return false;
    }
    if (eventPlace != null ? !eventPlace.equals(hint.eventPlace) : hint.eventPlace != null) {
      return false;
    }
    return eventType != null ? eventType.equals(hint.eventType) : hint.eventType == null;
  }

  @Override
  public int hashCode() {
    int result = personaUri != null ? personaUri.hashCode() : 0;
    result = 31 * result + (personaName != null ? personaName.hashCode() : 0);
    result = 31 * result + (personaTitle != null ? personaTitle.hashCode() : 0);
    result = 31 * result + (personaId != null ? personaId.hashCode() : 0);
    result = 31 * result + (recordId != null ? recordId.hashCode() : 0);
    result = 31 * result + (collectionTitle != null ? collectionTitle.hashCode() : 0);
    result = 31 * result + (confidence != null ? confidence.hashCode() : 0);
    result = 31 * result + (eventYear != null ? eventYear.hashCode() : 0);
    result = 31 * result + (eventPlace != null ? eventPlace.hashCode() : 0);
    result = 31 * result + (eventType != null ? eventType.hashCode() : 0);
    return result;
  }
}
