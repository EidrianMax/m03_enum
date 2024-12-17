package test;

public class QualificationTest {
  public static void main(String[] args) {
    Qualification qA = Qualification.B;

    System.out.println(qA);
    System.out.println(qA.getDescription());
    System.out.println(qA.isPassed());
    System.out.println(qA.getQuantity());
  }
}
