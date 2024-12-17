package test;

public class Test {
  public static void main(String[] args) {
    Color red = Color.RED;
    Color yellow = Color.YELLOW;

    Computer c1 = new Computer("X100", "HP", Color.CYAN, 3000);
    System.out.println(c1.getColor());
    c1.setColor(Color.RED);
    System.out.println(c1.getColor());

  }

}
