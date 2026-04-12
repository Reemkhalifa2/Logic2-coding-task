public class roundSum {
    public static Integer roundSum(Integer a,Integer b,Integer c){
        return round10(a)+round10(b)+round10(c);
    }
    static Integer round10(int num){
        int reminder = num % 10;
        return reminder >= 5 ? (num - reminder + 10) : (num - reminder);

    }
}

