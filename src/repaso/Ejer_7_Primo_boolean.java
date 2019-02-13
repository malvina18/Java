package FuncionesProced_Ejercicios_Iniciales_1;

import Ejercicios_Ampliacion_pseudocodigo.Entrada;

/*
 * 7. Realizar una función que dado un número entero devuelva un booleano para indicar si el
número es primo o no.
 */

public class Ejer_7_Primo_boolean {

	public static void main(String[] args) {
		int num = 0;
		boolean Primo = false;
		
		num = pedirNumero(); // llamo  a la funcion pedir numero
		Primo = esPrimoElNumero(num); // llamo  ala funcion creada y le paso el numero el cual me va a decir si es true o false
		
		if (Primo) { // si es primo es verdadero entro y lo muestro  
			System.out.println("El numero introducido : "+num+" es primo");
		}else{ //sino muestro que no lo es
			System.out.println("El numero introducido: "+num+" no es primo");
		}
		
	}
	
	public static int pedirNumero() {
		int n  = 0;
		System.out.println("Introduzca un numero");
		n = Entrada.entero();
		
		return n;
	}
	// metodo para buscar el numero primo
	public static boolean esPrimoElNumero(int n) {
		int i = 2;
		//boolean esPrimo = false;
		
		while (n%i!=0 && i<=n/2){ //codigo de numero primo
			i++;
		}
		if (i>n/2){
			//esPrimo = true;
			return true;
		}
		//return esPrimo;
		return false;
		
	}
}
