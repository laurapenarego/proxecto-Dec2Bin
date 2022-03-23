/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dec2bin;

/**
 * Transforma un enteiro en binario
 * @author laura
 */
public class Dec2Bin{

    /**
     * Chama ao método obTerBinario e immprime o resultado.
     * @param args
     */
    public static void main(String[] args){
       int decimal = 8;
       String binario = obterBinario(decimal);
       System.out.println(binario);   
    }

    /**
     * Obtén o valor binario a partir dun enteiro
     * @param decimal dato de tipo enteiro 
     * @return binario cadea de caracteres que representa o valor binario
     */
    public static String obterBinario(int decimal) {
        String binario = "";
        while ( decimal > 0 ) {
           int binarioInt = decimal % 2;
            decimal /= 2;
            binario = (binarioInt + "")+ binario;
            
        }
        return binario;
    }
 }