import javax.swing.*;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class main {
    public static void main(String[] args) {
        //Equal to               ==
        //Greater then           >
        //Less then              <
        //Greater then/equal to  >=
        //Less then/qual to      <=
        //Not equal to           !=
        //AND                    &&
        //OR                     ||

        //If (condition is true) {
        //   do this code
        // }

        int a = 0;
        while (a < 10) {
            System.out.println(a); // Prints the numbers from 0 to 9
            a += 1;
        }
        // Modify this program to print Humpty Dumpty riddle correctly
        System.out.println("All the king's horses and all the king's men");
        System.out.println("Humpty Dumpty had a great fall.");
        System.out.println("Humpty Dumpty sat on a wall,");
        System.out.println("Couldn't put Humpty together again.");

        int word = 5;
        // If only int then handled as int
        System.out.println(word * word);

        //if String and int present without brackets then handled as string
        System.out.println("Word added to word is " + word + " " + word);


        // if String and int present and wish to carry out arithmetic operations put in brackets

        System.out.println("Word added to word is " + (word + word));

        int c = 12;
        System.out.println(c++);
        System.out.println(c);

        int d = 12;
        System.out.println(++d);
        System.out.println(d);

        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it


        /*Scanner in = new Scanner(System.in);
        System.out.println("Enter the distance :");

        double mile = in.nextDouble();
        System.out.println(mile * 1.6);*/


        // Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

        /*Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = in.nextInt();

        if (number % 2 == 0) System.out.println("even");
        else System.out.println("odd");


        System.out.println(); */


        // Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot




        /*Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = in.nextInt();

        if (number <= 0) System.out.println("Not enough");
        else if (number == 1) System.out.println("One");
        else if (number == 2) System.out.println("Two");
        else System.out.println("A lot");

        System.out.println(); */


        // Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people


       /* Scanner in = new Scanner(System.in);
        System.out.println("Number of the girls:");

        int girls = in.nextInt();
        System.out.println("The party is excellent.");


        System.out.println("Number of the boys: ");

        int boys = in.nextInt();
        System.out.println("The party is excellent.");

        if (girls + boys >= 20 )System.out.println("Quite cool party");
        else if (girls > boys) System.out.println("Average party");
        else if (boys > girls) System.out.println("Average party");
        else System.out.println("Sausage party");

        System.out.println(); */


        // Create a program that writes this line 100 times:
// "I won't cheat on the exam!"

       /* int x = 0;
        while (x < 100) {
            System.out.println("I wont cheat on the exam!");
            x++;
        }

*/
        // Create a program that prints all the even numbers between 0 and 500

/*
        for (int i = 0; i < 500; i++) {
            if (i % 2 == 0) System.out.println(i);;
        }
*/


// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150


     /*   Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = in.nextInt();


        for (int i = 1; i <= 10; i++)
            System.out.println(number + " * " + i +
                    " = " + number * i);
*/


        // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

        /*
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int first = in.nextInt();


        System.out.println("Enter the second number:");
        int second = in.nextInt();


        if (first > second) {
            System.out.println("The second number should be bigger");
        } else {
            for (int i = first; i < second; i++) {
                System.out.println(i);

            }
        }
        */

        // Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

/*
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

*/
        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

      /*  Scanner input = new Scanner(System.in);
        System.out.println("Add a number: ");
        int number = input.nextInt();
        String k = "";

        for (int i = 1; i <= number; i++){
            k += "*";
            System.out.println(k);
        }

*/











        // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

        System.out.println("Add a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i=1; i<=number/2; i++){
            for (int j=0; j<number/2; j++) {
                System.out.print("% ");
            }
            System.out.print("\n");
            for (int k=0; k<number/2; k++) {
                System.out.print(" %");
            }
            System.out.print("\n");


        }
    }
}




























