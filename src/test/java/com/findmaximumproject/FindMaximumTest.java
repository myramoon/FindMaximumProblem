/* Purpose: To find maximum among 3 integers*/
package com.findmaximumproject;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void given3Integers_WithMaxAtPosition1_ShouldReturnSameIntegerAsMaximum() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximum = findMaximum.calculateMaximumOf3Integers(6 , 5 , 2 );
        Assert.assertEquals(java.util.Optional.of(6), java.util.Optional.of(maximum));
    }
    @Test
    public void given3Integers_WithMaxAtPosition2_ShouldReturnSameIntegerAsMaximum() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximum = findMaximum.calculateMaximumOf3Integers(5 , 6 , 2);
        Assert.assertEquals(java.util.Optional.of(6), java.util.Optional.of(maximum));
    }
    @Test
    public void given3Integers_WithMaxAtPosition3_ShouldReturnSameIntegerAsMaximum() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maximum = findMaximum.calculateMaximumOf3Integers(5 , 2 , 6);
        Assert.assertEquals(java.util.Optional.of(6), java.util.Optional.of(maximum));
    }

    @Test
    public void given3Floats_WithMaxAtPosition1_ShouldReturnSameFloatAsMaximum() {
        FindMaximum findMaximum = new FindMaximum();
        Float maximum = findMaximum.calculateMaximumOf3Floats(6.4f , 5.2f , 2.5f );
        Assert.assertEquals(java.util.Optional.of(6.4f), java.util.Optional.of(maximum)) ;
    }
    @Test
    public void given3Floats_WithMaxAtPosition2_ShouldReturnSameFloatAsMaximum() {
        FindMaximum findMaximum = new FindMaximum();
        Float maximum = findMaximum.calculateMaximumOf3Floats(5.2f , 6.4f , 2.5f);
        Assert.assertEquals(java.util.Optional.of(6.4f), java.util.Optional.of(maximum));
    }
    @Test
    public void given3Floats_WithMaxAtPosition3_ShouldReturnSameFloatAsMaximum() {
        FindMaximum findMaximum = new FindMaximum();
        Float maximum = findMaximum.calculateMaximumOf3Floats(5.2f , 2.5f , 6.4f);
        Assert.assertEquals(java.util.Optional.of(6.4f), java.util.Optional.of(maximum));
    }
}
