package gyak3;

public class Animal {

  int hunger;
  int thirst;

  public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;

  }

  public void setHunger() {
    hunger--;
  }

  public void setThirst() {
    thirst--;
  }

  public void setPlay() {
    hunger++;
    thirst++;
  }
}

