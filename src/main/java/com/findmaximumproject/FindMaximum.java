/* Purpose: Add code to find maximum among 3 strings*/
package com.findmaximumproject;

public class FindMaximum {

    public Integer calculateMaximumOf3Integers(Integer x , Integer y , Integer z) {
        Integer max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

    public Float calculateMaximumOf3Floats(Float x , Float y , Float z) {
        Float max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

    public String calculateMaximumOf3Strings(String x , String y , String z) {
        String max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
}


