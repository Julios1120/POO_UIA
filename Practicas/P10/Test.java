 //Código de test 
import java.io.*;
public class Test {

	

	public void idusuario(){
		TipodeUsuario usuario1 = new TipodeUsuario ("Juan Hernandez", "Arquitecto", 33);
        usuario1.setidTipodeUsuario(" Arq. 22-387-11");
        usuario1.mostrarNombreProfesionYEdad();		
	}
	public void pintura(){
		CalcularMaterialesGrandes m1 = new CalcularMaterialesGrandes();
		m1.calcularPintura();
	}

	public void tablaroca(){
		CalcularMaterialesGrandes m2 = new CalcularMaterialesGrandes();
		m2.calcularTablaroca();
	}
	public void pijas(){
		CalcularMaterialeschicos m3 = new CalcularMaterialeschicos();
		m3.calcularpijas();
	}
	public void redimix(){
		CalcularMaterialeschicos m4 = new CalcularMaterialeschicos();
		m4.calcularredimix();
	}
	public void poste(){
		CalcularMaterialeschicos m5 = new CalcularMaterialeschicos();
		m5.calcularposte();
	}
    public static void main (String [ ] Args) {
    	Test t1 = new Test();
    	t1.idusuario();
    	t1.pintura();
    	t1.tablaroca();
    	t1.pijas();
    	t1.redimix();
    	t1.poste();

    }
} 