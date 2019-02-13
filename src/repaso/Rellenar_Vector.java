package repaso;


/*
 * 2. Crea otro vector de la clase float que se llame vectorF1 y reserva 10 posiciones para dicho
vector. Pide al usuario valores para rellenar vectorF1.
 */

public class Rellenar_Vector {

	public static void main(String[] args) {
		float[]vectorF1 = new float [4];
		
		for (int i = 0; i < vectorF1.length; i++) {
			System.out.println("Introduzca valores pra la posicion "+ i);
			//vectorF1[i] = Entrada.flotante();
			System.out.println("Para la posicion "+i+" = "+vectorF1[i]);
		}
		System.out.println("VectorF1");
		for (int i = 0; i < vectorF1.length; i++) {
			System.out.println(vectorF1[i]);
		}
	}

}
