package repaso;

/*
 * 6.Crea un vector numerosSinRepetir de 10 posiciones que guarde valores aleatorios entre 1 y 50
en el que los valores no estén repetidos.
 */

public class Ejer_6_ValeatorioSinRepetir {

	public static void main(String[] args) {
		final int TAM = 5, MAX = 5, MIN = 1;//10
		int[] numerosSinRepetir = new int [TAM];
		int aleatorio = 0;
		boolean seRepite= false;
		int i = 0;
		//MisFunciones.rellenarVectorAleatorio(numerosSinRepetir, 1, 50);
		//me rellena el vector con valore aleatorio
		
		while(i < numerosSinRepetir.length){
			aleatorio = (int)(Math.round(Math.random()*((MAX-MIN)))+MIN);
			System.out.println(aleatorio);
			for (int j = 0; j < numerosSinRepetir.length; j++) {
				if (aleatorio == numerosSinRepetir[j]) {
					seRepite = true;
				}
			}
		if(!seRepite){
			numerosSinRepetir[i]=aleatorio;
			i++;
		}
		else{
			seRepite=false;
		}
		
	}
		 for (int j=0; j<numerosSinRepetir.length;j++){
			 System.out.println("Los numeros sin repetir son : "+numerosSinRepetir[j]);
		 }
		
	}
}


