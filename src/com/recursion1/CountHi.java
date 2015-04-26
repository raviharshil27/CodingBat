/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.recursion1;

/**
    
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string. 

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
 * @author Harshil
 */
public class CountHi {
    
    public static void main(String args[])
    {
        System.out.println(countHi("xxhixx"));
    }
    public static int countHi(String str) {
        if(str.length() <=1)
            return 0;
        else if(str.subSequence(0, 2).equals("hi"))
            return 1+ countHi(str.substring(2));
        else
            return countHi(str.substring(1));
        
    }

}
