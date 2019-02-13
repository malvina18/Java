package Ejercicios_Ampliacion_pseudocodigo;
/*
 * EJERCICIO 1. Diseña un algoritmo en pseudocódigo que pida un número entero y positivo al usuario.
Si el número tiene raíz cuadrada exacta el algoritmo imprimirá todos los números elevados al cuadrado
desde el 1 hasta el resultado de la raíz cuadrada de dicho número.
Si no tiene raíz cuadrada exacta el algoritmo sumará todos los números desde el 1 hasta el número
dado por el usuario y presentará por pantalla el resultado. (3 puntos)
 */

public class raiz_cuadrada_1 {

	public static void main(String[] args) {
		int numUsuario=0, raiz=1, i=1, suma=0;
		System.out.println("“Introduzca un número: “"); 
		numUsuario = Entrada.entero();
		while((i^2)<numUsuario){
			i++;
		}
		if((i^2)==numUsuario) {//la raíz de numUsuario es i, paso el valor a raiz y reinicio i a 1
			raiz=i;
			i=1;
			while(i<=raiz){
				System.out.println("El cuadradado de:"+i+" ,es:"+Math.pow(i, 2)) ;
				i++;
			}
		}else{ //numUsuario no tiene raíz, por lo que inicializo i a 1 y voy sumando los num
			i=1;
			while(i<=numUsuario){
			suma=suma+i;
			i++;
			}
		System.out.println("La suma de todos los números desde 1 hasta "+numUsuario+", es: "+suma);
		}

	}

}
