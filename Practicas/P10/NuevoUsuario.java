import java.util.io.*;
public class NuevoUsuario extends Usuario{
	private String nombre,profecion;
	private int edad;
	Scanner leer = new Scanner(System.in);

	public NuevoUsuario(String nombre, String profecion, int edad){
		super(nombre,profecion,edad);
	}

	public void usuarionuevo(){
		System.out.println("Ingresa tu nombre: "); nombre = leer.nextInt();
		System.out.println("Ingresa tu profecion: "); profecion = leer.nextInt();
		System.out.println("Ingresa tu edad: "); edad = leer.nextInt();

		NuevoUsuario obj1 = new NuevoUsuario(nombre,profecion,edad);
	}
}	