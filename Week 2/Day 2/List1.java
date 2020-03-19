import java.util.ArrayList;

public class List1 {
    public static void main(String[] args) {

       /* Create an empty list which will contain names (strings)
                Print out the number of elements in the list
        Add William to the list
        Print out whether the list is empty or not
        Add John to the list
        Add Amanda to the list
        Print out the number of elements in the list
        Print out the 3rd element
        Iterate through the list and print out each name
                William
        John
                Amanda
        Iterate through the list and print
        1. William
        2. John
        3. Amanda
        Remove the 2nd element
        Iterate through the list in a reversed order and print out each name
                Amanda
        William
        Remove all elements */

        ArrayList<String> names = new ArrayList<>();

        System.out.println(names.size());

        names.add("William");

        if (names.size() == 0) System.out.println("empty");
        else System.out.println("not empty");

        names.add("John");
        names.add("Amandra");


        System.out.println(names.size());
        System.out.println(names.get(2));

        int i = 0;
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++;
        }

        for (int j = 0; j < names.size() ; j++) {
            System.out.println((j + 1) + ". " + names.get(j));

        }

        names.remove(1);


        for (int x = names.size() - 1; x >= 0; x--) {
            System.out.println( names.get(x));



        }
        names.clear();


        }



    }
