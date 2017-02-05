import java.io.*;
public class Ejercicio1{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		int numeros;
		int mediana;
		do{
		System.out.println("Cuantos valores deseas ingresar:");
		numeros = Integer.parseInt(flujoE.readLine());
		if(numeros<=0)
			System.out.println("valor no valido");
		}while(numeros%2==0);	
		int x[] = new int[numeros];
		System.out.println("Introduce los valores");
		for (int i =0; i < numeros; i++){
		System.out.println("dame el valor "+ i +" = ");
		x[i] = Integer.parseInt(flujoE.readLine());
		}
		int mayor=x[0];		
		int menor=x[0];
		for(int m = 0; m < x.length; m++){ 
			if(x[m] > mayor)
				mayor = x[m]; 
			if(x[m] < menor)
				menor = x[m]; 		
		}
		mediana=x.length;
		System.out.println("la media de los valores es:"+x[mediana/2]);
		
	}
}
