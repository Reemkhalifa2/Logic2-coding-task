public class makeBricks {
    public static Boolean makeBricks(Integer small, Integer big, Integer goal){
        int sum = 0;
        for (int i = 0; i < big; i++) {
            if (sum + 5 <= goal) {
                sum += 5;
            }
        }

        for (int i = 0; i < small; i++) {
            if (sum + 1 <= goal) {
                sum += 1;
            }
        }
        return sum == goal;
    }

}
