package FuncionesProced_Ejercicios_Iniciales_1;

import Ejercicios_Ampliacion_pseudocodigo.Entrada;
/*
 * 2. Diseñar una función que tenga como parámetros dos números, y que devuelva el máximo.
 */

public class Ejer_2_devolver_MAX {

	public static void main(String[] args) {
		int numM =0, n1 = 0, n2;
		
		 n1 = pedirNumero();
		 n2 = pedirNumero();
		
		numM = devuelveMximo(n1, n2); // llamo a la funcion devolverMximo y le paso por parametro los dos numeros qeue quiero que me diga cual es el mayor
		System.out.println("El numero maximo entre: "+n1+" y "+n2+" es: "+numM);
		
		// otra manera DE HACERLO
		//System.out.println("El numero maximo entre: "+n1+" y "+n2+" es: "+devuelveMximo(n1, n2));
	}
	
	public static int pedirNumero() {
		int n = 0;
		System.out.println("Introduzca un numero");
		n = Entrada.entero();
		
		return n;
	}
	
	public static int devuelveMximo(int a, int b) {
		int max = 0;
		
		if (a > b) {
			max = a;
		}else{
			max = b;
		}
		return max;
		
	}
}

/*
	 * if (a > b)
	 * return a
 * 
 * retur b
 * */
