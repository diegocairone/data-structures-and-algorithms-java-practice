package com.cairone.hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class ExtraLongFactorialsTest {

    @Test
    void extraLongFactorials_nEquals5() {
        BigInteger result = ExtraLongFactorials.calculate(BigInteger.valueOf(5));
        // expected result is 5 x 4 x 3 x 2 x 1 = 120
        Assertions.assertThat(result).isEqualTo(BigInteger.valueOf(120));
    }

    @Test
    void extraLongFactorials_nEquals25() {
        BigInteger result = ExtraLongFactorials.calculate(BigInteger.valueOf(25));
        // expected result is 5 x 4 x 3 x 2 x 1 = 120
        Assertions.assertThat(result).isEqualTo(new BigInteger("15511210043330985984000000"));
    }
}