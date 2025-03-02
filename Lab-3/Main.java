public class Main {
  public static void main(String[] args) {
    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    // Best-case scenario: pattern appears at the very beginning
    String bestCase = "ABC";

    // Measure execution time for best-case scenario
    long startTime = System.nanoTime();
    int index = match(text, bestCase);
    long endTime = System.nanoTime();
    long elapsedTimeBest = endTime - startTime;

    if (index >= 0)
      System.out.println("Best-case input matched at index " + index);
    else
      System.out.println("Best-case input unmatched");

    System.out.println("Best-case elapsed time (ns): " + elapsedTimeBest);

    // Worst-case scenario: pattern does not exist in text (ensuring full search)
    String worstCase = "XYZ";

    // Measure execution time for worst-case scenario
    startTime = System.nanoTime();
    index = match(text, worstCase);
    endTime = System.nanoTime();
    long elapsedTimeWorst = endTime - startTime;

    if (index >= 0)
      System.out.println("Worst-case input matched at index " + index);
    else
      System.out.println("Worst-case input unmatched");

    System.out.println("Worst-case elapsed time (ns): " + elapsedTimeWorst);
  }

  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }
    return -1;
  }

  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text, String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }
    return true;
  }
}
