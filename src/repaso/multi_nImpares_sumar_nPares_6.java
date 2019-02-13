package pseudocodigo_sec_alt_repetitiva;

public class multi_nImpares_sumar_nPares_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long numP =0,  numI =1;
				
		for (int i=1;i <= 20;i++){
			if(i % 2 ==0){
				numP = numP + i;
			}else{
				numI = numI * i;
				}
		}
		
		System.out.println("La suma de los número Pares es :"+numP+"\n");
		System.out.println("La multiplcacion de los número impares es :"+numI+"\n");
	}
}
