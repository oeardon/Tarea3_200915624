/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg3;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Oscar Estuardo Ardón Castillo
 */
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        while(!salir){
            System.out.println("\nTarea 3\n");
            System.out.println("200915624\n");
            System.out.println("1. Usuarios");
            System.out.println("2. Palíndromo");
            System.out.println("3. Salir");
            
            System.out.println("Elija una opción");
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                    Scanner sn1 = new Scanner(System.in);
                    int opcion1;
                    boolean salir1 = false;
                    
                    while(!salir1){
                        System.out.println("Menú de Usuarios\n");
                        System.out.println("1. Ingresar Usuarios");
                        System.out.println("2. Mostrar todos los usuarios");
                        System.out.println("3. Mostrar usuario personalizado");
                        System.out.println("4. Menú Principal");
                        System.out.println("5. Salir");
                        
                        System.out.println("Elija una opción");
                        opcion1 = sn1.nextInt();
                        
                        switch(opcion1) {
                            case 1:
                                Scanner sn11 = new Scanner(System.in);
                                String nombre;
                                
                                Vector<String> usuario = new Vector<>(5);
                                System.out.println("Ingresar Usuarios");
                                for (int j=0; j<5; j++){
                                    nombre = sn11.nextLine();
                                    usuario.add(nombre);
                                }
                                break;
                            case 2:
                                System.out.println("Mostrar todos los usuarios\n");
                                /*for(int k=0; k < usuario.size(); k++){
                                System.out.print((k+1) +". " +usuario.get(k));
                                } */
                                break;
                            case 3:
                                System.out.println("Mostrar usuario personalizado\n");
                                break;
                            case 4:
                                salir1 = true;
                                break;
                            case 5:
                                salir1 = true;
                                salir = true;
                                break;
                            default:
                                System.out.println("Ingrese un número entre 1 y 5");
                        }
                    }
                    break;    
                case 2:
                    String palabra1;
                    Scanner sn2 = new Scanner(System.in);
                        
                    System.out.println("PALÍNDROMO\n");
                    System.out.println("Ingrese una palabra o frase");
                    palabra1 = sn2.nextLine();
                    String palabra2 = palabra1.toLowerCase().replace(" ","");
                    
                    int i, inicio, medio, fin;
                    int largo = palabra2.length();
                    
                    inicio = 0;
                    fin = largo - 1;
                    medio = (inicio + fin)/2;
                    
                    for (i = inicio; i <= medio; i++) {
                        if (palabra2.charAt(inicio) == palabra2.charAt(fin)) {
                            inicio++;
                            fin--;
                        }
                        else {
                            break;
                        }
                    }
                    if (i == medio + 1) {
                        System.out.println("Es palíndromo");
                    }
                    else {
                        System.out.println("No es palíndromo");
                    }
                    break;
                case 3:
                   salir=true;
                   break;
                default:
                   System.out.println("Ingrese un número entre 1 y 3");
            }
        }
    }
}