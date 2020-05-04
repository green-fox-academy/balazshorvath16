public class reversee {

  public static void main(String[] args) {

    String toBeReversed = "  \n" +
        "Namespaces are one honking great idea -- let's do more of those!\n" +
        "If the implementation is easy to explain, it may be a good idea.\n" +
        "If the implementation is hard to explain, it's a bad idea.\n" +
        "Although never is often better than *right* now.\n" +
        "Now is better than never.\n" +
        "Although that way may not be obvious at first unless you're Dutch.\n" +
        "There should be one-- and preferably only one --obvious way to do it.\n" +
        "In the face of ambiguity, refuse the temptation to guess.\n" +
        "Unless explicitly silenced.\n" +
        "Errors should never pass silently.\n" +
        "Although practicality beats purity.\n" +
        "Special cases aren't special enough to break the rules.\n" +
        "Readability counts.\n" +
        "Sparse is better than dense.\n" +
        "Flat is better than nested.\n" +
        "Complex is better than complicated.\n" +
        "Simple is better than complex.\n" +
        "Explicit is better than implicit.\n" +
        "Beautiful is better than ugly.\n" +
        "\n" +
        "by Tim Peters\n" +
        "The Zen of Python";

    String reversed = " ";

    for (int i = toBeReversed.length() - 1; i >= 0; i--) {
      reversed = reversed + toBeReversed.charAt(i);

    }
    System.out.println(reversed);
  }
}
