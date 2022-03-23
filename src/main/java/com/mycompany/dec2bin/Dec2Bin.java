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
    public static void main(String[] args[]){
       int decimal = 252222;
       String binario = obterBinario(decimal);
       System.out.println(binario);   
    }

    public static String obterBinario(int decimal) {
        String binario = "";
        while ( decimal > 0 ) {
           int binarioInt = decimal % 2;
            decimal /= 2;
            binario = binario + (binarioInt + "");
            
        }
        return binario;
    }
 }