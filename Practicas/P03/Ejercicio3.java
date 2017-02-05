import java.util.Scanner;
	public class Ejercicio3{
		public static void main(String[] args) {
			Scanner reader = new Scanner (System.in);
			int a=0,b=0;
			int resultado;
			System.out.println("Ingresa un multiplo de 5 para el valor de a:");
			a=reader.nextInt();
			if(a<=0)
				System.out.println("valor no valido");

			if(a%5=0){	
				System.out.println("Ingresa un multiplo de 5 para el valor de b:");
				b=reader.nextInt();
						if(b<=0)
						System.out.println("valor no valido");		
			}
			if(b%5=0)
			resultado=a+b;
			if(resultado<=0){
				resultado=0;
 				System.out.println("El resultado es:"+resultado);
			}else{
				if(a<b)
					System.out.println("El resultado es:"+resultado);
        	}
        	if(a>b){
        		a=a+b;
        		b=a-b;
        		a=a-b;
        		System.out.println("valores intercambiados a= "+a +"y b="+b);
        		System.out.println("el restado es:"+resultado);
        	}

        }
}

        
