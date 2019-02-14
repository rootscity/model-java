package com.rootscity.model.hints;

import java.util.Map;
import java.util.Objects;

public class Hint {
  public String personaUri;       // URI of the potentially matching "persona" in FamilySearch Records
  public String personaName;
  public String personaTitle;
  public String personaId;        // id of the persona (not the whole URI)
  public String recordId;         // id of the record that the persona belongs to
  public String collectionTitle;  // title of the collection that the record belongs to
  public Integer confidence;      // 1-5, 5 being "most confident" (by default you will see only values from 3-5)
  public Double score;           // optional source-specific score
  public Map<String, String> metadata; // optional meta-data from the hint
  public Integer eventYear;       // optional
  public String eventPlace;       // optional
  public String eventType;        // optional - human (textual) description

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Hint hint = (Hint) o;
    return Objects.equals(personaUri, hint.personaUri) &&
            Objects.equals(personaName, hint.personaName) &&
            Objects.equals(personaTitle, hint.personaTitle) &&
            Objects.equals(personaId, hint.personaId) &&
            Objects.equals(recordId, hint.recordId) &&
            Objects.equals(collectionTitle, hint.collectionTitle) &&
            Objects.equals(confidence, hint.confidence) &&
            Objects.equals(score, hint.score) &&
            Objects.equals(metadata, hint.metadata) &&
            Objects.equals(eventYear, hint.eventYear) &&
            Objects.equals(eventPlace, hint.eventPlace) &&
            Objects.equals(eventType, hint.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personaUri, personaName, personaTitle, personaId, recordId, collectionTitle, confidence, score, metadata, eventYear, eventPlace, eventType);
  }
}
