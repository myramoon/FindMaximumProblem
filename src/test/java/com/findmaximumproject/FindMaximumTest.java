/* Purpose: To find maximum among 3 integers, floats and strings through 1 generic method*/
package com.findmaximumproject;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    //Test cases for integer comparison
    @Test
    public void given3Integers_WithMaxAtPosition1_ShouldReturnSameIntegerAsMaximum() {
        Integer[] integerArray = {6 , 5 , 2};
        FindMaximum findMaximum = new FindMaximum();
        Integer maximum = (Integer) findMaximum.calculateMaximum(integerArray);
        Assert.assertEquals(java.util.Optional.of(6), java.util.Optional.of(maximum));
    }
    @Test
    public void given3Integers_WithMaxAtPosition2_ShouldReturnSameIntegerAsMaximum() {
        Integer[] integerArray = {5 , 6 , 2};
        FindMaximum findMaximum = new FindMaximum();
        Integer maximum = (Integer) findMaximum.calculateMaximum(integerArray);
        Assert.assertEquals(java.util.Optional.of(6), java.util.Optional.of(maximum));
    }
    @Test
    public void given3Integers_WithMaxAtPosition3_ShouldReturnSameIntegerAsMaximum() {
        Integer[] integerArray = {5 , 2 , 6};
        FindMaximum findMaximum = new FindMaximum();
        Integer maximum = (Integer) findMaximum.calculateMaximum(integerArray);
        Assert.assertEquals(java.util.Optional.of(6), java.util.Optional.of(maximum));
    }

    //Test cases for float comparison
    @Test
    public void given3Floats_WithMaxAtPosition1_ShouldReturnSameFloatAsMaximum() {
        Float[] floatArray = {6.4f , 5.2f , 2.5f};
        FindMaximum findMaximum = new FindMaximum();
        Float maximum = (Float) findMaximum.calculateMaximum(floatArray);
        Assert.assertEquals(java.util.Optional.of(6.4f), java.util.Optional.of(maximum)) ;
    }
    @Test
    public void given3Floats_WithMaxAtPosition2_ShouldReturnSameFloatAsMaximum() {
        Float[] floatArray = {5.2f , 6.4f , 2.5f};
        FindMaximum findMaximum = new FindMaximum();
        Float maximum = (Float) findMaximum.calculateMaximum(floatArray);
        Assert.assertEquals(java.util.Optional.of(6.4f), java.util.Optional.of(maximum));
    }
    @Test
    public void given3Floats_WithMaxAtPosition3_ShouldReturnSameFloatAsMaximum() {
        Float[] floatArray = {5.2f , 2.5f , 6.4f};
        FindMaximum findMaximum = new FindMaximum();
        Float maximum = (Float) findMaximum.calculateMaximum(floatArray);
        Assert.assertEquals(java.util.Optional.of(6.4f), java.util.Optional.of(maximum));
    }

    //Test cases for string comparison
    @Test
    public void given3Strings_WithMaxAtPosition1_ShouldReturnSameStringAsMaximum() {
        String[] stringArray = {"pear" , "apple" , "orange"};
        FindMaximum findMaximum = new FindMaximum();
        String maximum = (String) findMaximum.calculateMaximum(stringArray);
        Assert.assertEquals("pear" ,maximum);
    }
    @Test
    public void given3Strings_WithMaxAtPosition2_ShouldReturnSameStringAsMaximum() {
        String[] stringArray = {"apple" , "pear" , "orange"};
        FindMaximum findMaximum = new FindMaximum();
        String maximum = (String) findMaximum.calculateMaximum(stringArray);
        Assert.assertEquals("pear" ,maximum);
    }
    @Test
    public void given3Strings_WithMaxAtPosition3_ShouldReturnSameStringAsMaximum() {
        String[] stringArray = {"apple" , "orange" , "pear"};
        FindMaximum findMaximum = new FindMaximum();
        String maximum = (String) findMaximum.calculateMaximum(stringArray);
        Assert.assertEquals("pear" ,maximum);
    }
}
