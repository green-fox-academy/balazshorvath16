package gyak3;

public class main {

  public static void main(String[] args) {
    Animal trex = new Animal(50, 50);

    trex.setHunger();
    System.out.println(trex.hunger);

    trex.setThirst();
    System.out.println(trex.thirst);

    trex.setPlay();
    System.out.println(trex.thirst + " " + trex.hunger);

  }
}
