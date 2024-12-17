package test;

import java.util.Scanner;

public class LevelTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Level level1 = new Level("A0001", Qualification.C);

    System.out.println(level1.getQualification());
    System.out.println(level1.getQualification().getDescription());
    System.out.println(level1.getQualification().isPassed());
    System.out.println(level1.getQualification().getQuantity());

    String id = scanner.nextLine();

    System.out.println("Enter qualification: ");
    System.out.println("1. A");
    System.out.println("2. B");
    System.out.println("3. C");
    System.out.println("4. D");
    System.out.println("5. F");

    byte qualification = scanner.nextByte();
    Qualification q = Qualification.A;

    if(qualification == 2) q = Qualification.B;
    if(qualification == 3) q = Qualification.C;
    if(qualification == 4) q = Qualification.D;
    if(qualification == 5) q = Qualification.F;

    Level newLevel = new Level(id, q);
  }
}
