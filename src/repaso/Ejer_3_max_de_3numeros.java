package FuncionesProced_Ejercicios_Iniciales_1;

import Ejercicios_Ampliacion_pseudocodigo.Entrada;
/*
 * 3. Ídem una versión que calcule el máximo de 3 números y lo devuelva.
 */

public class Ejer_3_max_de_3numeros {
	//static int  numM = 0;
	
	public static void main(String[] args) {
		int max =0, num1 =0 , num2 = 0, num3 = 0;
		
		num1 = pedirNumero(); // llamammos a la funcion pedir numero
		num2 = pedirNumero();
		num3 = pedirNumero();
		
//		max = numMayor(num1, num2, num3); // llamamos a la funcion numMayor
		//System.out.println("El numero mayor es :"+ max);
		
		max=maximoTresNumeros(num1, num2, num3);
		System.out.println("El numero mayor es :"+ max);
	}
	
	public static int pedirNumero() {
		int n = 0;
		System.out.println("Introduzca un numero");
		n = Entrada.entero();
		//numM ++;
		
		return n;
	}
	
//	public static int numMayor(int n1,int n2, int n3) {
//		int nMayor = 0;
//		
//		if ((n1>n2) && (n1>n3)) {
//			nMayor =n1;
//		}else{
//			if ((n2>n1) && (n2>n3)) {
//				nMayor =n2;
//			}else{
//				nMayor =n3;
//			}
//		}
//
//		return nMayor;
//	}

	
	//otra manera usuando la funcion del ejer 2
	public static int maximoDosNumeros(int a, int b){
		
		if (a>b){
			return a;
		}
		else {
			return b;
		}	
	}

	public static int maximoTresNumeros(int n1,int n2, int n3){
		
		int max=maximoDosNumeros(maximoDosNumeros(n1,n2),n3);
	
	return max;
	
	}

}
