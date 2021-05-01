import java.util.function.LongUnaryOperator;

class Operator {

    public static LongUnaryOperator unaryOperator = x -> {
        long res = 0;
        if (x % 2 == 0) {
            res = x + 2;
        } else {
            res = x + 1;
        }
        return res;
    };
    
}
