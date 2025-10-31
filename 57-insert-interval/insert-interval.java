import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int newStart = newInterval[0];
        int newEnd = newInterval[1];

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (end < newStart) {
                result.add(intervals[i]);
            } else if (start > newEnd) {
                result.add(new int[]{newStart, newEnd});
                newStart = start;
                newEnd = end;
            } else {
                newStart = Math.min(newStart, start);
                newEnd = Math.max(newEnd, end);
            }
        }

        result.add(new int[]{newStart, newEnd});

        return result.toArray(new int[result.size()][]);
    }
}
