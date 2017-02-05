 //Código de la clase Tipo de Usuario, subclase de la clase Usuario

public class TipodeUsuario extends Usuario {

    //Campos específicos de la subclase.

    private String idTipodeUsuario;

    //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase

    public TipodeUsuario (String nombre, String profesion, int edad) {

        super(nombre, profesion, edad);   
        } //Cierre del constructor

    //Métodos específicos de la subclase

    public void setidTipodeUsuario (String idUsusario) { 

    this.idTipodeUsuario = idUsusario;   }

    public String getidTipodeUsuario () { return idTipodeUsuario;   }

    public void mostrarNombreProfesionYEdad() {  
    System.out.println("nombre de Ususario: " + getNombre());
    System.out.println("su profesion es: " +  getProfesion());
    System.out.println("su Id de Ususario: " + getidTipodeUsuario());

    }

} //Cierre de la clase