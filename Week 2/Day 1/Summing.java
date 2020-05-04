import java.util.Scanner;

public class Summing {

  public static void main(String[] args) {

    // Create the usual class wrapper and main method on your own.
// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

    int a = 5;

    System.out.println(sum(a));

  }

  public static int sum(int sumOfInt) {
    int addition = 0;
    for (int i = 0; i <= sumOfInt; i++) {
      addition = addition + i;
    }
    return addition;
  }
}
