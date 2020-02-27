package principal;

import java.util.Scanner;

public class MenuFirstLine {
	
	//public static Scanner sc = new Scanner(System.in);
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		seleccion(Menu());
		//Menu();
		
	}	
	
	public static int Menu() {
		
		int selec;

		System.out.println("   ------- Simulador PKS -------");
		
		System.out.println("1. Generar posiciones de efectivos");
		System.out.println("2. Lanzar proyectil (Huevo)");
		System.out.println("3. Obtener Puntaje");
		System.out.println("4. Salir");
	
		System.out.println("------- Ingrese una opción -------");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String aux = sc.next();
			try {
				selec = Integer.parseInt(aux);
				if(selec>4 | selec<1) {
					throw new Exception();
				}
				break;
			}
			catch(Exception e) {
				System.err.println("Ingrese una opción válida. ");
			}
		}
		return selec;
	}
	
	
	public static void seleccion(int selec) {
		
		
		switch(selec) {
		case 1:
			System.out.println("hola 1");
			break;
		case 2:
			System.out.println("hola 2");
			break;
		case 3:
			System.out.println("hola 3");
			break;
		case 4:
			casoCuatro();
			break;
		default:
			break;
			
		}
	}

	
	public void casoUno() {
		
	}
	
	public void casoDos() {
		
	}

	public void casoTres() {

	}
	
	
	public static void casoCuatro() {

		System.out.println("Gracias por participar de la simulación"+"\n"+
						   "---------- Comando FirstLine ----------");
		System.exit(0);

	}
	
	}
		
	


