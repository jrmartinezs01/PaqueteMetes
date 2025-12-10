//Cambio Prueba
/**
 * Programa.java
 * author: Robe Extremoduro 
 */
import java.util.Scanner;
	public class Programa{
		static Scanner teclado = new Scanner(System.in);
		static Envio[] envios = new Envio[50];
		static Integer iEnvios = 0;
		
		public static void main(String[] args){
		//Menu
		Boolean repetirMenu = true;
		do{
			
			switch(verMenu()){
				case "1":
						registrarEnvio();
						break;
				case "2":
						break;
				case "X":
				case "x":
						break;
				default:
					System.out.println("Opcion desconocida.");
			}
		
		}while(repetirMenu);
		teclado.close();
		System.out.println("Fin del programa. Espero volver a verle pronto.");
	}

	public static void verInforme(){
		Float suma = 0f;
		System.out.println("\nINFORME DE ENVIOS");
		for (int i = 0; i < iEnvios; i++) {
				Envio envioActual = envios[i];
				System.out.println("\t" + (i + 1) + " . " + envios[i].verComoString());

				suma += envios[i].precio;
		}
		
		System.out.println("\t------------------");
		System.out.println("\tTOTAL:\t\t" + suma + "€\n");
	}
	
	
	public static String verMenu(){
		System.out.println("APLICACION DE PaqueteMetes");
			System.out.println("\t1. Registrar Envio");
			System.out.println("\t2. Ver Informe de Envio");
			System.out.println("\tX. Salir");
			System.out.print("Opcion: ");
			return teclado.nextLine();
	}
	
	public static void registrarEnvio(){
				while(true){
					try{
						System.out.println("Registro de Envio");
						System.out.println("\tNúmero: ");
						String numero = teclado.nextLine();
						if (numero.equals(" "))
							break;
						
						System.out.println("\tPrecio: ");
						Float precio = Float.valueOf(teclado.nextLine());
						
						Envio envio = new Envio(numero, precio);
						envios[iEnvios++] = envio;
						System.out.println("Registro OK");
					}
					catch(Exception excepcion){
					System.out.println("Registro KO");
					}
				}
	}
	
	
}
	
