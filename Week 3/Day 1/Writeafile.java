import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Writeafile {

  public static void main(String[] args) {

    // Write a function that is able to manipulate a file
    // By writing your name into it as a single line
    // The file should be named "my-file.txt"
    // In case the program is unable to write the file,
    // It should print the following error message: "Unable to write file: my-file.txt"
    writetoafile();

  }

  public static void writetoafile() {
    List<String> content = new ArrayList<>();
    content.add("Balazs Horvath");
    Path asd = Paths.get("/Users/horvathbalazs16/Desktop/Green Fox /untitledfasfsf/src/asd.txt");
    try {
      Files.write(asd, content);
    } catch (IOException e) {
      System.out.println("Problem");
    }
  }
}