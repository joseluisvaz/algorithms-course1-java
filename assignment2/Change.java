import java.util.*;

public class Change {
  private static int getChange(int m) {

    LinkedList<Integer> coinDenoms =
        new LinkedList<>(Arrays.asList(10, 5, 1));
    int numberOfCoins = 0;

    while (m > 0) {
      if (m >= coinDenoms.getFirst()) {
        m = m - coinDenoms.getFirst();
        numberOfCoins = numberOfCoins + 1;
      }
      else
        coinDenoms.pop();
    }

    return numberOfCoins;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    System.out.println(getChange(m));

  }
}

