package test;

public class Computer {
  // attributes
  private String model;
  private String make;
  private Color color;
  private float price;
  
  public Computer(String model, String make, Color color, float price) {
    this.model = model;
    this.make = make;
    this.color = color;
    this.price = price;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  
}
