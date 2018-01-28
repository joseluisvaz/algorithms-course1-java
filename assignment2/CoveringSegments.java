import java.util.*;

public class CoveringSegments {

  private static Integer[] optimalPoints(Segment[] segments) {

    Arrays.sort(segments, new Segment.SegmentComparator());
    List<Integer> points = new ArrayList<>();

    // Initialize first point in array
    Integer point = segments[0].end;
    points.add(point);

    for (Segment seg : segments) {
      if (!(point <= seg.end && point >= seg.start)) {
        point = seg.end;
        points.add(point);
      }
    }

    return points.toArray(new Integer[points.size()]);
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

    public static class SegmentComparator implements Comparator<Segment> {

      public int compare(Segment seg1, Segment seg2) {
        return seg1.getEnd().compareTo(seg2.getEnd());
      }
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

    Integer[] points = optimalPoints(segments);
    System.out.println(points.length);

    for (int point : points) {
      System.out.print(point + " ");
    }

  }
}
 
