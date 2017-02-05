import java.io.*;
public class Ejercicio3{
	public static void main(String[] args) throws IOException{
		float calificaciones[]=new float[10]; 
		String nombre[]=new String[10];
		String nota[]={"suspenso","bien","notables","sobresaliente"};
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		//try{
		int i;
		for (i =0; i < 3; i++) {
		System.out.println("ingresa la calificacion del alumno"+ i);
		calificaciones[i]=Float.parseFloat(flujoE.readLine());
		System.out.println("ingresa el nombre del alumno "+ i);
		nombre[i]=flujoE.readLine();
		}
		for(i=0;i<3;i++){
				if (calificaciones[i]>=0){
				 if(calificaciones[i]<=4.99)
					System.out.println(calificaciones[i]+","+nombre[i]+","+nota[0]);
					}
				}
		for(i=0;i<3;i++){
				if (calificaciones[i]>=5){
				 if(calificaciones[i]<=6.99)
					System.out.println(calificaciones[i]+","+nombre[i]+","+nota[1]);
					}
				}
		for(i=0;i<3;i++){
				if (calificaciones[i]>=7){
				 if(calificaciones[i]<=8.99)
					System.out.println(calificaciones[i]+","+nombre[i]+","+nota[2]);
					}
				}
		for(i=0;i<3;i++){
				if (calificaciones[i]>=9){
				 if(calificaciones[i]<=10)
					System.out.println(calificaciones[i]+","+nombre[i]+","+nota[3]);
					}
				}
		
			
	}

}