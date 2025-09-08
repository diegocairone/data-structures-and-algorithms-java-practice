package com.cairone.hackerrank;

import java.math.BigInteger;

/*
    Function Description
    Complete the extraLongFactorials function in the editor below. It should print the result and return.
    extraLongFactorials has the following parameter(s):
    n: an integer

    Note: Factorials of  can't be stored even in a  long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.
    We recommend solving this challenge using BigIntegers.
 */
public class ExtraLongFactorials {

    public static void extraLongFactorials(BigInteger n) {
        System.out.println(calculate(n));
    }

    public static BigInteger calculate(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return n.multiply(calculate(n.subtract(BigInteger.ONE)));
    }
}
