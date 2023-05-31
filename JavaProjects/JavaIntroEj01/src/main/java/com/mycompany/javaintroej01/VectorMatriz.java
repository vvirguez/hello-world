/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javaintroej01;

/**
 *
 * @author valentinavirguezvalbuena
 */
public class VectorMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
        //define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
        //String[] equipo = new String[5];
        //-------------------VECTOR----------------------------------------
        
        int[] vector = new int[5];
        
        //Asignar valores con FOR
        for(int i = 0; i < 5; i++){
            vector[i] = i + 3;
        }
        
        //Mostrar vector
        for(int i = 0; i < 5; i++){
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        
        //-------------------MATRIZ---------------------------------------
        String[][] matriz = new String[3][3];
        
        //Asignar valores mediante FOR
        for(int i = 0; i< 3; i++){
           for(int j = 0; j < 3; j++){
               matriz[i][j] = "A";
           }     
        }
        
        //Mostrar matriz
        for(int i = 0; i< 3; i++){
           for(int j = 0; j < 3; j++){
               System.out.print("[" + matriz[i][j] + "]");
           }     
            System.out.println("");
        }
    }
    
}
