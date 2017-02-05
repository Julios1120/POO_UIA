
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {

		String cadenacarcter ="";
		String aux="";
		int j=1;

		Scanner reader=new Scanner(System.in);
		System.out.println("Introduce la cadena");
				cadenacarcter=reader.nextLine();
				cadenacarcter=cadenacarcter.toUpperCase(); //convertir cadena a Mayusculas
		int tamanio=cadenacarcter.length()-1; //devuelve la longitud de la cadena -1
		System.out.print(cadenacarcter);
			for (int i=tamanio;i>=0;i--,j++){
					aux="";
		int k=cadenacarcter.length()-1;
				for (int u=0;u<j;u++,k--){
						aux=cadenacarcter.charAt(k)+aux;//le caracter por caracter de la cadena mistras el ciclo se ejcuta
					}
						for (int f=0;f<i;f++,k--){
								aux=aux+cadenacarcter.charAt(f);//le caracter por caracter de la cadena mistras el ciclo se ejcuta
				}
						System.out.println(""+aux);
			}
	}
}
