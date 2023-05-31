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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int num;
        int suma = 0;
        int contador = 0;
        do{
            System.out.println("Ingrese 20 numeros por favor");
            num = read.nextInt();
            if(num == 0){
                System.out.println("Se capturó el número cero");
            }else if(num < 0){
                continue;
            }
            suma = suma + num;
            contador++;
        }while(contador < 5);
        
        System.out.println("La suma de los números ingresados es: " + suma);
    }
    
}
