package Ejercicios_Ampliacion_pseudocodigo;
/*
 * EJERCICIO 3. Dise�a un algoritmo en pseudoc�digo que pida un n�mero entero y positivo al usuario
e imprima todos los n�meros primos que dividen a dicho n�mero. Por ejemplo:
Para el n�mero 14 debe imprimir 1 , 2 y 7
Para el n�mero 25 debe imprimir 1 y 5
Para el n�mero 11 debe imprimir 1 y 11.
Haz la traza para el n�mero 14 y para el n�mero 11. (4 puntos)
 */



public class primo_divisibles_3 {

	public static void main(String[] args) {
		int num = 0,j = 2;
		System.out.println( "Introduzca un n�mero entero:"); 
		num = Entrada.entero();
		
		for (int i=1;i<=num;i++){
			if (num%i ==0){
				if (i==1){
					System.out.println("Los numeros divisibles son :"+i);
				}else{
					while(i%j!=0){
						j++	;			
					}
					if(i == j){
						System.out.println("Los numeros divisibles son :"+i);
					}
					j=2;
				}
			}
		}
	}
}
