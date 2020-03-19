import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<Integer,Character> map = new HashMap<Integer, Character>();
        if (map.size() == 0) System.out.println("empty");
        else System.out.println("not empty");

        map.put(97, 'a');
        map.put(98, 'b');
        map.put(99, 'c');
        map.put(65, 'A');
        map.put(66, 'B');
        map.put(67, 'C');

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        for (Character val : map.values()) {
            System.out.println(val);
        }

        map.put(68, 'D');

        System.out.println(map.size());

        System.out.println(map.get(99));

        map.remove(97);

        if (map.containsKey(100)) System.out.println("cool");
        else System.out.println("not cool");

        map.clear();





    }
}
