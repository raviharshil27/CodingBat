/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recursion1;

/**
 *
We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows. 

triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
 * @author harshil
 */
public class Triangle {
    public static void main(String args[])
    {
        System.out.println(triangle(5));   
    }
    public static  int triangle(int rows) 
    {
        if(rows == 0)
            return 0;
        
        return rows+triangle(rows-1);
  
    }

}
