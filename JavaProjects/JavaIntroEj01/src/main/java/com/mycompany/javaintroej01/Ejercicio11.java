/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaintroej01;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author valentinavirguezvalbuena
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase terminada en punto");
        frase = read.nextLine();
        System.out.print(codificar(frase));
    }
    
    private static String codificar(String frase){
        String letra;
        String fraseNueva = "";
        for(int i = 0; i < frase.length(); i++){
            letra = frase.substring(i, i+1);
            switch(letra){
                case "a":
                case "A":
                    letra = "@";
                    break;
                case "e":
                case "E":
                    letra = "#";
                    break;
                case "i":
                case "I":
                    letra = "$";
                    break;
                case "o":
                case "O":
                    letra = "%";
                    break;
                case "u":
                case "U":
                    letra = "*";
                    break;
                default:
                    letra = letra;
            }
            fraseNueva = fraseNueva.concat(letra);
        }
        frase = fraseNueva;
        return frase;
    }
    
}
