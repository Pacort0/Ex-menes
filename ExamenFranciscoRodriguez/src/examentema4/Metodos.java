package examentema4;

public class Metodos {
	
	final static int TAMCIRCUITO = 11; //Establecemos una variable global inalterable como tamaño del tablero
	
	static int fichaJ1 = 0, fichaJ2 = 0; //Creamos las fichas de ambos jugadores como variables globales
	static int minDado, maxDado; //Creamos el dado con dos variables que indiquen el número de caras que tiene
	
	static double tiraDados () { //Creamos la función 'tiraDados'
		double tirada; //Creamos la variable 'tirada'
		
		tirada = (Math.random()*((maxDado + 1) - minDado) + minDado); //El valor de 'tirada' será un valor aleatorio entre 'maxDado' y 'minDado'
		
		return tirada; //Devolvemos el valor de la tirada
	}
	
	static void pintaPista(){ //Creamos la función 'pintaPista'
		
			for(int i = 1; i <= TAMCIRCUITO; i++) { //Imprimimos las casillas del tablero
				System.out.print("\t" + i);
			}
			System.out.println(); //Salto de línea
			for(int i = 0; i <= fichaJ1; i++) { //Imprimimos la posición del j1 en función del valor de 'fichaJ1'
				if(i < fichaJ1) {
					System.out.print("\t"); //Imprimimos espacios hasta llegar a la posición del j1
				}
				else {
					System.out.print("J1"); //Imprimimos la posición del j1
				}
			}
			System.out.println();//Salto de línea 
			for(int i = 0; i <= fichaJ2; i++) { //Imprimimos la posición del j2 siguiendo el mismo método que con el j1
				if(i < fichaJ2) {
					System.out.print("\t");
				}
				else {
					System.out.println("J2");
				}
			}
		}
	
	static Boolean sumaDeNumerosEsPrimo(int tirada1, int tirada2) { //Creamos la función 'sumaDeNumerosEsPrimo'
		int suma = tirada1 + tirada2; //Creamos la variable 'suma'
		Boolean primo = true; //Creamos la variable booleana 'primo'
		
		for(int i = suma - 1; i > 1; i--) { //Comprobamos si la suma de las tiradas da resultado primo
			if(suma % i == 0) {
				primo = false; //Si es primo, salimos del bucle for
				break;
			}
		}
		return primo; //Devolvemos el valor de 'primo'
	}
	
	void imprimeComoVaLaCarrera(String nombreJ1, String nombreJ2) { //Creamos la función 'imprimeComoVaLaCarrera'
		
		if (fichaJ1 > fichaJ2) { //Si el valor de ficha1 es mayor que el de ficha2, va ganando J1
			System.out.println("Va ganando el jugador " + nombreJ1);
		}
		else if(fichaJ2 > fichaJ1) { //Si el valor de ficha2 es mayor que el de ficha1, va ganando J2
			 System.out.println("Va ganando el jugador " + nombreJ2);
		}
		else if (fichaJ1 == fichaJ2) { //Si el valor de ficha1 es igual que el de ficha2, van empatados
			System.out.println("¡Van empatados!");
		}
	}
	
	String esGanador(String nombreJ1, String nombreJ2) { //Creamos la función 'esGanador'
		String ganador; //Creamos la variable String 'ganador'
		
		if(fichaJ1 >= TAMCIRCUITO && fichaJ2 >= TAMCIRCUITO) {
			ganador = "¡AMBOS JUGADORES HAN SOBREPASADO LA LÍNEA DE META! ¡ES UN EMPATE!\n "
					+ nombreJ1 + " y " + nombreJ2 + " se dan la mano cordialmente.";
			}
		else if(fichaJ1 >= TAMCIRCUITO) { //Si el valor de fichaJ1 supera el tamaño del circuito, ha ganado el J1
			ganador = "EL JUGADOR GANADOR ES: " + nombreJ1;
		}
		else if (fichaJ2 >= TAMCIRCUITO) { //Si el valor de fichaJ2 supera el tamaño del circuito, ha ganado el J2
			ganador = "EL JUGADOR GANADOR ES: " + nombreJ2;
		}
		else { //Si ninguno supera el tamaño del circuito, no gana nadie
			 ganador = "";
		}
		return ganador; //Devolvemos el valor de 'ganador'
	}
}
