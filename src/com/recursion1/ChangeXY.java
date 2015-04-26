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
public class ChangeXY {
    public static void main(String args[])
    {
        System.out.println(changeXY("xxyyy"));
    }
    public static String changeXY(String str) {
        if(str.length() == 0 )
            return "";
        if(str.charAt(0)=='x')
        {
            if(str.length() ==1)
                return "y";
            return "y" + changeXY(str.substring(1));
        }
        else
           return str.charAt(0) + changeXY(str.substring(1));
}

}
