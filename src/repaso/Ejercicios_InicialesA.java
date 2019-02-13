package repaso;


public class Ejercicios_InicialesA {
	
	public static void main(String[] args) {
		final int NUM = 5;//15
 //1. Crea un vector tipo char que se llame vocales e inicialízalo con las vocales a,e,i,o,u
	//float[] vector; declaracion del vector sin crearlo
	//float[]vectorF1 = new float [4]; creando el vector reservanso un espacio de memoria para el mismo
		
	char [] vocales = {'a','e','i','o','u'};
		//Mostrando vocales
		System.out.println("Mostrando vocales");
		for (int i = 0; i < vocales.length; i++) {
			System.out.println("En la posicion "+i+ " esta la vocal "+vocales[i]+"\n");
		}
		
		//EJER2
		//2. Crea otro vector de la clase float que se llame vectorF1 y reserva 10 posiciones para dicho
		//vector. Pide al usuario valores para rellenar vectorF1.
		System.out.println("Ejercicio 2");
		float[]vectorF1 = new float [4]; //10
		
		for (int i = 0; i < vectorF1.length; i++) {
			System.out.println("Introduzca valores para la posicion "+ i);
			//vectorF1[i] = Entrada.flotante();//rea con casting
			System.out.println("Para la posicion "+i+" = "+vectorF1[i]+"\n");
		}
		
		System.out.println("MOSTRANDO VectorF1");
		for (int i = 0; i < vectorF1.length; i++) {
			System.out.println(vectorF1[i]+"\n");
		}
		
		//EJER3
		System.out.println("Ejercicios 3");
		//3. Crea otro vector float vectorF2 y clona los datos del vectorF1
		//float[]vectorF1 = {1.3f,2.2f,3.0f,4.8f};
		float [] vectorF2 = vectorF1.clone();
		
		System.out.println("MOSTRANDO VectorF1");
		for (int i = 0; i < vectorF1.length; i++) {
			System.out.println(vectorF1[i]+"\n");
		}
		System.out.println("MOSTRANDO Vector f2");
		for (int i = 0; i < vectorF2.length; i++) {
			System.out.println(vectorF2[i]+"\n");
		}
		
		//EJER 4
		//. Crea otro vector de la clase int llamado vectorI y reserva NUM posiciones para ese vector donde
		//NUM es una constante con valor 15.
		
		int [] vectorI = new int [NUM];
		System.out.println("Mostarndo longitud del vector");
		System.out.println(vectorI.length);
		
		//EJER 5
		/*
		 * 5. Muestra por pantalla los valores de todas las posiciones de vectorI junto con la posición en la que
	se encuentran. Luego rellena el vector con los múltiplos de 5 que quepan en el vector (empezando
	en el primero) y vuelve a mostrarlos por pantalla. */
		//lo relleno
		System.out.println("Ejercicio 5");
		for (int i=0; i<vectorI.length; i++){
			vectorI[i] = i*5;//i+5
		}
		// lo muestro
		System.out.println("Mostrando valores del vector ");
		for (int i=0; i<vectorI.length; i++){
			System.out.println("posicion "+i +" = " +vectorI[i]+"\n");
		}
		
		//EJER 6
		//6. Compara vectorF1 con vectorF2 y si son iguales muestra por pantalla que lo son y si no son
		//iguales muestra por pantalla que no lo son.
		
		System.out.println("EJERCICIO 6");
		if(vectorF1.equals(vectorF2)){
			System.out.println("Son igules");
		}else {
			System.out.println("No son iguales.\n");
		}
		
		//EJER 7
		//7. Pide al usuario valores tipo float para rellenar con nuevos valores todas las posiciones del vectorF2.
		
		for (int i = 0; i < vectorF2.length; i++) {
			System.out.println("Introduzca valore para el vectorF2 en la posiciones"+i);
			//vectorF2[i]= Entrada.flotante();
		}
		
		for (int i = 0; i < vectorF2.length; i++) {
			System.out.println("posicion "+i +" = " +vectorF2[i]+"\n");
		}
		
		//EJER 8
		System.out.println("Ejercicio 8");
		//8. Compara de nuevo vectorF1 y vectorF2 y muestra por pantalla si son iguales o no.
		if(vectorF1.equals(vectorF2)){
			System.out.println("Son igules");
		}else {
			System.out.println("No son iguales.\n");
		}
	}

}
