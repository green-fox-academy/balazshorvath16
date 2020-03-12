import java.util.Arrays;

public class Doubling {

    //static double myPI = 3.14159;

    public static void main(String[] args) {

/*
        addThem(1, 2);
        System.out.println("Global" + myPI);
    }

    public static int addThem(int a, int b) {
        double smallPI = 3.14;
        myPI = myPI + 123;

        System.out.println("Local" + myPI);
        return 1;
*/
        int [] baseNum = {123};

        doublingArray(baseNum);

    }

    public static void doublingArray (int [] intArray){
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] *=2;
        }
        System.out.println(Arrays.toString(intArray));
    }

}







// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`





