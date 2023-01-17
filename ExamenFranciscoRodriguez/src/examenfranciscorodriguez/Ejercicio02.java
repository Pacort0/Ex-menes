package examenfranciscorodriguez;

import java.util.Scanner;

public class Ejercicio02 {
	/*Pruebas:
	 * Si se sale de rango:
	 * num = -5
	 * -> Error. El número introducido no puede ser menor que 0.
	 * 
	 * Si es 0:
	 * -> El número introducido tiene una cifra par.
	 * 
	 * Si el número es 8643:
	 * -> Ese número tiene 1 cifras impares y 3 cifras pares.
	 * Si el número es 9998234:
	 * -> Ese número tiene 4 cifras impares y 3 cifras pares.
	 * Si el número es 777:
	 * -> Ese número tiene 3 cifras impares y 0 cifras pares.
	 */

	public static void main(String[] args) {
		//Creamos las variables del programa.
		int num, cifra;
		int contadorPar = 0, contadorImpar = 0;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca por consola un número mayor o igual a 0
		System.out.print("Introduzca un número entero mayor o igual a 0: ");
		//Guardamos el valor introducido en la variable num
		num = sc.nextInt();
		
		//Si el número introducido es menor a 0, se imprime un mensaje de error
		if (num < 0) {
			System.out.print("Error. El número introducido no puede ser menor que 0.");
		}
		//Si el número introducuido es 0, se imprime un mensaje por defecto
		else if (num == 0) {
			System.out.print("El número introducido tiene una cifra par.");
		}
		else {
			//Mientras el número sea diferente de 0
			while(num != 0) {
				//Lo dividimos por 10 y guardamos el resto en la variable "cifra" (nos quedamos con las unidades)
				cifra = num % 10;
				//Guardamos el valor del número dividido entre 10
				num /= 10;
				//Comprobamos si la cifra obtenida es par o impar
				if (cifra%2 == 0) {
					//Si es par, el contador de pares se incrementa en 1
					contadorPar++;
				}
				//Si es impar, el contador de impares se incrementa en 1
				else {
					contadorImpar++;
				}
			}
			//Imprimimos el mensaje final con el valor de ambos contadores
			System.out.print("Ese número tiene " + contadorImpar + " cifras impares y " + contadorPar + " cifras pares.");
			//Cerramos el escáner
			sc.close();
		}
	}

}
