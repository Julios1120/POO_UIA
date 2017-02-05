import java.util.io*;
public class Registro extends Usuario implements usuarios{
	private String nom,prof;
	private int edd;
	
	Scanner leer = new Scanner(System.in);
	
	public Rrgistro(){
		Super();
	}
	
	public void nuevousuario(){
		System.out.println("ingresa tu nombre: ");
		nom = leer.nextLine();
		System.out.println("ingresa tu profecion: ");
		prof = leer.nextLine();
		System.out.println("ingresa tu edad: ");
		edd = leer.nextInt();
			Usuario u1 = new Usuario();
			Usuario u2 = new Usuario(nom,prof);
			Usuario u3 = new Usuario(nom,prof,edd);
	}

	public void tipousuario(int op){
		switch(){
			case 1:
				System.out.println("Usuario Experimentado");
				Rrgistro R1 = new Rrgistro();
				R1.nuevousuario();
				System.out.println("Nombre:"+Super.getNombre());
				System.out.println("profesion:"+Super.getProfesion());
				System.out.println("edad:"+Super.getEdad());
				break;
			case 2:
				System.out.println("Usuario novato");
				Rrgistro R1 = new Rrgistro();
				R1.nuevousuario();
				System.out.println("Nombre:"+Super.getNombre());
				System.out.println("Profesion:"+Super.getProfesion());
				System.out.println("edad:"+Super.getEdad()); 
		}
	}

}