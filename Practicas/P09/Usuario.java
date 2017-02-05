class Usuario{

	private String nombre;
	private String telefono;
	private String direccion;
	private String mail;
	private String nickname;
	private String fechaNacimiento;
	
	public Usuario(){
		setnombre("No asignado");
		settelefono("No asignado");
		setdireccion("No asignado");
		setmail("No asignado");
		setnickname("No asignado");
		setfechaNacimiento("No asignado");
	}
	public Usuario(String cnombre, String cnickname, String cmail){

		setnombre(cnombre);
		settelefono("No asignado");
		setdireccion("No asignado");
		setmail(cmail);
		setnickname(cnickname);
		setfechaNacimiento("No asignado");

	}
	public Usuario(String cnombre, String cnickname, String cmail, String ctelefono, String cdireccion, String cfechaNacimiento){

		setnombre(cnombre);
		settelefono(ctelefono);
		setdireccion(cdireccion);
		setmail(cmail);
		setnickname(cnickname);
		setfechaNacimiento(cfechaNacimiento);

	}


	public void setnombre(String inombre){
		nombre = inombre;
	}
	public void settelefono(String itelefono){
		telefono = itelefono;
	}
	public void setdireccion(String idireccion){
		direccion = idireccion;
	}
	public void setmail(String imail){
		mail =  imail;
	}
	public void setnickname(String inickname){
		nickname = inickname;
	}
	public void setfechaNacimiento(String ifechaNacimiento){
		fechaNacimiento = ifechaNacimiento;
	}

	public String getnombre(){
		return nombre;
	}
	public String gettelefono(){
		return telefono;
	}
	public String getdireccion(){
		return direccion;
	}
	public String getmail(){
		return mail;
	}
	public String getnickname(){
		return nickname;
	}
	public String getfechaNacimiento(){
		return fechaNacimiento;
	}

	public static void main(String[] args) {
		Usuario usr1 = new Usuario();
		System.out.println(usr1.getnombre());
		System.out.println(usr1.gettelefono());
		System.out.println(usr1.getdireccion());
		System.out.println(usr1.getmail());
		System.out.println(usr1.getnickname());
		System.out.println(usr1.getfechaNacimiento());

		Usuario usr2 = new Usuario("LALO","LALOCM","LALO11@trabajo.com");
	
		System.out.println(usr2.getnombre());
		System.out.println(usr2.gettelefono());
		System.out.println(usr2.getdireccion());
		System.out.println(usr2.getmail());
		System.out.println(usr2.getnickname());
		System.out.println(usr2.getfechaNacimiento());

		Usuario usr3 = new Usuario("LALO","LALOCM","LALO11@trabajo.com","55-66-23-24-32","Sto domingo MZ 3 LT 4","22/11/93");

		System.out.println(usr3.getnombre());
		System.out.println(usr3.gettelefono());
		System.out.println(usr3.getdireccion());
		System.out.println(usr3.getmail());
		System.out.println(usr3.getnickname());
		System.out.println(usr3.getfechaNacimiento());







	}
}