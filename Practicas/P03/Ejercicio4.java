import java.util.Scanner;
public class Ejercicio4{
	public static void main(String[] args){
		Scanner reader=new Scanner (System.in);
		int numero=0;
		int a=0;
		int resultado=0;
		int b=0;
        numero=(int)(Math.random()*(50+1)+1);              //metodo para generar un numero aleatorio entre 50 y 1         
        System.out.println("Piensa un numero entre 1 y 50");
        System.out.println("Ingresa el numero que pensaste:");
        a=reader.nextInt();
        			try {
    				Thread.sleep(2000);                            
					} catch ( java.lang.InterruptedException ie) {
    				System.out.println(ie);
						}
			/*try {
    		Thread.sleep(2000);                            
			}	catch ( java.lang.InterruptedException ie) { Este metodo de utilizo para permitir un delay(pausa) para simular
			System.out.println(ie);                          el pensamiento de computadora y dar oportunidad al usuario de poder 
    		}												 realizar las operaciones que se piden*/
        System.out.println("Ahora a tu numero suma 2");
 	       			try {
    				Thread.sleep(2000);
					} catch ( java.lang.InterruptedException ie) {
    				System.out.println(ie);
					}
        System.out.println("Ahora a tu numero suma 4");
      	 			try {
    				Thread.sleep(2000);
					} catch ( java.lang.InterruptedException ie) {
    				System.out.println(ie);
					}
        System.out.println("Ahora a tu numero suma 5");
       				try {
    				Thread.sleep(2000);
					} catch ( java.lang.InterruptedException ie) {
    				System.out.println(ie);
					}
        System.out.println("Ahora a tu numero suma 10");
 		       		try {
    				Thread.sleep(2000);
					} catch ( java.lang.InterruptedException ie) {
   			 		System.out.println(ie);
					}						
        resultado=numero+a+2+4+5+10;
        System.out.println("El resultado de la suma con mi numero es: "+resultado);
       				try {
 	   				Thread.sleep(2000);
					} catch ( java.lang.InterruptedException ie) {
    				System.out.println(ie);
					}
        for(int i=0;i<200;i++){
       	System.out.println("Piensa");                             //ciclo para simula un tiempo de espera y limpiar la pantalla
       	}                                                         //para esconder la operacion
        			try {
    				Thread.sleep(2000);
					} catch ( java.lang.InterruptedException ie) {
    				System.out.println(ie);
					}
        System.out.println("Ahora dime cual cres que es mi numero:");
        b=reader.nextInt();
        			try {
    				Thread.sleep(2000);
					} catch ( java.lang.InterruptedException ie) {
    				System.out.println(ie);
					}			
		if(b==numero)
			System.out.println("JAAAA suerte de Principiante");
        if(b>numero){
        	System.out.println("intento 1/4");
        	System.out.println("El numero que yo pienso es menor que el tuyo");
			System.out.println("intentalo de nuevo:");
			b=reader.nextInt();
			if(b==numero)
			System.out.println("JAAAA suerte de Principiante");
					try {
    				Thread.sleep(2000);
					} catch ( java.lang.InterruptedException ie) {
    				System.out.println(ie);
					}
			if(b<numero){
			System.out.println("intento 2/4");
			System.out.println("El numero que yo pienso es mayor que el tuyo");
			System.out.println("Recuerda el resultado de la suma es:"+resultado);					
			System.out.println("intentalo una vez mas");
			b=reader.nextInt();
				
       			
					try {
    				Thread.sleep(2000);
					} catch ( java.lang.InterruptedException ie) {
   	 				System.out.println(ie);
					}
			if(b==numero)
			System.out.println("JAAAA suerte de Principiante");

				if(b>=numero){
			System.out.println("intento 3/4");
			System.out.println("El numero que yo pienso es menor que el tuyo");					
			System.out.println("intentalo una vez mas");
			b=reader.nextInt();
					try {
    				Thread.sleep(2000);
					} catch ( java.lang.InterruptedException ie) {
    				System.out.println(ie);
					}                   
			if(b<=numero){
			System.out.println("intento 4/4");
			System.out.println("Me desesperaste");
			System.out.println("Mi numero es:"+resultado);					
			System.out.println("Te hace falta practicar mas aritmetica");
			b=reader.nextInt();
					}
				}	
 			}       
        }
        if(b==numero)
			System.out.println("JAAAA suerte de Principiante");
        	if(b<numero){
        	System.out.println("intento 1/4");
        	System.out.println("El numero que yo pienso es mayor que el tuyo");
			System.out.println("intentalo de nuevo:");
			b=reader.nextInt();
			if(b==numero)
			System.out.println("JAAAA suerte de Principiante");
    				try{
    				Thread.sleep(2000);
					} catch ( java.lang.InterruptedException ie) {
    				System.out.println(ie);
					}
			if(b<numero){
			System.out.println("intento 2/4");
			System.out.println("El numero que yo pienso es mayor que el tuyo");
			System.out.println("Recuerda el resultado de la suma es:"+resultado);					
			System.out.println("intentalo una vez mas");
			b=reader.nextInt();
				
					try {
    				Thread.sleep(2000);
					} catch ( java.lang.InterruptedException ie) {
   	 				System.out.println(ie);
					}
			if(b==numero)
			System.out.println("JAAAA suerte de Principiante");

			if(b>=numero){
			System.out.println("intento 3/4");
			System.out.println("El numero que yo pienso es menor que el tuyo");					
			System.out.println("intentalo una vez mas");
			b=reader.nextInt();
					try {
    				Thread.sleep(2000);
					} catch ( java.lang.InterruptedException ie) {
    				System.out.println(ie);
					}                   
			if(b<=numero){
			System.out.println("intento 4/4");
			System.out.println("Me desesperas");
			System.out.println("Mi numero es:"+resultado);					
			System.out.println("Te hace falta practicar mas aritmetica");
			b=reader.nextInt();
			if(b==numero)
			System.out.println("JAAAA suerte de Principiante");
					}
				}
			}	
		}       	 	        	   
	}
}		   