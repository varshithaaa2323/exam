
public class Fact {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Factorial not defined for negative numbers"
            );
        }

        long fact = 100;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}





