package com.rootscity.model;

public class Types {

  //------------------------------------------
  // gender types
  //------------------------------------------
  public static final String GENDER_MALE = "MALE";
  public static final String GENDER_FEMALE = "FEMALE";

  //------------------------------------------
  // name types
  //------------------------------------------
  public static final String NAME_TYPE_NICK = "NICK";
  public static final String NAME_TYPE_MARRIED = "_MARNM";
  public static final String NAME_TYPE_ALIAS = "ALIA";
  public static final String NAME_TYPE_BIRTH = "_BIRTNM";
  public static final String NAME_TYPE_MAIDEN = "_MAID";
  public static final String NAME_TYPE_VARN = "_VARN";
  public static final String NAME_TYPE_OTHER = "_OTHN";
  public static final String NAME_TYPE_PATRONYMIC = "_PATR";
  public static final String NAME_TYPE_TITLE = "TITL";

  //------------------------------------------
  // person facts
  //------------------------------------------
  public static final String FACT_TYPE_ADDR = "ADDR";
  public static final String FACT_TYPE_ADOP = "ADOP";
  public static final String FACT_TYPE_AFIL = "_AFIL";
  public static final String FACT_TYPE_AGE = "_AGE";
  public static final String FACT_TYPE_AFN = "AFN";
  public static final String FACT_TYPE_NICK = "NICK";
  public static final String FACT_TYPE_BIRT = "BIRT";
  public static final String FACT_TYPE_DEAT = "DEAT";
  public static final String FACT_TYPE_BURI = "BURI";
  public static final String FACT_TYPE_BURL = "BURL";
  public static final String FACT_TYPE_ARVL = "ARVL";
  public static final String FACT_TYPE_DSCR = "DSCR";
  public static final String FACT_TYPE_BAPM = "BAPM";
  public static final String FACT_TYPE_BARM = "BARM";
  public static final String FACT_TYPE_BATM = "BATM";
  public static final String FACT_TYPE_BLES = "BLES";
  public static final String FACT_TYPE_CAST = "CAST";
  public static final String FACT_TYPE_CAUS = "CAUS";
  public static final String FACT_TYPE_RESI = "RESI";
  public static final String FACT_TYPE_CHR = "CHR";
  public static final String FACT_TYPE_CLAN = "_CLAN";
  public static final String FACT_TYPE_CONF = "CONF";
  public static final String FACT_TYPE_CREM = "CREM";
  public static final String FACT_TYPE_DEG = "_DEG";
  public static final String FACT_TYPE_DPRT = "DPRT";
  public static final String FACT_TYPE_EDUC = "EDUC";
  public static final String FACT_TYPE_ELEC = "_ELEC";
  public static final String FACT_TYPE_EMAIL = "EMAIL";
  public static final String FACT_TYPE_EMIG = "EMIG";
  public static final String FACT_TYPE_EMPL = "EMPL";
  public static final String FACT_TYPE_EXCM = "_EXCM";
  public static final String FACT_TYPE_FSFTID = "_FSFTID"; // FamilySearch FamilyTree ID
  public static final String FACT_TYPE_FCOM = "FCOM";
  public static final String FACT_TYPE_FUN = "_FUN";
  public static final String FACT_TYPE_GRAD = "GRAD";
  public static final String FACT_TYPE_ILL = "ILL";
  public static final String FACT_TYPE_IMMI = "IMMI";
  public static final String FACT_TYPE_MSTAT = "_MSTAT";
  public static final String FACT_TYPE_MDCL = "_MDCL";
  public static final String FACT_TYPE_MILT = "_MILT";
  public static final String FACT_TYPE_MISN = "_MISN";
  public static final String FACT_TYPE_MOVE = "_MOVE";
  public static final String FACT_TYPE_NAMS = "_NAMS";
  public static final String FACT_TYPE_NID = "_NID";
  public static final String FACT_TYPE_NATI = "_NATI";
  public static final String FACT_TYPE_NATU = "_NATU";
  public static final String FACT_TYPE_NEWS = "_NEWS";
  public static final String FACT_TYPE_NCHI = "NCHI";
  public static final String FACT_TYPE_OBIT = "_OBIT";
  public static final String FACT_TYPE_OCCU = "OCCU";
  public static final String FACT_TYPE_ORDN = "ORDN";
  public static final String FACT_TYPE_PHON = "PHON";
  public static final String FACT_TYPE_PROB = "PROB";
  public static final String FACT_TYPE_PROP = "PROP";
  public static final String FACT_TYPE_RACE = "_RACE";
  public static final String FACT_TYPE_REFN = "REFN";
  public static final String FACT_TYPE_RELI = "RELI";
  public static final String FACT_TYPE_RETI = "RETI";
  public static final String FACT_TYPE_SSN = "SSN";
  public static final String FACT_TYPE_STIL = "_STIL";
  public static final String FACT_TYPE_TRIB = "_TRIB";
  public static final String FACT_TYPE_WILL = "WILL";

  // special "gender" fact
  public static final String FACT_TYPE_SEX = "SEX";  // value starts with "M" or "F"

  //------------------------------------------
  // couple facts
  //------------------------------------------
  public static final String FACT_TYPE_ANUL = "ANUL";
  public static final String FACT_TYPE_SEPR = "_SEPR";
  public static final String FACT_TYPE_CIVL = "_CIVL";
  public static final String FACT_TYPE_ENG = "ENG";
  public static final String FACT_TYPE_DIV = "DIV";
  public static final String FACT_TYPE_DIVF = "DIVF";
  public static final String FACT_TYPE_CLAW = "CLAW";
  public static final String FACT_TYPE_MARR = "MARR";
  public static final String FACT_TYPE_MARB = "MARB";
  public static final String FACT_TYPE_MBON = "_MBON";
  public static final String FACT_TYPE_MARC = "MARC";
  public static final String FACT_TYPE_MARL = "MARL";
  public static final String FACT_TYPE_MARS = "MARS";

  //------------------------------------------
  // parental relationship types
  //------------------------------------------
  public static final String PARENT_TYPE_ADOPTIVE = "ADOPTIVE_PARENT";
  public static final String PARENT_TYPE_BIOLOGICAL = "BIOLOGICAL_PARENT";
  public static final String PARENT_TYPE_FAMILY_MEMBER = "FAMILY_MEMBER";
  public static final String PARENT_TYPE_FOSTER = "FOSTER_PARENT";
  public static final String PARENT_TYPE_GUARDIAN = "GUARDIAN";
  public static final String PARENT_TYPE_RELATED = "RELATED";
  public static final String PARENT_TYPE_STEP = "STEP_PARENT";
  public static final String PARENT_TYPE_UNKNOWN = "UNKNOWN";

  //------------------------------------------
  // evidence persona relationship types
  //------------------------------------------
  public static final String RELATIONSHIP_TYPE_CHILD = "CHILD";
  public static final String RELATIONSHIP_TYPE_FATHER = "FATHER";
  public static final String RELATIONSHIP_TYPE_MOTHER = "MOTHER";
  public static final String RELATIONSHIP_TYPE_SPOUSE = "SPOUSE";
  public static final String RELATIONSHIP_TYPE_PARENT = "PARENT";
  public static final String RELATIONSHIP_TYPE_ADOPTIVE_PARENT = "ADOPTIVE_PARENT";
  public static final String RELATIONSHIP_TYPE_STEP_PARENT = "STEP_PARENT";

  //------------------------------------------
  // possible values for "token.primary"
  //------------------------------------------
  public static final String TOKEN_TYPE_PERSONS = "persons";
  public static final String TOKEN_TYPE_EVIDENCES = "evidences";
  public static final String TOKEN_TYPE_MEDIAS = "medias";
  public static final String TOKEN_TYPE_NOTES = "notes";
  public static final String TOKEN_TYPE_SOURCES = "sources";
  public static final String TOKEN_TYPE_STORIES = "stories";

}
