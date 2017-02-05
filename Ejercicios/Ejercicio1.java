import java.io.*;
public class Ejercicio1{
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		int a,b;
		do{
			System.out.println("ingresa el valor de a:");
			a=Integer.parseInt(flujoE.redLine());

			System.out.println("ingresa el valor de b:");
			b=Integer.parseInt(flujoE.redLine());
		}while)(a<=0 && b<=0);
		if(a<b){
			int aux;
			aux=a;
			a=b;
			b=aux;
		
		do{
			int i;
			aux=a-1;
			if(a%5==0)
				System.out.println("el mulriplo de 5 es:"+aux);
			i++;
		}while(i==b);
		}		
		if(a>b){
			aux;
			aux=b;
			b=a;
			a=aux;
		do{
			int k;
			aux=b-1;
			if(a%5==0)
				System.out.println("el mulriplo de 5 es:"+aux);
			k++;
		}while(i==b);
		}
	}
}