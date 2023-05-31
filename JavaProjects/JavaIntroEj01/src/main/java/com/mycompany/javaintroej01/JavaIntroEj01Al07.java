/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaintroej01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author valentinavirguezvalbuena
 */
//ESta es la clase
public class JavaIntroEj01Al07 {
    
    //Este es el metodo Main
    public static void main(String[] args) {
        /*//Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner read = new Scanner(System.in);
        //Se crea una varibale String que se utiliza para leer datos del usuario
        String name;
        //Muestra un mensaje por pantalla
        System.out.println("Ingrese tu nombre");
        //Leemos el nombre y la guardamos en la variable nombre
        name = read.next();
        //Mostramos por consola un saludo personalizado
        System.out.println("Hola Mundo! Soy " + name + " y estoy programando en Java!");*/
        /*int num1 = 5;
        int num2 = 2;
        int suma = num1 + num2;
        double division = num1 / num2;
        boolean bandera = num2 < num1;
        num1++;
        System.out.println("La suma es: " + suma);
        System.out.print("La división ");
        System.out.print("es");*/
        
        ///EJERCICIO 4
        /*Scanner read = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Ingrese su nombre");
        name = read.nextLine();
        System.out.println("Ingrese su edad");
        age = read.nextInt();
        System.out.println("Su nombre es " + name + " y tiene " + age + " años de edad.");*/
        
        //EJERCICIO 5
        /*Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);
        Boolean isReal;
        double decimal;
        String linea;
        System.out.println("Ingrese true o false");
        isReal = read.nextBoolean();
        System.out.println("Ingrese un valor decimal");
        decimal = read.nextDouble();
        System.out.println("Ingrese un caracter");
        linea = read.nextLine();
        char character = linea.charAt(0);
        System.out.println("Boolean: " + isReal + ", double: " + decimal + " y char: " + character);*/
        
        //EJERCICIO 6
        /*Scanner read = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese un número entero");
        num1 = read.nextInt();
        System.out.println("Ingrese otro número entero");
        num2 = read.nextInt();
        
        if(num1 > 25  && num2 > 25){
            System.out.println("Ambos numeros son mayores a 25");
        }else if(num1 > 25){
            System.out.println("El número 1 es mayor a 25");
        }else if(num2 > 25){
            System.out.println("El número 2 es mayor a 25");
        }else{
            System.out.println("Ningun número es mayor a 25"); 
        }*/
        
        //EJERCICIO 7
        Scanner read = new Scanner(System.in);
        int tipoMotor;
        System.out.println("Ingrese una opción de 1 a 4, para seleccionar un tipo de bomba: ");
        tipoMotor = read.nextInt();
        
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:   
                System.out.println("La bomba es una bomba de pasta alimentacia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
        
    }
}
