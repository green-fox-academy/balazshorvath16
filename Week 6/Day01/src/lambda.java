import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lambda {

  public static void main(String[] args) {

    // Write a Stream Expression to get the even numbers from the following list:
    System.out.println("Exercise 1");

    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    numbers.stream()
        .filter(i -> i % 2 == 0)
        .forEach(System.out::println);

    System.out.println("-------------------");

    // Write a Stream Expression to get the squared value of the positive numbers from the following list:
    System.out.println("Exercise 2");
    List<Integer> numbers1 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    List<Integer> squareNumber = numbers1.stream()
        .filter(i -> i > 0)
        .map(i -> i * i)
        .collect(Collectors.toList());
    System.out.println("Squared value of the positive numbers: " + squareNumber);

    System.out.println("-------------------");

    //Write a Stream Expression to find which number
    // squared value is more then 20 from the following list:
    System.out.println("Exercise 3");

    List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);

    List<Integer> moreThen = numbers3.stream()
        .filter(i -> i * i > 20)
        .map(i -> i * i)
        .collect(Collectors.toList());
    System.out.println("Squared value is more then 20: " + moreThen);

    System.out.println("-------------------");
    //Write a Stream Expression to get the average value of the odd numbers from the following list:
    System.out.println("Exercise 4");
    List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    numbers4.stream()
        .filter(i -> i % 2 != 0)
        .mapToInt(i -> i)
        .average()
        .ifPresent(avg -> System.out.println("Average value of the odd numbers: " + avg));

    System.out.println("-------------------");

    //Write a Stream Expression to get the sum of the odd numbers in the following list:
    System.out.println("Exercise 5");
    List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

    Integer sum = numbers5.stream()
        .mapToInt(Integer::intValue)
        .sum();
    System.out.println("Sum of the odd numbers: " + sum);

    System.out.println("-------------------");

    //Write a Stream Expression to find the uppercase characters in a string!
    System.out.println("Exercise 6");
    String string = "FinD THe UpPerCaSe";

    string.chars()
        .filter(Character::isUpperCase)
        .mapToObj(Character::toChars)
        .forEach(System.out::println);

    System.out.println("-------------------");

    //Write a Stream Expression to find the strings which starts with
    // a given letter(as parameter), in the following list:
    System.out.println("Exercise 7");
    List<String> cities = Arrays
        .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");
    String givenChar = "C";
    cities.stream()
        .filter(chr -> chr.startsWith(givenChar))
        .forEach(System.out::println);

    System.out.println("-------------------");
    //Write a Stream Expression to concatenate a Character list to a string!
    System.out.println("Exercise 8");
    List<Character> chars = Arrays.asList('F', 'o', 'x', 'y');
    String string1 = chars.stream()
        .map(String::valueOf)
        .collect(Collectors.joining());
    System.out.println(string1);

    System.out.println("-------------------");

    //Write a Stream Expression to find the frequency of characters in a given string!
    System.out.println("Exercise 9");
    String someChar = "abbbcbbcccccccaa";
    long count = someChar
        .chars()
        .filter(ch -> ch == 'c')
        .count();
    System.out.println("Frequency of characters: " + count);

    System.out.println("-------------------");

    //Create a Fox class with 3 properties:
    // name, color and age Fill a list with at least 5 foxes and:
    System.out.println("Exercise 10");

    List<Fox> listOfFoxys = new ArrayList<>();
    listOfFoxys.add(new Fox("Maya", "orange", 3));
    listOfFoxys.add(new Fox("Cinnamon", "green", 8));
    listOfFoxys.add(new Fox("Ash", "green", 3));
    listOfFoxys.add(new Fox("Hunter", "orange", 3));
    listOfFoxys.add(new Fox("Mystic", "green", 2));

    listOfFoxys.stream()
        .filter(g -> g.getColor().equals("green"))
        .map(Fox::getName)
        .forEach(System.out::println);

    System.out.println("----------------------");

    listOfFoxys.stream()
        .filter(c -> c.getColor().equals("green") && c.getAge() < 5)
        .map(Fox::getName).forEach(System.out::println);

    System.out.println("----------------------");

    long countByColor = listOfFoxys.stream()
        .filter(b -> b.getColor().equals("green"))
        .count();
    System.out.println(countByColor);


  }
}


