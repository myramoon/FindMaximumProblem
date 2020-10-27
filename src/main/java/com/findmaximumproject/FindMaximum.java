/* Purpose: To find maximum among 3 integers, floats and strings through 1 generic class*/
package com.findmaximumproject;

public class FindMaximum<E extends Comparable<E>> {

    E x , y , z;

    public  FindMaximum(E x , E y ,E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //method to pass generic values to static method for comparison
    public E calculateMaximum() {
        return FindMaximum.calculateMaximum(x , y , z);
    }
    //Generic method for comparing different data types
    public static <E extends Comparable> E calculateMaximum(E x , E y , E z) {
        E max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
}


