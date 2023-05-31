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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
        String[] equipo = new String[5];
        String name;
        //Asignar valores con FOR
        for(int i = 0; i < 5; i++){
            Scanner read = new Scanner(System.in);
            System.out.println("Inserte los nombres de los compañeros de equipo 1 a 1");
            name = read.nextLine();
            equipo[i] = name;
        }
        
        //Mostrar vector
        for(int i = 0; i < 5; i++){
            System.out.print("[" + equipo[i] + "]");
        }
        System.out.println("");
    }
    
}
