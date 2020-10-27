/* Purpose: To find maximum among 3 integers, floats and strings through 1 generic method*/
package com.findmaximumproject;

public class FindMaximum<E extends Comparable<E>> {

    //Generic method for comparing different data types
    public <E extends Comparable> E calculateMaximum(E[] inputArray) {
        E max = inputArray[0];
        if(inputArray[1].compareTo(max) > 0) {
            max = inputArray[1];
        }
        if(inputArray[2].compareTo(max) > 0){
            max = inputArray[2];
        }
        return max;
    }
}


