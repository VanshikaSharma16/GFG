import java.util.*;

class Solution {

   
    static class Pair {
        int start, end;

        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public int maxMeetings(int[] start, int[] end) {
        int n = start.length;
        Pair[] meetings = new Pair[n];

        for (int i = 0; i < n; i++) {
            meetings[i] = new Pair(start[i], end[i]);
        }

        
        Arrays.sort(meetings, (a, b) -> Integer.compare(a.end, b.end));

        int count = 1;
        int lastEndTime = meetings[0].end;

        for (int i = 1; i < n; i++) {
            if (meetings[i].start > lastEndTime) {
                count++;
                lastEndTime = meetings[i].end;
            }
        }

        return count;
    }
}