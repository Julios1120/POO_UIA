public class construccion extends Superficie implements Materiales{
	private double preciopintura,cubrelitropintura;
	private double pliegotablaroca,preciotablaroca;
	private double mtrposte,precioposte;
	private double mtrcanal,preciocanal;
	private double cubrekiloredimix,precioredimix;
	private double mtrprefacina,precioprefacina;
	private double numeropijas,preciopijas;
	private double aux;

	public construccion(){
		super(1,1);
		preciopintura=150;
		cubrelitropintura=10;
		precioprefacina=28;
		mtrprefacina=0.0515;
		precioposte=40;
		mtrposte=0.82;
		preciocanal=40;
		mtrcanal=0.28;
		preciopijas=4;
		numeropijas=20;
		precioredimix=218;
		cubrekiloredimix=3;
		preciotablaroca=290;
		pliegotablaroca=0.34;
	}
	public construccion(double largo,double ancho){
		super(1,1);
		preciopintura=150;
		cubrelitropintura=10;
		precioprefacina=28;
		mtrprefacina=0.0515;
		precioposte=40;
		mtrposte=0.82;
		preciocanal=40;
		mtrcanal=0.28;
		preciopijas=4;
		numeropijas=20;
		precioredimix=218;
		cubrekiloredimix=3;
		preciotablaroca=290;
		pliegotablaroca=0.34;
	}
	
	public construccion(double preciopintura, double precioprefacina, double precioposte, double preciocanal,double preciopija,double precioredimix, double preciotablaroca){
		super(1,1);
		preciopintura=preciopintura;
		cubrelitropintura=10;
		precioprefacina=precioprefacina;
		mtrprefacina=0.0515;
		precioposte=precioposte;
		mtrposte=0.82;
		preciocanal=preciocanal;
		mtrcanal=0.28;
		preciopijas=preciopija;
		numeropijas=20;
		precioredimix=precioredimix;
		cubrekiloredimix=3;
		preciotablaroca=preciotablaroca;
		pliegotablaroca=0.34;
	}


	public construccion(double,largo,double ancho,double preciopintura, double precioprefacina, double precioposte, double preciocanal,double preciopija,double precioredimix, double preciotablaroca){
		super(largo,ancho);
		preciopintura=preciopintura;
		cubrelitropintura=10;
		precioprefacina=precioprefacina;
		mtrprefacina=0.0515;
		precioposte=precioposte;
		mtrposte=0.82;
		preciocanal=preciocanal;
		mtrcanal=0.28;
		preciopijas=preciopija;
		numeropijas=20;
		precioredimix=precioredimix;
		cubrekiloredimix=3;
		preciotablaroca=preciotablaroca;
		pliegotablaroca=0.34;
	}

	public void pintura(){
		if(resultado>=cubrelitropintura){
			System.out.println("tu Superficie es: "+ resultado +" m2");
				aux1 = (resultado / cubrelitropintura);
				aux1 = aux1*2;
				System.out.println("Nesesitas: "+ aux1 + " litros de Pintura" );
				aux1=aux1*preciopintura;
				System.out.println("Son: "+aux1+" Pesos");
			
		}else{
			System.out.println("tienes que cubrir son: "+ resultado+" m2 y un blitro cubre"+cubrelitropintura);
			System.out.println("el bote de pintura vale: "+preciopintura)
		}
	}	
	public void poste(){
		if(resultado>=mtrposte){
			System.out.println("tu Superficie es: "+ resultado +" m2");
				aux1 = (resultado / mtrposte);
				aux1 = aux1*2;
				System.out.println("Nesesitas: "+ aux1 + " m2 del poste metalico" );
				aux1=aux1*precioposte;
				System.out.println("Son: "+aux1+" Pesos");
			
		}else{
			System.out.println("tienes que cubrir son: "+ resultado+" m2 y un blitro cubre"+cubrelitropintura);
			System.out.println("el bote de pintura vale: "+preciopintura)
		}
	}
		public void calcularTablaroca(){
			aux1=resultado*pliegotablaroca;
			aux1=aux1/1;
			System.out.println("Nesesitas: "+ aux1 + " m2 de Tablaroca" );
		}
}