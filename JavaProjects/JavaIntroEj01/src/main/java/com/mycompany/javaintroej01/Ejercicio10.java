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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int num;
        for(int i = 0; i < 4; i++){
            System.out.println("Ingrese 4 números por favor");
            num = read.nextInt();
            if(num >= 1 && num <= 20){
                System.out.print(num +  " ");
                for(int j = 0; j < num; j++){
                    System.out.print("*");
                }
            }else{
                System.out.println("El número debe estar entre 1 y 20");
            }
            System.out.println(" ");
        }
    }
    
}
