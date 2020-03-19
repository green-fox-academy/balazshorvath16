import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list2 {
    public static void main(String[] args) {

        ArrayList<String> ListA = new ArrayList<>();
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("BlueBarries");
        ListA.add("Durian");
        ListA.add("Lyhee");

        ArrayList<String> ListB = new ArrayList<>(ListA);

        if (ListA.contains("Durian")) System.out.println("f*ck yeah");
        else System.out.println("nope");

        ListB.remove("Durian");

        ListA.add(4, "KiwiFruit");

        if (ListA.size() == ListB.size() ) System.out.println("cool");
        else System.out.println("not cool");


        System.out.println(ListA.indexOf("Avocado"));

        System.out.println(ListB.indexOf("Durian"));


        System.out.println(ListB.indexOf("Pomelo"));

        System.out.println(ListA.get(3));




    }
}
