package test;

public class Level {
  private String id;
  private Qualification qualification;

  public Level(String id, Qualification qualification) {
    this.id = id;
    this.qualification = qualification;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Qualification getQualification() {
    return qualification;
  }

  public void setQualification(Qualification qualification) {
    this.qualification = qualification;
  }

}
