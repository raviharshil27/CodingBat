/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.recursion1;

/**
 *Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared). 
powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
 * @author Harshil
 */
public class PowerN {
    
    public int powerN(int base, int n) {
        if(n==0)
            return 1;
        return base*powerN(base, n-1);
}

    
}
