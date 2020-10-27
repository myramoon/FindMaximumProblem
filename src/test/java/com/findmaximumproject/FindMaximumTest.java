/* Purpose: To find maximum among 3 integers, floats and strings through 1 generic class */
package com.findmaximumproject;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    //Test cases for integer comparison
    @Test
    public void given3Integers_WithMaxAtPosition1_ShouldReturnSameIntegerAsMaximum() {
        FindMaximum findMaximum = new FindMaximum(6 ,  5 , 2);
        Integer maximum = (Integer) findMaximum.calculateMaximum();
        Assert.assertEquals(java.util.Optional.of(6), java.util.Optional.of(maximum));
    }
    @Test
    public void given3Integers_WithMaxAtPosition2_ShouldReturnSameIntegerAsMaximum() {
        FindMaximum findMaximum = new FindMaximum(5 , 6 , 2);
        Integer maximum = (Integer) findMaximum.calculateMaximum();
        Assert.assertEquals(java.util.Optional.of(6), java.util.Optional.of(maximum));
    }
    @Test
    public void given3Integers_WithMaxAtPosition3_ShouldReturnSameIntegerAsMaximum() {
        FindMaximum findMaximum = new FindMaximum(5 , 2 , 6);
        Integer maximum = (Integer) findMaximum.calculateMaximum();
        Assert.assertEquals(java.util.Optional.of(6), java.util.Optional.of(maximum));
    }

    //Test cases for float comparison
    @Test
    public void given3Floats_WithMaxAtPosition1_ShouldReturnSameFloatAsMaximum() {
        FindMaximum findMaximum = new FindMaximum( 6.4f , 5.2f , 2.5f);
        Float maximum = (Float) findMaximum.calculateMaximum();
        Assert.assertEquals(java.util.Optional.of(6.4f), java.util.Optional.of(maximum)) ;
    }
    @Test
    public void given3Floats_WithMaxAtPosition2_ShouldReturnSameFloatAsMaximum() {
        FindMaximum findMaximum = new FindMaximum(5.2f , 6.4f , 2.5f);
        Float maximum = (Float) findMaximum.calculateMaximum();
        Assert.assertEquals(java.util.Optional.of(6.4f), java.util.Optional.of(maximum));
    }
    @Test
    public void given3Floats_WithMaxAtPosition3_ShouldReturnSameFloatAsMaximum() {
        FindMaximum findMaximum = new FindMaximum(5.2f , 2.5f , 6.4f);
        Float maximum = (Float) findMaximum.calculateMaximum();
        Assert.assertEquals(java.util.Optional.of(6.4f), java.util.Optional.of(maximum));
    }

    //Test cases for string comparison
    @Test
    public void given3Strings_WithMaxAtPosition1_ShouldReturnSameStringAsMaximum() {
        FindMaximum findMaximum = new FindMaximum("pear" , "apple" , "orange");
        String maximum = (String) findMaximum.calculateMaximum();
        Assert.assertEquals("pear" ,maximum);
    }
    @Test
    public void given3Strings_WithMaxAtPosition2_ShouldReturnSameStringAsMaximum() {
        FindMaximum findMaximum = new FindMaximum("apple" , "pear" , "orange");
        String maximum = (String) findMaximum.calculateMaximum();
        Assert.assertEquals("pear" ,maximum);
    }
    @Test
    public void given3Strings_WithMaxAtPosition3_ShouldReturnSameStringAsMaximum() {
        FindMaximum findMaximum = new FindMaximum("apple" , "orange" , "pear");
        String maximum = (String) findMaximum.calculateMaximum();
        Assert.assertEquals("pear" ,maximum);
    }
}
