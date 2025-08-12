class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp=start;
            start=destination;
            destination=temp;
        }

        int clockwise=0;
        for (int i=start;i<destination;i++) {
            clockwise+=distance[i];
        }

        int total=0;
        for (int d : distance) {
            total+=d;
        }

        int counterClockwise=total-clockwise;

        return Math.min(clockwise,counterClockwise);
    }
}
