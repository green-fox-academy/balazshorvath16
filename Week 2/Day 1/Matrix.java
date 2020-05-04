import org.w3c.dom.ls.LSOutput;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Matrix {

  public static void main(String[] args) {

// - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    int[][] matrtix = new int[4][4];

    for (int row = 0; row < matrtix.length; row++) {
      for (int column = 0; column < matrtix.length; column++) {
        if (row == column) {
          matrtix[row][column] = 1;
        } else {
          matrtix[row][column] = 0;
        }
      }


    }

    for (int row = 0; row < matrtix.length; row++) {
      for (int column = 0; column < matrtix.length; column++) {
        System.out.print(matrtix[row][column] + " ");
      }
      System.out.println();

    }


  }
}


