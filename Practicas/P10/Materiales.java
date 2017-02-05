public class Materiales{
	private double largo,ancho;
	public double resultado;
	public Materiales(){
		largo=0;
		ancho=0;
		resultado=0;
		
	}	
	public Materiales(double ilargo,double iancho){
		largo=ilargo;
		ancho=iancho;
		resultado=(largo * ancho);
		
	}
	public double getresultado(){
		return resultado;
	}
	


	

}