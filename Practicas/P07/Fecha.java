import java.util.*;
import java.util.Scanner;
class Fecha{
	private int dia,mes,anio;

		public static int FechaCorrecto(int fdia,int fmes, int fanio){
			dia=fdia;
			mes=fmes;
			anio=fanio;
				 if(anio>=1582){
							
								if(anio%4==0){
							if(mes<=12 || mes >=1 ){
								if(dia>=1 || dia<=31){
								System.out.println("La Fecha es:"+anio+"/"+(mes+1)+"/"+dia+"el año es Bisiesto");
								if(mes==2){
									if(dia>=1 || dia<=29){
										System.out.println("La Fecha es:"+anio+"/"+(mes+1)+"/"+dia+"el año es Bisiesto");
								}
							}
						}			
					}
				
			}	
		}if(anio>=1582){
						if(mes>=1 || mes<=12){
							if(dia>=1 || dia<=21){
								System.out.println("La Fecha es:"+anio+"/"+(mes+1)+"/"+dia);
							}
						}
					}
			//}while(anio!=1582);
			return 0;							
		}

		public int AsignarFecha(int qmes, int qdia, int qanio){
			dia=qanio;
			mes=qmes;
			anio=qanio;
			System.out.println("La Fecha es:"+anio+"/"+(mes+1)+"/"+dia);
			return 0;

		}
		public int AsignarFecha(int rdia,int rmes){
			Calendar fecha = GregorianCalendar.getInstance();
			this.anio= fecha.get(Calendar.YEAR);
			dia=rdia;
			mes=rmes;
			System.out.println("La Fecha es:"+anio+"/"+(mes+1)+"/"+dia);
			return 0;
		}
		public void AsignarFecha(){
			Calendar fecha = GregorianCalendar.getInstance();
			this.anio = fecha.get(Calendar.YEAR);
			this.mes = fecha.get(Calendar.MONTH);
			this.dia = fecha.get(Calendar.DAY_OF_MONTH);
			System.out.println("La Fecha es:"+anio+"/"+(mes+1)+"/"+dia);
			
		}
		//public int constructor(){
		
		//}
		public int constructorporomision(int dia, int anio, int mes){
			Calendar fecha = GregorianCalendar.getInstance();
			this.anio = fecha.get(Calendar.YEAR);
			this.mes = fecha.get(Calendar.MONTH);
			this.dia = fecha.get(Calendar.DAY_OF_MONTH);
			return 0;
		}
		public static void main(String[] args) {
			int dia1;
			int mes1;
			int anio1;
			int op;
			Scanner reader = new Scanner (System.in);
			System.out.println("1: Comprobar fecha:");
			System.out.println("2: Comprobar fecha Por dia/mes/año");
			System.out.println("3: Comprobar Fecha por dia/mes:");
			System.out.println("4: Imprimir la fecha actual");
			System.out.println("Seleciona una Opcion");
			op=reader.nextInt(); 		
			switch(op){
			case 1:		
					System.out.println("ingresa el año:");
					anio1=reader.nextInt();
					System.out.println("ingresa el mes:");
					mes1=reader.nextInt();
					System.out.println("ingresa el dia:");
					dia1=reader.nextInt();
					Fecha fecha1 = new Fecha();
					fecha1.FechaCorrecto(dia1,mes1,anio1);
					break;
			case 2:
					System.out.println("ingresa el año:");
					anio1=reader.nextInt();
					System.out.println("ingresa el mes:");
					mes1=reader.nextInt();
					System.out.println("ingresa el dia:");
					dia1=reader.nextInt();
					Fecha fecha2 = new Fecha();
					fecha2.AsignarFecha(anio1,mes1,dia1);
					break;
			case 3: 
					System.out.println("ingresa el mes:");
					mes1=reader.nextInt();
					System.out.println("ingresa el dia:");
					dia1=reader.nextInt();
					Fecha fecha3 = new Fecha();
					fecha3.AsignarFecha(mes1,dia1);
					break;
			case 4: 
					Fecha fecha4 = new Fecha();		
					fecha4.AsignarFecha();		
		}	
	}

}