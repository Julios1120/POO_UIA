import java.io.*;
public class Ejercicio1{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader flujoE = new BufferedReader(isr);
	private static double resultado;
	private static double dato1,dato2;
	public static void Suma{
		System.out.println("ingresa el dato1:");
		dato1=double.parsedouble(flujoE.readLine());
		System.out.println("ingresa el dato2:");
		dato2=double.parsedouble(flujoE.readLine());
		resultado=dato1+dato2;
		System.out.println("el resultado es: "+resultado);
	}
	public static void Resta{
		System.out.println("ingresa el dato1:");
		dato1=double.parsedouble(flujoE.readLine());
		System.out.println("ingresa el dato2:");
		dato2=double.parsedouble(flujoE.readLine());
		resultado=dato1-dato2;
		System.out.println("el resultado es: "+resultado);
		 
	}
	public static void Multiplicacion{
		System.out.println("ingresa el dato1");
		dato1=double.parsedouble(flujoE.readLine());
		System.out.println("ingresa el dato2");
		dato2=double.parsedouble(flujoE.readLine());
		resultado=dato1*dato2;
		System.out.println("el resultado es: "+resultado);
	}
	public static void Divicion{
		System.out.println("ingresa el dato1");
		dato1=double.parsedouble(flujoE.readLine());
		System.out.println("ingresa el dato2");
		dato2=double.parsedouble(flujoE.readLine());		
		resultado=dato1/dato2;
		System.out.println("el resultado es: "+resultado);
	}

	public static void main(String[] args) {
		int op;
		System.out.println("1.-Suma");
		System.out.println("2.-Resta");
		System.out.println("3.-Multiplicacion");
		System.out.println("4.-Divicion");
		System.out.println("5.-Salir");
		System.out.println("Ingresa una opcion:");
		op=Integer.parseInt(flujoE.readLine());
		switch(op){
			case 1:	
			Suma();
			break;
			case 2:
			Resta();
			break;
			case 3:
			Multiplicacion();
			break;
			case 4:
			Divicion();
			break;
			case 5:
			System.out.println("Vuelve pronto");
			break;	
		}
	}
}


