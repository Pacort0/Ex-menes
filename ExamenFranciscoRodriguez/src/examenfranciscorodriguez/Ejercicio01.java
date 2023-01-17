package examenfranciscorodriguez;

import java.util.Scanner;

public class Ejercicio01 {
	/*Pruebas: 
	 * Si se sale de rango: 
	 * lado = -5
	 * -> Error. No se puede crear un cuadrado con ese valor como lado.
	 * lado = 0
	 * -> Error. No se puede crear un cuadrado con ese valor como lado.
	 * 
	 * Si lado vale 4:
	 * ****
	 * *  *
	 * *  *
	 * ****
	 * 
	 * Si lado vale 2: 
	 * **
	 * **
	 */

	public static void main(String[] args) {
		//Creamos la variable "lado", donde guardaremos el valor que introduzca el usuario como lado del cuadrado
		int lado;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca un valor para el lado del cuadrado
		System.out.print("Introduzca el valor del lado del cuadrado: ");
		lado = sc.nextInt();
		
		//Si el valor es negativo o igual an 0, se imprime un mensaje de error
		if(lado <= 0) {
			System.out.print("Error. No se puede crear un cuadrado con ese valor como lado.");
		}
		//Si el valor es válido, se sigue con el programa
		else {
			/*Creamos un bucle for que nos vaya contando las líneas de '*' que imprimimos
			 * Para ello, creamos e inicializamos una variable contador 'i' igual al valor introducido por el usuario
			 * El bucle se repetirá mientras el valor de 'i' sea mayor que 0
			 * Tras cada iteración, el valor de 'i' decrementará en 1
			 */
			for(int i = lado; i>0; i--) {
				//Si el valor de 'i' es igual a la primera o última fila del cuadrado
				if(i == lado || i == 1) {
					/* Creamos un bucle for que nos imprima una línea con tantos asteriscos como valor tenga 'lado'
					 * Para ello, creamos e inicializamos una variable contador 'j' igual al valor introducido por el usuario
					 * El bucle se repetirá mientras el valor de 'j' sea mayor que 0
					 * Tras cada iteración, el valor de 'j' decrementará en 1
					 */
					for(int j = lado; j > 0; j--) {
						System.out.print("*");
					}
					//Después de imprimir la línea de '*', saltamos de línea
					System.out.println();
				}
				//Si el valor está entre 'lado' y 1
				else {
					//Imprimimos un '*' como 'pared' izquierda
						System.out.print("*");
						/* Creamos un bucle for que nos imprima los espacios necesarios entre las paredes del cuadrado
						 * Para ello, creamos e inicializamos una variable contador 'k' igual al valor de 'lado' menos 1
						 * El bucle se repetirá mientras 'k' sea mayor que 1
						 * Tras cada iteración, el valor de 'k' decrementará en 1
						 */
					for(int k = lado - 1; k > 1; k--) {
						System.out.print(" ");
					}
					//Después de imprimir los espacios, cerramos la pared derecha del cuadrado imprimiendo un '*' y saltamos de línea
					System.out.println("*");
					}
			}
		}
		//Cerramos el escáner del programa
		sc.close();
	}

}
