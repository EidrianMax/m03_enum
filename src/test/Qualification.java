package test;

public enum Qualification {
  A("Excelent", true, (byte) 10),
  B("Realy Good", true, (byte) 8),
  C("Good", true, (byte) 6),
  D("Not Good", false, (byte) 4),
  F("Fail", false, (byte) 2);

  // attributes
  private final String description;
  private final boolean passed;
  private final byte quantity;

  // constructors
  private Qualification(String description, boolean passed, byte quantity) {
    this.description = description;
    this.passed = passed;
    this.quantity = quantity;
  }

  // methods
  public String getDescription() {
    return description;
  }

  public boolean isPassed() {
    return passed;
  }

  public byte getQuantity() {
    return quantity;
  }

}
