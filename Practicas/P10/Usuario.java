 //Clase Usuario

public class Usuario {

    private String nombre;

    private String profesion;

    private int edad;

    //Constructor

    public Usuario (){
        
    }

    public Usuario (String nombre, String profesion, int edad) {

        this.nombre = nombre;

        this.profesion = profesion;

        this.edad = edad;                   }

    //Métodos

    public String getNombre () { return nombre;  }

    public String getProfesion () { return profesion;  }

    public int getEdad () { return edad;   }

} //Cierre de la clase