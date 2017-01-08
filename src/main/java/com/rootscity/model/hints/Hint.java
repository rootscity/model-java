package com.rootscity.model.hints;

public class Hint {
  public String personaUri;       // URI of the potentially matching "persona" in FamilySearch Records
  public String personaName;
  public String personaTitle;
  public String personaId;        // id of the persona (not the whole URI)
  public String recordId;         // id of the record that the persona belongs to
  public String collectionTitle;  // title of the collection that the record belongs to
  public double confidence;      // 1-5, 5 being "most confident" (by default you will see only values from 3-5)
  public Integer eventYear;
}
