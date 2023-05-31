/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaintroej01;

import java.util.Scanner;

/**
 *
 * @author valentinavirguezvalbuena
 */
public class WhileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        double nota;
        
        System.out.println("Ingrese la nota obtenida entre 0 y 10");
        nota = read.nextDouble();
        
        while(nota > 10 || nota < 0){
            System.out.println("Ingrese una nota válida, por favor");
            nota = read.nextDouble();
        }
    }
    
}
