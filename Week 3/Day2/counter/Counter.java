package Week3.Day2.counter;

public class Counter {

  int value;
  int initialValue;

  public Counter(int value) {
    this.value = value;
  }

  public Counter() {
    this(0);
  }

  public void add() {
    this.value++;

  }

  public int get() {
    return value;
  }

  public Counter(Integer value) {
    this.value = value;
    initialValue = value;
  }

  public void reset() {
    value = initialValue;
  }

  public void add(int num) {

  }
}






/*
and we can get() the current value
also we can reset() the value to the initial value
Check if everything is working fine with the proper test
Download CounterTest.java and place it next to your solution
If something's red in it, ALT+Enter Add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
Then run the tests with the green play button before the lines (run all of them before the classname)  */