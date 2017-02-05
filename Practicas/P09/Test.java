class Test{
	public static void main(String[] args) {
		Usuario usr1 = new Usuario();
		
		System.out.println("Nombre:" + usr1.getnombre());
		System.out.println("Telefono:" + usr1.gettelefono());
		System.out.println("Direccion:" + usr1.getdireccion());
		System.out.println("Mail:" + usr1.getmail());
		System.out.println("Nickname:" + usr1.getnickname());
		System.out.println("Fecha de Nacimiento" + usr1.getfechaNacimiento());

		Usuario usr2 = new Usuario("LALO","LALOCM","LALO11@trabajo.com");
	
		System.out.println();
		System.out.println("Nombre:" + usr2.getnombre());
		System.out.println("Telefono:" + usr2.gettelefono());
		System.out.println("Direccion:" + usr2.getdireccion());
		System.out.println("Mail:" + usr2.getmail());
		System.out.println("Nickname:" + usr2.getnickname());
		System.out.println("Fecha de Nacimiento" + usr2.getfechaNacimiento());
	
		Usuario usr3 = new Usuario("LALO","LALOCM","LALO11@trabajo.com","55-66-23-24-32","Sto domingo MZ 3 LT 4","22/11/93");

		System.out.println();	
		System.out.println("Nombre:" + usr3.getnombre());
		System.out.println("Telefono:" + usr3.gettelefono());
		System.out.println("Direccion:" + usr3.getdireccion());
		System.out.println("Mail:" + usr3.getmail());
		System.out.println("Nickname:" + usr3.getnickname());
		System.out.println("Fecha de Nacimiento" + usr3.getfechaNacimiento());
	}
}	