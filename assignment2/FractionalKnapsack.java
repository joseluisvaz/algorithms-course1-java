import java.util.Scanner;

public class FractionalKnapsack {


  private static double getOptimalValue(int capacity, int[] values, int[] weights) {
    double totalValue = 0;

    for (int i: values) {

      if (capacity == 0) {
        return totalValue;
      }

      int maxRatioKey = 0;
      double maxRatio = values[maxRatioKey] / (double) weights[maxRatioKey];

      for (int j = 1; j < values.length; j++) {
        if (weights[j] != 0) {
          double ratio = values[j] / (double) weights[j];
          if (ratio > maxRatio) {
            maxRatioKey = j;
            maxRatio = ratio;
          }
        }
      }

      int amount;
      if (weights[maxRatioKey] > capacity) {
        amount = capacity;
      } else {
        amount = weights[maxRatioKey];
      }

      totalValue = totalValue + amount * maxRatio;
      capacity = capacity - amount;
      weights[maxRatioKey] = weights[maxRatioKey] - amount;
    }

    return totalValue;
  }


  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int capacity = scanner.nextInt();
    int[] values = new int[n];
    int[] weights = new int[n];
    for (int i = 0; i < n; i++) {
      values[i] = scanner.nextInt();
      weights[i] = scanner.nextInt();
    }
    System.out.println(getOptimalValue(capacity, values, weights));
  }
}
