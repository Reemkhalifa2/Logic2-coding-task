public class makeChocolate {
    public static int makeChocolate(int small, int big, int goal) {
        int sum = 0;
        for (int i = 0; i < big; i++) {
            if (sum + 5 <= goal) {
                sum += 5;
            }
        }
        int count = 0;
        for (int i = 0; i < small; i++) {
            if (sum + 1 <= goal) {
                sum += 1;
                count++;
            }
        }
        if (sum == goal) {
            return count;
        }

        return -1;
    }
}
