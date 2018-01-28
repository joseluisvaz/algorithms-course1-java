import java.util.*;

public class CoveringSegments {

  private static int[] optimalPoints(Segment[] segments) {
    //write your code here

    Arrays.sort(segments, new SegmentComparator());

    int[] points = new int[2 * segments.length];
    /*
    for (int i = 0; i < segments.length; i++) {
      points[2 * i] = segments[i].start;
      points[2 * i + 1] = segments[i].end;
    }
    */
    System.out.println(segments[0].getEnd());
    return points;
  }

  private static class Segment {
    int start, end;

    Segment(int start, int end) {
      this.start = start;
      this.end = end;
    }

    public Integer getStart() {
      return this.start;
    }

    public Integer getEnd() {
      return this.end;
    }
  }

  public static class SegmentComparator implements Comparator<Segment> {
    public int compare(Segment seg1, Segment seg2) {
      return seg1.getEnd().compareTo(seg2.getEnd());
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Segment[] segments = new Segment[n];
    for (int i = 0; i < n; i++) {
      int start, end;
      start = scanner.nextInt();
      end = scanner.nextInt();
      segments[i] = new Segment(start, end);
    }
    int[] points = optimalPoints(segments);
    System.out.println(points.length);
    for (int point : points) {
      System.out.print(point + " ");
    }
  }
}
 
