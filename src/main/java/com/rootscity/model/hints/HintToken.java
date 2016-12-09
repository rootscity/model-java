package com.rootscity.model.hints;

public class HintToken {

  public String source;           // "FamilySearch Historical Records"
  public Long treeId;             // RootsFinder id of the tree that these hints belong to
  public String fsTreeId;         // the id of the associated tree in FamilySearch
  public Long personId;           // RootsFinder person id
  public String fsPersonUri;      // URI of the associated person in FamilySearch Genealogies
  public Hint[] hints;

}
