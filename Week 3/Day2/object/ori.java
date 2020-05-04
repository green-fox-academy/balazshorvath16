package object;

import org.w3c.dom.Text;

import java.awt.*;

public class ori {

    /* Create a PostIt class that has
a backgroundColor
a text on it
a textColor
Create a few example post-it objects:
an orange with blue text: "Idea 1"
a pink with black text: "Awesome"
a yellow with green text: "Superb!" */

  Color backgroundColor;
  String text;
  Color textColor;

  public ori(Color backgroundColor, String text, Color textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;

  }
}
