/* Purpose: To find maximum among 3 integers*/
package com.findmaximumproject;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void given3Integers_WithMaxAtPosition1_ShouldReturnSameIntegerAsMaximum() {
        FindMaximum findMaximum = new FindMaximum(6 , 5 ,2);
        int maximum = findMaximum.calculateMaximum();
        Assert.assertEquals(6 , maximum);
    }
    @Test
    public void given3Integers_WithMaxAtPosition2_ShouldReturnSameIntegerAsMaximum() {
        FindMaximum findMaximum = new FindMaximum(5 , 6 ,2);
        int maximum = findMaximum.calculateMaximum();
        Assert.assertEquals(6 , maximum);
    }
    @Test
    public void given3Integers_WithMaxAtPosition3_ShouldReturnSameIntegerAsMaximum() {
        FindMaximum findMaximum = new FindMaximum(5 , 2 ,6);
        int maximum = findMaximum.calculateMaximum();
        Assert.assertEquals(6 , maximum);
    }
}
