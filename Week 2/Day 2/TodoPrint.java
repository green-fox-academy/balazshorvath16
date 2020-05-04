public class TodoPrint {

  public static void main(String[] args) {

    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    String todoText = "My todo: \n" + "- Buy milk\n" + " - Download games\n" + "\t - Diablo";
    System.out.println(todoText);


  }
}
