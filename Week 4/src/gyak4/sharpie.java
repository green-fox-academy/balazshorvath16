package gyak4;

public class sharpie {

  String color;
  float width;
  float inkAmount;

  public sharpie(String color, float width, float inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use() {
    inkAmount--;
  }
}


