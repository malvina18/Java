package repaso;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

public class MisFunciones
{
	public static void rellenarVectorAleatorio(int v[], int min, int max)
	{
		//me rellena el vector con valore aleatorios
		for (int i = 0; i < v.length; i++) {
			v[i] = (int)(Math.round(Math.random()*((max-min)))+min);
	
		}
	}
	
//for es solo para mostrar el valor de las posiciones de dicho vector,recorre el vector desde el inicio hasta el fin
	public static void imprimirVector(int vector[])
	{
//		for (int v : vector) System.out.println("Valor "+v+" ");
//		System.out.println();
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+",");
		}
	}
	//imprimir matrices
	public static void imprimirMatrizD(double[][] m1)
	{
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		
	}	
		
		//imprimir matrices
	public static void imprimirMatriz (int [][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//imprimir la diagonal de una matriz
	public static void imprimirDiagonalMatriz(int matriz [][])
	{
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][i]);
		}
	}
	
	// me devuelve los numeros primos
	public static boolean esPrimo(int n){
		int i=2;
		
		while(n%i!=0){
			i++;
		}
		if (n == 1) {
			return false;
		}
		if(n==i){
			return true;
		}
		else{
			return false;
		
		}
	}
	//numeros Primos
	public static boolean numeroEsPrimo(int n) {
        boolean esPrimo = true;

        //Si el numero es 1, 0 o negativo no se considera primo
        if (n <= 1)
            esPrimo = false;

        for (int i = 2; i <= (n / 2) && esPrimo; i++) {
            if (n % i == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }
	
	//primo siguiente
	public static int siguientePrimo(int numPsiguiente) { // numero menor = p1
		 
		while (!numeroEsPrimo(numPsiguiente)){// mientras el numero no sea primo aumento numPs cunado sea primo
			numPsiguiente++;    			// salgo y  devuelvo el numero primo siguiente al que paso por parametro
		}
		
		return numPsiguiente;
	}
	// numeros pares e impares
	public static boolean esPar(int num){
		//ootra forma de hacerlo
		return ((num % 2) == 0) ? true : false;
		
		/*
			if(num%2==0){
				return true;
			}else{
				return false;
			}
			*/
	}
	/*public class MyClass {
    public static void main(String args[]) {
        int x=10;
        int y=25;
        
        
        System.out.println(
            
            x > y ? x : y
            
            );
    }
    
}
	*/
	
	
	//for es solo para mostrar las posiciones de dicho vector
	public static int imprimirPosiciones(int vector[])
	{
		int pos = 0;
		for (int i = 0; i < vector.length; i++) {
			System.out.println("La posicion "+i);
			pos = i;
		}
		return pos;
	}
	
	//for es solo para mostrar las posiciones de dicho vector
	public static int imprimirPosicionDeUnValorEspecifico(int vector[], int nM)
	{
		int pos = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == nM) {
				pos = i;
			}
		}
		return pos;
	}
	//numero mayor del vector
	public static int numMaximo(int [] vMax ) {
		
		int numeroMaximo = 0;
		
		for (int i = 0; i < vMax.length; i++) {
			if (vMax[i] > numeroMaximo) {
				numeroMaximo = vMax[i];
			}
		}
		return numeroMaximo;
		
	}
	//numero menor del vector
	public static int numMinimo(int [] vMin ) {
		
		int numerominimo = 0;
		
		for (int i = 0; i < vMin.length; i++) {
			if (i == 0) {
				numerominimo = vMin[i];
			}else{
				if (vMin[i] < numerominimo) {
					numerominimo = vMin[i];
				}
			}
		}
		return numerominimo;
		
	}
	// funcion que me da numeros aleatorios y ordena el vector ascendentemente
	public static int [] ordenarVectorNumerosAscendente(int tam, int max, int min) {
		
		int[] numerosOrdenados = new int [tam];
		int aleatorio = 0;
		for (int i = 0; i < numerosOrdenados.length; i++) {
			aleatorio = (int)(Math.round(Math.random()*((max-min)))+min);
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
		return numerosOrdenados;
	}
	//ALGORITMO DE ORDENACION BURBUJA
	public static void burbujaOptimizada(int [] vec)
	{
		int buffer;
		int i, j;
		for (i = 1; i < vec.length; i++) {
			for (j = 0; j < i; j++) {
				if (vec[i] < vec[j]) {
					buffer = vec[j];
					vec[j] = vec[i];
					vec[i] = buffer;
				}
			}
		}
	}
	//algoritmo de ordenacion por insercion
	public static void insercion(int [] vec)
	{
		int i, temp, j;
		for (i = 1; i < vec.length; i++) {
			temp = vec[i];
			j = i - 1;
			while ((j >= 0) && (vec[j] > temp)) {
				vec[j + 1] = vec[j];
				j--;
			}
			vec[j + 1] = temp;
		}
	}
	//algoritmo de ordenacion por seleccion
	public static void seleccion(int[]vec)
	{
		int  pos, temp;
	
		for (int i = 0; i < (vec.length - 1); i++) {
			pos = i;
			for (int j = i + 1; j <= (vec.length - 1); j++) {
				if (vec[j] < vec[pos])
					pos = j;
			}
			if (pos != i) {
				temp = vec[pos];
				vec[pos] = vec[i];
				vec[i] = temp;
			}
		}
	}
	
	//buscando los numeros (datos) que no estan en el vector
	//busqueda binaria que me busca los datos que no estan en el vector
	 public static void busquedaBinariaMostrar (int  vec[]) {
		 int dato = 1;
		 int centro,inf=0,sup=vec.length-1;
		 while (dato <= vec.length-1){
				 while(inf<=sup){
				     centro=(sup+inf)/2;
				     if(vec[centro]==dato) {
				    	dato++;
				    	inf=0;
				    	sup=vec.length-1;
				     }else {
				    	 if(dato < vec [centro] ) {
				    		 sup=centro-1;
				    	 }else {
				    		 inf=centro+1;
				    	 }
				     }
				}
				inf=0;
				sup=vec.length-1;
				System.out.println("El numero "+dato+" no esta en el vector" );
				dato++;
		}
		 
	 }
	 // busqueda de un dato en un vector
	 public static int busquedaBinaria(int  vec[], int dato)
	 {
		 int centro,inf=0,sup=vec.length-1;
		   while(inf<=sup)
		   {
		     centro=(sup+inf)/2;
		     if(vec[centro]==dato) 
		    	 return centro;
		     else
		    	 if(dato < vec [centro] )
		        sup=centro-1;
		     else 
		       inf=centro+1;
		   }
		   return -1;
		 }
//EJEMPLO DE LEER POR TECLADO SIN LA CLASE ENTRADA	 
	/* public Vehiculo( Vehiculo copiaVehiculo) {
			//BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); para leer por teclado varias veces
			String matriNew = null;
			
			System.out.println("Introduce una nueva matricula");
			try {
				matriNew =  new BufferedReader(new InputStreamReader(System.in)).readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setMatricula(matriNew);
			this.modelo = copiaVehiculo.modelo;
			this.plazas = copiaVehiculo.plazas;
			this.disponible = copiaVehiculo.disponible;
		}*/
}
