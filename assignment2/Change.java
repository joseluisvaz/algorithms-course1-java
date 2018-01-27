import java.util.Scanner;

public class Change {
  private static int getChange(int m) {

    int[] denominations = {10, 5, 1};
    int c = 0;  // Index of denomination
    int numberOfCoins = 0;

    while (m > 0) {
      if (m >= denominations[c]) {
        m = m - denominations[c];
        numberOfCoins = numberOfCoins + 1;
      }
      else {
        c = c + 1;
      }

    }
    return numberOfCoins;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    System.out.println(getChange(m));

  }
}

