package ejer_2_Pseudocodigo_Java;
/*
 * 4. Diseña un algoritmo en PSEUDOCÓDIGO y su correspondiente código en iAVA, que ante
dos números enteros positivos (leídos por teclado) nos diga si el mayor contiene al menor.
Si num1 = 34 y num2 = 2348 debe contestar verdadero.
Si num1 = 3 y num2 = 2348 debe contestar verdadero.
Si num1 = 43 y num2 = 2348 debe contestar falso.
Si num1 = 1 y num2 = 2348 debe contestar falso.
Si num1 = 23 y num2 = 2348 debe contestar verdadero.
 */

public class ElMayor_que_contieneAlMenor_4 {
	
	public static void main(String[] args) {
		int  num =0 , num1 = 0, num2 = 0, resto = 0, numPosiciones = 0, contadorCifras = 0, nMayor =0,nMenor =0, numElevado = 0 ;
		
		// primero pedimos al usuario un numero y luego otro
		System.out.println("Introduzca un numero menor");
		num1= Entrada.entero();  // 34 
		System.out.println("Introduzca un numero mayor de 4 cifras");
		num2= Entrada.entero(); //2348
		//Comprobamos c numero es el menor y cual es el mayor
		if (num1 > num2) {
			nMayor = num1;
			nMenor = num2;
		}else{
			nMenor = num1;
			nMayor = num2;
		}
		System.out.println("Mayor :"+nMayor+" menor: "+nMenor);
		
		//comprabamos cuantas cifras tiene el numero
		while (nMenor>0){
			nMenor = nMenor/10;
			contadorCifras++;
		}
		System.out.println("El numero menor tiene:"+ contadorCifras+" cifras");
		
		//Segun el numero de cifra que tenga el numero menor,hacemos el modulo de 10 elevado a ese numero
		numElevado =  (int) Math.pow(10, contadorCifras);
		
		System.out.println(numElevado);
		num = nMayor% numElevado; //48
		num = nMayor% numElevado;
		
		

	}

}
