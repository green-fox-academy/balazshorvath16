import sweets.string;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class array {

  public static void main(String[] args) {

    // - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print the third element of `numbers`

    int[] numbers = {4, 5, 6, 7};
    System.out.println("The third element" + numbers[3]);

    // - Create an array variable named `firstArrayOfNumbers`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `secondArrayOfNumbers`
//   with the following content: `[4, 5]`
// - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
//   elements than `firstArrayOfNumbers`

    int[] firstArrayOfNumbers = {1, 2, 3};
    int[] secondArrayOfNumbers = {4, 5};

    if (secondArrayOfNumbers.length > firstArrayOfNumbers.length) {
      System.out.println("secondArrayOfNumbers is longer");
    }

// - Create an array variable named `numbers`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element

    int[] numbers1 = {54, 23, 66, 12};
    System.out.println(numbers1[2] + numbers1[3]);

// - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the 8 to 4
// - Print the fourth element

    int[] number2 = {1, 2, 3, 8, 5, 6};
    for (int i = 0; i < number2.length; i++) {
      if (i == 3) {
        number2[3] = 4;
        System.out.println(number2[3]);

      }


    }
    System.out.println("the fourth element is: " + number2[4]);

    // - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 4, 5]`
// - Increment the third element
// - Print the third element

    int[] numbers3 = {1, 2, 3, 4, 5};
    //for (int i = 0; i < numbers3.length; i++) {
    //if (i == 3) {
    numbers3[3]++;
    System.out.println(numbers3[3]);

    // - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `numbers`

    int[] numbers4 = {4, 5, 6, 7};
    for (int i = 0; i < numbers4.length; i++) {
      System.out.println(numbers4[i]);

    }

    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0    0,0 0,1 0,2 0,3
    //   0 1 0 0    1,0 1,1 1,2 1,3
    //   0 0 1 0    2,0 2,1 2,2 2,3
    //   0 0 0 1    3,0 3,1 3,2 3,3
    //
    // - Print this two dimensional array to the output

        /*int[][] anArray = {{1, 0, 0, 0},
                          {0, 1, 0, 0},
                          {0, 0, 1, 0},
                          {0, 0, 0, 1}};


        int[][] anotherArray = new int[2][3];
        System.out.println(anArray[2][3]);

        for (int row = 0; row < anArray.length; row++) {

            for (int col = 0; col < anArray[row].length; col++) {
                System.out.print(anArray[row][col]);

            }
            System.out.println(); */
       /* int[][] matrix = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j==3) matrix[0][3] = 2;
                else if (i == j) matrix[i][j] = 1;
                else if (i==3) matrix[3][j] = 4;
                else matrix[i][j] = 0;
            }
        }*/

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if (i == j) {
          System.out.print(1 + " ");
        } else {
          System.out.print(0 + " ");
        }


      }
      System.out.println();

    }

    // - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

    double numlist[] = {3, 4, 5, 6, 7};
    for (int i = 0; i < numlist.length; i++) {
      numlist[i] = numlist[i] * 2;

    }

// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`

    String[][] colors = {
        {"lime", "forest green", "olive", "pale green", "spring green"},
        {"orange red", "red", "tomato"},
        {"orchid", "violet", "pink", "hot pink"}
    };

    // - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end

    String[] animals = {"koal", "pand", "zebr"};

       /* System.out.println(animals[0] + "a");
        System.out.println(animals[1] + "a");
        System.out.println(animals[2] + "a"); */

    for (int i = 0; i < animals.length; i++) {
      animals[i] = animals[i].concat("a");
      System.out.println(animals[i]);

    }

    // - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`


      /*  String[] orders = {"first", "second", "third"};
        String ord = "";
        for (int i = 0; i < orders.length; i++) {

            ord= orders[0];
            orders[0] = orders[2];
            orders[2] = ord;
        }
        System.out.println(Arrays.toString(orders));

*/
    // - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `numbers`

    int[] nums = {3, 4, 5, 6, 7};
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
      System.out.println(sum);

    }
    // - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `numbers`
// - Print the elements of the reversed `numbers`

    int[] orders = {3, 4, 5, 6, 7};
    int[] arr = new int[orders.length];
    int counter = 0;

    System.out.println("########");

    for (int i = orders.length - 1; i >= 0; i--) {
      arr[counter] = orders[i];
      System.out.println(orders[i]);
      counter++;
    }


  }
}

































































