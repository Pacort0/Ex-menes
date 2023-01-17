package examentema4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int tirada1, tirada2; //Creamos las variables numéricas del programa
		String nomJ1, nomJ2; //Creamos las variables cadenas del programa
		
		Scanner sc = new Scanner(System.in); //Creamos el escáner del programa
		Metodos llama = new Metodos(); //Creamos un objeto para llamar a las funciones no estáticas de la clase Métodos
		
		System.out.print("Introduzca el valor mínimo del dado de juego: "); //Pedimos el valor mínimo del dado de juego
		Metodos.minDado = sc.nextInt(); //Guardamos dicho valor en la variable global estática de Métodos 'minDado'
		System.out.print("Introduzca el valor máximo del dado de juego: "); //Pedimos el valor máximo del dado de juego
		Metodos.maxDado = sc.nextInt(); //Guardamos dicho valor en la variable global estática de Métodos 'maxDado'
		
		System.out.print("Introduzca el nombre del primer jugador: "); //Pedimos el nombre del primer jugador
		nomJ1 = sc.next(); //Guardamos el nombre del primer jugador en la variable 'nomJ1'
		do {
			System.out.print("Introduzca el nombre del segundo jugador: "); //Pedimos el nombre del segundo jugador
			nomJ2 = sc.next(); //Guardamos el nombre del segundo jugador en la variable 'nomJ2'
			
			if(nomJ1.equals(nomJ2)) { //Si los dos nombres introducidos son iguales, imprimimos un mensaje de error
				System.out.println("Los dos nombres no pueden ser iguales.");
			}
		}
		while(nomJ1.equals(nomJ2)); //Seguiremos pidiendo el nombre del segundo jugador mientras ambos nombres sean iguales
		
		while(llama.esGanador(nomJ1, nomJ2).equals("")) { //Mientras no haya un ganador
			System.out.println("Pulse cualquier tecla para pasar a la siguiente ronda: "); //Pedimos una letra para continuar con el programa
			sc.next();
			
			//TURNO J1
			System.out.println("Turno del jugador " + nomJ1); 
				tirada1 = (int)Metodos.tiraDados(); //Llamamos a la función 'tiraDados' para obtener dos números aleatorios
				tirada2 = (int)Metodos.tiraDados(); //Guardamos cada valor obtenido en una variable 'tirada' consecutivamente
				
				System.out.println("Ha sacado un " + tirada1 + " en la primera tirada."); //Imprimimos los resultados de las tiradas
				System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada.");
				
				if(Metodos.sumaDeNumerosEsPrimo(tirada1, tirada2)) { //Si la suma de las tiradas es prima, es tirada válida
					System.out.println("¡TIRADA VÁLIDA!");
					
					Metodos.fichaJ1 +=  tirada1 + tirada2; //Asignamos el valor de la tirada válida a la ficha del J1
				}
				else {
					System.out.println("¡TIRADA NO VÁLIDA!" //Si no es válida, imprimimos que no lo es
							+ " No suma puntos porque el la suma de las dos tiradas NO ES PRIMO.");
				}
				
				//TURNO J2
				System.out.println("Turno del jugador " + nomJ2);  //Repetimos el proceso del j1 con el j2
				tirada1 = (int)Metodos.tiraDados();
				tirada2 = (int)Metodos.tiraDados();
				
				System.out.println("Ha sacado un " + tirada1 + " en la primera tirada.");
				System.out.println("Ha sacado un " + tirada2 + " en la segunda tirada.");
				
				if(Metodos.sumaDeNumerosEsPrimo(tirada1, tirada2)) {
					System.out.println("¡TIRADA VÁLIDA!");
					
					Metodos.fichaJ2 +=  tirada1 + tirada2;
				}
				else {
					System.out.println("¡TIRADA NO VÁLIDA!"
							+ " No suma puntos porque el la suma de las dos tiradas NO ES PRIMO.");
				}
				
				llama.imprimeComoVaLaCarrera(nomJ1, nomJ2); //Comprobamos quién es el jugador ganador tras esta ronda
				Metodos.pintaPista(); //Pintamos el tablero con las posiciones de ambos jugadores
		}
		
		System.out.print(llama.esGanador(nomJ1, nomJ2)); //Declaramos quién es el ganador de la carrera
		sc.close(); //Cerramos el escáner
	}

}
