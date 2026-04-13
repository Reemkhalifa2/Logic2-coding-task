public class evenlySpaced {
    public static Boolean evenlySpaced(Integer a,Integer b,Integer c) {
        if ((a <= b && b <= c) || (c <= b && b <= a)) {
            return (b - a) == (c - b);
        }

        if ((b <= a && a <= c) || (c <= a && a <= b)) {
            return (a - b) == (c - a);
        }

        return (c - a) == (b - c);
    }
}
