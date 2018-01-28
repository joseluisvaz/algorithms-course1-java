import java.util.*;

public class DifferentSummands {
  private static List<Integer> optimalSummands(int n) {

    List<Integer> summands = new ArrayList<>();

    return optimalSummandsInner(n-1, 1, summands);
  }

  private static List<Integer> optimalSummandsInner(int n, int l, List<Integer> acc) {

    if ( n < (2*l) ) {
      acc.add(n);
      return acc;
    }
    acc.add(l);
    return optimalSummandsInner(n-1, l+1, acc);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    List<Integer> summands = optimalSummands(n);
    System.out.println(summands.size());
    for (Integer summand : summands) {
      System.out.print(summand + " ");
    }
  }
}

