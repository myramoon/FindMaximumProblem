/* Purpose: To find maximum among 3 integers*/
package com.findmaximumproject;

public class FindMaximum {
     Integer x , y , z;
    public FindMaximum(Integer x , Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Integer calculateMaximum() {
        Integer max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
}


