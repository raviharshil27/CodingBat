/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion1;

/**
 *
 * @author harshil
 */
public class Count8 {

    public int count8(int n) {
        if (n == 0) {
            return 0;
        }

        int digit = n % 10;
        if (digit == 8 ) {
            if(n%100 == 88)
                return  2 + count8(n / 10);
            else
                return 1+  count8(n / 10);
        } else {
            return 0 + count8(n / 10);
        }
    }

}
