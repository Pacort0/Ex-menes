package examenfranciscorodriguez;

import java.util.Scanner;

public class Ejercicio03 {
	/*Pruebas:
	 * Si alguna de las notas está fuera de rango:
	 * notaPractica: -6
	 * notaTeoria: 8
	 * notaProblemas: 4
	 * -> Error. Los valores de las notas introducidas deben estar en un rango entre 0 y 10.
	 * notaPractica: 6
	 * notaTeoria: 84
	 * notaProblemas: 4
	 * -> Error. Los valores de las notas introducidas deben estar en un rango entre 0 y 10.
	 * 
	 * Si lola: 5'1, pepe: 5 y juan: 7'6 (medias):
	 * notaPractica (respectivamente): 5, 5, 9
	 * notaTeoria (respectivamente): 4, 5, 8
	 * notaProblemas (respectivamente): 6, 5, 7
	 * 
	 * -> El alumno con la mayor nota es juan, con una nota final de 7.6000000000000005
	 *    El alumno con la menor nota es pepe, con una nota final de 5.0
	 *    La media de notas de todos los alumnos introducidos es 5.8999999999999995
	 */

	public static void main(String[] args) {
		//Creamos las variables 'String' del programa
		String nombre, mejorAlumno = "", peorAlumno = "";
		//Creamos las variables donde guardaremos las notas de los alumnos, así como un contador para contar cada alumno registrado
		int notaPractica, notaTeoria, notaProblemas, contador = 0;
		//Creamos las variables para guardar la nota final de cada alumno, la media, la nota máxima del curso y la mínima
		double notaFinal, media = 0, notaMax = 0, notaMin = 10;
		//Creamos las variables para guardar las notas ponderadas
		double practica, problemas, teoria;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario que introduzca el nombre del primer alumno
		System.out.print("\nIntroduzca el nombre del alumn@: ");
		//Guardamos el nombre del alumno en la variable "nombre"
		nombre = sc.next();
		
		//Pedimos al usuario que introduzca las notas del alumno en cada área
		do {
			//Primero, pedimos que se introduzca la nota de las prácticas
			System.out.print("Introduzca la nota de las prácticas del alumn@: ");
			//Guardamos el valor en 'notaPractica'
			notaPractica = sc.nextInt();
			//Después, pedimos que se introduzca la nota de Teoría
			System.out.print("Introduzca la nota de teoría del alumn@: ");
			//Guardamos el valor en 'notaTeoria'
			notaTeoria = sc.nextInt();
			//Por último, pedimos que se introduzca la nota de Problemas
			System.out.print("Introduzca la nota de problemas del alumn@: ");
			//Guardamos el valor en 'notaProblemas'
			notaProblemas = sc.nextInt();
			
			//Si alguna de las notas introducidas se encuentra fuera de rango, se imprime un mensaje de error y se vuelven a pedir
			if(notaPractica < 0 || notaPractica > 10 || notaTeoria < 0 || notaTeoria > 10 || notaProblemas < 0 || notaProblemas > 10) {
				System.out.println("\nError. Los valores de las notas introducidas deben estar en un rango entre 0 y 10.");
				continue;
			}
			//Si los valores de las notas son correctos
			else {
				//Se incrementa el contador de alumnos registrados en 1
				contador++;
				//Calculamos el valor de cada nota ponderada
				practica = notaPractica * 0.1;
				teoria = notaTeoria * 0.4;
				problemas = notaProblemas * 0.5;
				
				//Sumamos todas las notas resultantes y las guardamos en 'notaFinal'
				notaFinal = practica + teoria + problemas;
				
				//Si la notaFinal de este alumno es superior a la nota máxima guardada hasta ahora
				if(notaFinal > notaMax) {
					//Guardamos la nota final en la variable 'notaMax'
					notaMax = notaFinal;
					//Guardamos el nombre del alumno como mejor alumno
					mejorAlumno = nombre;
				}
				//Si la nota final de este alumno es inferior a la nota máxima guardada hasta ahora
				if (notaFinal < notaMin){
					//Guardamos la nota final en la variable 'notaMin'
					notaMin = notaFinal;
					//Guardamos el nombre del alumno como peor alumno
					peorAlumno = nombre;
				}
				//Sumamos la nota del alumno a la suma de notas actual
				media += notaFinal;
			}
			//Pedimos al usuario que introduzca un nuevo alumno, guardando el nombre en la variable 'nombre'
			System.out.print("\nSi desea dejar de introducir nombres, introduzca " + "0" + " en el nombre");
			System.out.print("\nIntroduzca el nombre del alumn@: ");
			nombre = sc.next();
		}
		//Todo esto se repetirá mientras 'nombre' no valga '0'
		while(!nombre.equals("0"));
		
		//Una vez salimos del bucle
		
		//Calculamos la media de las notas
		media /= contador;
		
		//Imprimimos los resultados del programa: El mejor alumno y su nota, el peor alumno y su nota y la media de notas de todos los alumnos
		System.out.println("El alumno con la mayor nota es " + mejorAlumno + ", con una nota final de " + notaMax);
		System.out.println("El alumno con la menor nota es " + peorAlumno + ", con una nota final de " + notaMin);
		System.out.println("La media de notas de todos los alumnos introducidos es " + media);
		//Cerramos el escáner
		sc.close();
	}

}
