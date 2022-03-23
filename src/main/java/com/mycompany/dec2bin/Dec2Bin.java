/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dec2bin;

/**
 *
 * @author laura
 */
public class Dec2Bin{
    public static void main(String[] args){
       int decimal = 252222;
       String binario = "";
       while ( decimal > 0 ) {
         binario = decimal % 2 + binario;
         decimal /= 2;
       }
       System.out.println(binario);   
    }
 }