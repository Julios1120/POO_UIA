import java.util.Scanner;
public class calculadora {
	public static void main(String[] args) {
	 	
	 	Scanner reader = new Scanner(System.in);
	 	int a,b,op;
	 	int resultado;
	 	System.out.println(" Calculadora Basica de Dos Numeros\n");
	 	System.out.println(" 1: Suma\n");
	 	System.out.println(" 2: Resta\n");
	 	System.out.println(" 3: Multiplicacion\n");
	 	System.out.println(" 4: Divicon\n");
	 	System.out.println(" Seleciona una operacion");
	 	op = reader.nextInt();
	 	switch(op){
	 		case 1: 
	 		System.out.println(" Suma");
	 	    System.out.println(" Ingresa el valor de A: ");
	 	    a=reader.nextInt();
	 	    System.out.println(" Ingresa el valor de B: ");
	 	    b=reader.nextInt();
	 	    resultado=a+b;
	 	    System.out.println(" El resultado de la operacion es: "+resultado);
	 	    break;
	 	    case 2:
	 	    System.out.println(" Resta");
	 	    System.out.println(" Ingresa el valor de A: ");
	 	    a=reader.nextInt();
	 	    System.out.println(" Ingresa el valor de B: ");
	 	    b=reader.nextInt();
	 	    resultado=a-b;
	 	    System.out.println(" El resultado de la operacion es: "+resultado);
	 	    break;
	 	    case 3:
	 	    System.out.println(" Multiplicacion");
	 	    System.out.println(" Ingresa el valor de A: ");
	 	    a=reader.nextInt();
	 	    System.out.println(" Ingresa el valor de B: ");
	 	    b=reader.nextInt();
	 	    resultado=a*b;
	 	    System.out.println(" El resultado de la operacion es: "+resultado);
	 	    break;
	 	    case 4: 
	 	    System.out.println(" Divicon");
	 	    System.out.println(" Ingresa el valor de A: ");
	 	    a=reader.nextInt();
	 	    System.out.println(" Ingresa el valor de B: ");
	 	    b=reader.nextInt();
	 	    resultado=a/b;
	 	    System.out.println(" El resultado de la operacion es: "+resultado);
	 	    break;
	 	    default: System.out.println("Operacion no valida");
	 	}
	}
}
