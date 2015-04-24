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
public class Count7 {
    
    public int count7(int n) {
        if(n==0)
            return 0;
        
        int digit = n%10;
        if(digit == 7)
            return 1+ count7(n/10);
        else
            return 0 + + count7(n/10);
    }
}
