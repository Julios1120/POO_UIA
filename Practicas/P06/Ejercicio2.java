import java.io.*;
public class Ejercicio2{
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		int n[]=new int [7];
		int a;
		for(int i;i<=7;i++){
		System.out.println("ingresa valor:");
		a=Integer.parseInt(flujoE.readLine());
		}
		int mediana;
		mediana=n[]-1;
		if(mediana!=0){
			System.out.println("la mediana es:"+(mediana/2));

		}
	}
}