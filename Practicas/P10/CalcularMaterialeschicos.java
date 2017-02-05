public class CalcularMaterialeschicos extends Materiales{
	private double pija,redimix,posteMetalico;
	private double aux;
	public CalcularMaterialeschicos(){
		super(23.45,10.22);
		pija=20.00;
		redimix=0.99;
		posteMetalico=0.82;
	}
	public void calcularpijas(){
		aux=(resultado*pija);
		aux=aux/1;
		System.out.println("Nesecitas: "+ aux + " de pijas");

	}

	public void calcularredimix(){
		aux=(resultado*redimix);
		aux=aux/1;
		System.out.println("Nesecitas: "+ aux + " m2 de redimix");

	}


	public void calcularposte(){
		aux=(resultado*posteMetalico);
		aux=aux/1;
		System.out.println("Nesecitas: "+ aux + " m2 de poste Metalico");

	}
}