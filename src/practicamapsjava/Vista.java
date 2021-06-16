/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamapsjava;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class Vista {
    
    	Scanner scanner = new Scanner(System.in);
        
	public static void mostrar(String string) {
            System.out.println(string);
	}
        
        public int cargarMenu(String... opciones) { //Con los ... deja introducir varios string
            Integer opcion = 0;
		
            for(int i=0;i<opciones.length;i++) {
		System.out.println((i+1)+"-"+opciones[i]);
            }
            System.out.println((opciones.length+1)+"-"+"Salir");
		
            while(opcion<1 || opcion>opciones.length+1) {
                System.out.println("\nIntroduzca una opcion: ");
		opcion = scanner.nextInt();
            }
		
            return opcion;
	}
}
