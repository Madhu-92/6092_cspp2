import java.util.Scanner;
public class StudentDetails {
  /**
   * Main method
   *
   * @param      args  The arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String name = s.next();
    int rollnumber = s.nextInt();
    float sub1 = s.nextFloat();
    float sub2 = s.nextFloat();
    float sub3 = s.nextFloat();
    Student details = new Student(name, rollnumber, sub1, sub2, sub3);
    System.out.println(details.gpa());

  }
}
class Student {
  static String name;
  static int rollnumber;
  static float sub1, sub2, sub3;

  public Student(String name, int rollnumber, float sub1, float sub2, float sub3) {
    this.name = name;
    this.rollnumber = rollnumber;
    this.sub1 = sub1;
    this.sub2 = sub2;
    this.sub3 = sub3;
  }
  float gpa() {
    return (sub1 + sub2 + sub3) / 3f;
  }
}