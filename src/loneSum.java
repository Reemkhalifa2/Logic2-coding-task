public class loneSum {
    public static Integer loneSum(Integer a,Integer b,Integer c){
        if (a == b && b == c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (a == c) {
            return b;
        } else if (b == c) {
            return a;
        }

        return a + b + c;
    }
}
