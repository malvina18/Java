package repaso;
/*
 * 7. Crea un vector numerosOrdenados de 10 posiciones que guarde valores aleatorios 
 * entre 1 y 50
pero teniendo en cuenta que en cada posición el número debe ser mayor o igual que las
posiciones anteriores.
 */

public class Ejer_7_Ordenar_numeros {

	public static void main(String[] args) {
		final int TAM = 5, MAX = 50, MIN = 1;//TAM = 10
		int[] numerosOrdenados = new int [TAM];
		int aleatorio = 0;

		
		
		for (int i = 0; i < numerosOrdenados.length; i++) {
			aleatorio = (int)(Math.round(Math.random()*((MAX-MIN)))+MIN);
			//System.out.println(aleatorio);
			if (i==0) {
				numerosOrdenados[i]=aleatorio;
			}else{
				if (aleatorio >= numerosOrdenados[i-1]) {
					numerosOrdenados[i]=aleatorio;
				}else {
					i--;
				}
			}
		}
			
	
		 for (int j=0; j<numerosOrdenados.length;j++){
			 System.out.println("Los numeros sin repetir son : "+numerosOrdenados[j]);
		 }
	}
}

//vectorNumOrdenado= new int [5];

//while (i<vectorNumOrdenado.length)
//{
//	
//	numero=(int)Math.floor(Math.random()*5+1);
//
//	if (i==0 || vectorNumOrdenado[i-1]<=numero)
//	{
//		vectorNumOrdenado[i]=numero;				
//		i++;					
//	}
//}
//
//for(int pos=0; pos<vectorNumOrdenado.length;pos++)
//	System.out.println("La posicion "+pos+" equivale a "+vectorNumOrdenado[pos]);
//
//}