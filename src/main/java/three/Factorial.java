package three;

import java.math.BigInteger;

/**
    Find the sum of the digits in the number 100! (i.e. 100 factorial)
    {Correct answer: 648}
 */

public class Factorial {
    public int sumDigitsInFactorial(int number) {
        return sumDigitsInNumber(getFactorial(number)).intValue();
    }

    private BigInteger sumDigitsInNumber(BigInteger number) {
        if (number.compareTo(BigInteger.valueOf(0)) == 0) {
            return number;
        }
        return number
                .mod(BigInteger.valueOf(10))
                .add(sumDigitsInNumber(number.divide(BigInteger.valueOf(10))));
    }

    private BigInteger getFactorial(int number) {
        if (number <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return new BigInteger(String.valueOf(number)).multiply(getFactorial(number - 1));
        }
    }
}
