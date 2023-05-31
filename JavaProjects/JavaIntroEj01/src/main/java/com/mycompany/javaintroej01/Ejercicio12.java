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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
        que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
        segundo, sino informe que no lo son.*/
        
        Scanner read = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese el número 1");
        num1 = read.nextInt();
        System.out.println("Ingrese el número 2");
        num2 = read.nextInt();
        esMultiplo(num1, num2);
    }
    
    public static void esMultiplo(int num1, int num2){
        if(num1 % num2 == 0){
            System.out.println("El número 1: " + num1 + " es multiplo del número 2: " + num2);
        }else{
            System.out.println("El número 1 no es múltiplo del número 2");
        }
    }
}
