package Fundamentals;
import java.util.Scanner;

public class Input {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("type in your name: ");
    String name = input.nextLine();
    System.out.println("hello, " + name);
    input.close();
  }
}
