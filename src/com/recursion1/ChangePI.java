/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.recursion1;

/**
 *
 * @author Harshil
 */
public class ChangePI {
    public  static void main(String args[])
    {
        System.out.println(changePi("sadasPId"));
    }
    public static String changePi(String str) {
        
        if(str.length()<=1)
            return str;
        if(str.substring(0, 2).equalsIgnoreCase("pi")){
            if(str.length() ==2 )
                return "3.14";
            return "3.14"+changePi(str.substring(2));
        }
        else
            return str.charAt(0)+ changePi(str.substring(1));
}

    
}
