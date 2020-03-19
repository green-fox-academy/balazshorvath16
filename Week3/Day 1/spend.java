import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class spend {
    public static void main(String[] args) {

       /* Create a list with the following items.
        500, 1000, 1250, 175, 800 and 120
        Create an application which solves the following problems.
        How much did we spend?
                Which was our greatest expense?
        Which was our cheapest spending?
                What was the average amount of our spendings? */

        int spentMoney[] = {500, 1000, 1250,175, 800, 120};
        int sum = 0;

        for (int i = 0; i < spentMoney.length ; i++) {
            sum += spentMoney[i];
        }
        System.out.println("Sum =" +sum);



    }
}
