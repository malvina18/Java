package Ejercicios_Ampliacion_pseudocodigo;
/*
 * EJERCICIO 1. Dise�a un algoritmo en pseudoc�digo que pida un n�mero entero y positivo al usuario.
Si el n�mero tiene ra�z cuadrada exacta el algoritmo imprimir� todos los n�meros elevados al cuadrado
desde el 1 hasta el resultado de la ra�z cuadrada de dicho n�mero.
Si no tiene ra�z cuadrada exacta el algoritmo sumar� todos los n�meros desde el 1 hasta el n�mero
dado por el usuario y presentar� por pantalla el resultado. (3 puntos)
 */

public class raiz_cuadrada_1 {

	public static void main(String[] args) {
		int numUsuario=0, raiz=1, i=1, suma=0;
		System.out.println("�Introduzca un n�mero: �"); 
		numUsuario = Entrada.entero();
		while((i^2)<numUsuario){
			i++;
		}
		if((i^2)==numUsuario) {//la ra�z de numUsuario es i, paso el valor a raiz y reinicio i a 1
			raiz=i;
			i=1;
			while(i<=raiz){
				System.out.println("El cuadradado de:"+i+" ,es:"+Math.pow(i, 2)) ;
				i++;
			}
		}else{ //numUsuario no tiene ra�z, por lo que inicializo i a 1 y voy sumando los num
			i=1;
			while(i<=numUsuario){
			suma=suma+i;
			i++;
			}
		System.out.println("La suma de todos los n�meros desde 1 hasta "+numUsuario+", es: "+suma);
		}

	}

}
