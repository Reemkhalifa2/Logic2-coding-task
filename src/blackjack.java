public class blackjack {
    public static Integer blackjack(Integer a, Integer b){
        if(a>21 && b> 21){
            return 0;
        }else if(a > 21 && b<=21){
            return b;
        }else if(b > 21 && a<=21){
            return a;
        }else {
            return 21-a<21-b ? a:b;
        }

    }
}
