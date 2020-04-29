package gyak;

public class gyakorlas {
    String name;
    int age;
    int heightInM;
    String eyeColor;

    public gyakorlas () {

    }

    public void speak () {
        System.out.println("Hello my name is" + name);
        System.out.println("I am" + heightInM + "m");
        System.out.println("I am " + age + "yrs old");
        System.out.println("My eye color is " + eyeColor);

    }
    public void eat () {
        System.out.println("eatimng...");
    }
    public void walk () {
        System.out.println("walking...");
    }
    public void work () {
        System.out.println("working...");
    }
}
