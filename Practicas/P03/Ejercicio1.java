public class Ejercicio1{

	 public static void main(String[] args) {
		
		int a = 10, b = 3, c = 1, d, e;
		float x, y;
		x = a/b;  							//El rsultado es: 3.0
		System.out.println(c);
		boolean resultado;                  //variable boolean para operaciones booleanas,variable no inicalizada por default es false
		resultado = a < b && c < a;         //10<3=true y 1<10=false resulrtado es false 
		System.out.println(resultado);    	//El resultado es false
		d = a + b++;						//b++ incrementa el valor de la variable antes de la operacion
		System.out.println(d);  			//El resultado es: 13
		e = b - (++a);						//++a incrementa la variable despues de la operacion 
		System.out.println(e);	 			//El resultado es: -7
		y = (float)a/b;                     // y=(float)a/b convierte el valo de las variables int en float
		System.out.println(y);       		//El resultado es 3.75
	}
}