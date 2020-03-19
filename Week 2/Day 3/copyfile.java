import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class copyfile {
    public static void main(String[] args) {

        // Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful




    }
    public static boolean Copy(String filnames) {

        Path something = Paths.get(filnames);
        try {
            List<String> okay = Files.readAllLines(something);
            Files.write(something, okay);
            return true;

        } catch (IOException e) {
            return false;

        }





    }

}
