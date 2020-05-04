public class Urlfixer {

  private static Object String;

  public static void main(String[] args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crucial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

     /*   String[] words = url.split("/");
        words[0] = words[0] + ":";
        String asd = words[words.length - 1].substring(0, 14);
        words[words.length - 1] = asd.concat("odds");

        String newUrl = "";

        for (int i = 0; i < words.length; i++) {
            if (i == words.length -1) newUrl = newUrl + words[i];
            else newUrl = newUrl + words[i] + "/";
        }



        System.out.println(newUrl);
        */

  }
}
