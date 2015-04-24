/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion1;

/**
 *Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12). 

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3
 * @author harshil
 */
public class SumDigits {
    public static void main(String args[])
    {
        
    }
    
    /**
     * only integer
     * @param n
     * @return 
     */
    public int sumDigits(int n) {
        if(n==0)
            return 0;
        
        int digit = n%10;
        return digit+ sumDigits(n/10);
    }
    
   

}
