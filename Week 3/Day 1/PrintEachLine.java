import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class PrintEachLine {

  public static void main(String[] args) {
    readFile();

  }

  public static void readFile() {
    Path filePath = Paths
        .get("/Users/horvathbalazs16/Desktop/Green Fox /untitledfasfsf/src/asd.txt");
    try {
      List<String> lines = Files.readAllLines(filePath);
      int counter = 0;
      for (int i = 0; i < lines.size(); i++) {
        counter++;

      }
      System.out.println(counter);

    } catch (IOException e) {
      System.out.println("no print");
      ;
    }


  }
}
