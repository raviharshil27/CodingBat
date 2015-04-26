/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.recursion1;

/**
 *Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string. 
countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
 * @author Harshil
 */
public class countX {
    public int countX(String str) {
        if(str.length()==0)
            return 0;
        char c = str.charAt(0);
        if(c == 'x')    
            return 1 + countX(str.substring(1));
       else
            return countX(str.substring(1));
}
    
}
