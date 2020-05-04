import javax.swing.*;
import java.util.Scanner;

public class booline {

  public static void main(String[] args) {

// Whether you are married or not as a boolean

    System.out.println(true); // Prints true
    System.out.println(false); // Prints false

    boolean imMarried = false;

    System.out.println("Im not married." + imMarried);

    int a = 3;
    // make the "a" variable's value bigger by 10

    System.out.println(a + 10);

    int b = 100;
    // make b smaller by 7

    System.out.println(b - 7);

    int c = 44;
    // please double c's value

    System.out.println(c * 2);

    int d = 125;
    // please divide by 5 d's value

    System.out.println(d / 5);

    int e = 8;
    // please cube of e's value

    Scanner accept = new Scanner(System.in);

    System.out.println("Enter the e value : ");
    int no = accept.nextInt();
    for (int count = 1; count <= no; count++) {
      System.out.println("The cube of " + count + " is: " + (count * count * count));
    }

    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)

    boolean x = (f1 > f2);
    System.out.println(x);

    if (x) {
      System.out.println("Condition is true.");
    }

    int g1 = 350;
    int g2 = 200;
    // tell if the double of g2 is bigger than g1 (print as a boolean)

    boolean y = ((g2 * 2) > g1);
    System.out.println(y);

    if (y) {
      System.out.println("Condition is true");
    }

    int h = 135798745;
    // tell if it has 11 as a divisor (print as a boolean)

    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

    int num, square;
    Scanner input = new Scanner(System.in);
    System.out.print("enter any number : ");
    num = input.nextInt();
    square = num * num;
    System.out.println("Square : " + square);

    int j = 1521;
    // tell if j is dividable by 3 or 5 (print as a boolean)
    System.out.println(((j % 5 == 0) || (j % 11 == 0)));

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables

    //1 minute = 60 seconds
    //1 hour = 60 x 60 = 3600
    //1 day = 3600 x 24 = 86400

    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    System.out.println(14 * 3600); //50400
    System.out.println(34 * 60);   //2040
    System.out.println(42);        //42

    int hour = 50400;
    int min = 2040;
    int sec = 42;

    System.out.println(86400 - 50400); //36000
    System.out.println(3600 - 2040);   //1560
    System.out.println(60 - 42);       //18

    int mennyivanhatra, ora, perc, masodperc;

    ora = 36000;
    perc = 1560;
    masodperc = 18;

    mennyivanhatra = ora + perc + masodperc;

    System.out.println("Remaining seconds:" + (mennyivanhatra));


  }

}























