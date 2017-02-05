import java.io.*;
public class Ejercicio2{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		int numeros;
		int ultimoDigito;
		int numero1=0;	
                if(numero1==0){
                System.out.println("Introduce un numero entre (1-300)");
				numero1=Integer.parseInt(flujoE.readLine());
				for (int l=0;l<numeros;l++) {
				if(x[l]==numero1){
					for (l=0;l<numeros ;l++ ) {
				System.out.println("los numeros del arreglo son: "+x[l]);		
					}
					}
			}
			System.out.println("Suerte de principiante");
			}else{
				System.out.println("No se genero ese numero");
			}


		System.out.println("ingresa tamaño del arreglo:");
		numeros = Integer.parseInt(flujoE.readLine());	
		int x[] = new int[numeros];
		for (int i=0; i < numeros; i++){
		x[i]=(int)(Math.random()*(300+1)+1);
		}
		System.out.println("Introduce el ultimo digito (0-9) del numero");
		ultimoDigito=Integer.parseInt(flujoE.readLine());
		if(ultimoDigito>=0){
			if(ultimoDigito<=9){
		for(int m=0; m<numeros; m++){
            if (x[m]%10 == ultimoDigito){
                System.out.println(x[m]);
              
            }
        } else{
        	System.out.println("No se genero ningun numero que termine en ese digito");
        }          
             }
            }
	}	
}		