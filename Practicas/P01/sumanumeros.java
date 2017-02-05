import java.util.Scanner;
public class sumanumeros{
	 public static void main(String[] args) {
	   
	   Scanner reader = new Scanner(System.in);
	   int n1 = 0;
       int n2 = 0;
       int suma;
 
        System.out.println("Introduce el primer número:");			
        n1 = reader.nextInt();
 
        System.out.println("Introduce el segundo número:");
        n2 = reader.nextInt();
 	    suma = n1+n2;
 	    System.out.println("La suma es:"+suma);
	}
}