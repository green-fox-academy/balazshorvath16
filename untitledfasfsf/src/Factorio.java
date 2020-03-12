public class Factorio {

    public static void main (String[] args) {

        //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

        int a = 5;

        System.out.println(fact(a));

// fact 1  i 1  = 1
        // fact 2  i  = 2
        // fact 3  i  = 6
        // fact 4  i  = 24
        // fact 5  i  = 120
    }
    public static int fact (int factorialOfInt){
        int factorio = 1;
        for (int i = 1; i <= factorialOfInt ; i++) {
            factorio = factorio * i;
        }
        return factorio;
    }
}
