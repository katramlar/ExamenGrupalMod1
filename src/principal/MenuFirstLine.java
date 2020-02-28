package principal;

import java.util.Scanner;

public class MenuFirstLine {
	
	public static Scanner sc = new Scanner(System.in);
	public static Tablero tablero = new Tablero();
	public static Huevo huevo = new Huevo();

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		seleccion(Menu());
		//Menu();
		
	}	
	
	@SuppressWarnings("resource")
	public static int Menu() { /*Menu de visualizacion para usuario, retorna seleccion 
	 							que será utilizada en el metodo siguiente*/
		
		int selec;
		System.out.println(" ");
		System.out.println("   ------- Simulador de Batalla -------");
	
		System.out.println("1. Instrucciones");
		System.out.println("2. Información del enemigo (PKS)");
		System.out.println("3. Iniciar simulación");
		System.out.println("4. Obtener Puntaje");
		System.out.println("5. Salir");
	
		System.out.println("------- Ingrese una opción -------");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String aux = sc.next();
			try {
				selec = Integer.parseInt(aux);
				if(selec>5 | selec<1) {
					throw new Exception();
				}
				break;
			}
			catch(Exception e) {
				System.err.println("Ingrese una opción válida (entre 1-5).");
			}
		}
		return selec;
	}
	
	
	public static void seleccion(int selec) {
		
		switch(selec) {
		case 1:
			casoUno();
			seleccion(Menu());
			break;
		case 2:
			casoDos();
			seleccion(Menu());
			break;
		case 3:
			casoTres();
			seleccion(Menu());
			break;
		case 4:
			casoCuatro();
			break;
		case 5:
			casoCinco();
			break;
		default:
			break;	
		}
		
	}

	
	public static void casoUno() { 
		System.out.println(
				"En un tablero de 15x15 se ubicaran aleatoriamente "+ "\n"
				+ "3 Kromis, 5 Caguanos y 10 Trupallas, deberás lanzar "+ "\n"
				+ "huevos en las coordenadas(x,y) hasta derribar los carros.");
		
	}
	
	public static void casoDos() {
		
		Kromi kromi = new Kromi();
		System.out.println("El año de fabricacion es :" + kromi.getAnoFabricacion());
		
		
		
	}

	public static void casoTres() {
		
		
		tablero.generarMapa();//Genera mapa con carros ya posicionados
		
		int posX = 0;
		int posY;
		int contador = 0;
		String selec = "";
		
		//Solicitar coordenadas de proyectil a lanzar
		System.out.println("---- Lanzamiento proyectil ----");
		
		do {
		System.out.println("Ingrese coordenada X (entre 0-14):");
		
		try {
			if(Integer.parseInt(selec)<0 | Integer.parseInt(selec)>14) {
				{System.err.println("Ingrese número entre 0 - 14");}
			}
		}catch(Exception e) {
			{System.err.println("Ingrese número entre 0 - 14");}
		}
		}while(Integer.parseInt(selec)<0 | Integer.parseInt(selec)>14);
		
		
		posX = Integer.parseInt(selec);
		System.out.println(posX);
		
		System.out.println("Ingrese coordenada Y (entre 0-14):");
		posY = sc.nextInt();
		
		contador++;
		
		
		
		tablero.lanzarHuevo(posX, posY);
		
		System.out.println("----- Proyectil Lanzado -----");
		System.out.println("Has lanzado " + contador + " huevos");		
		tablero.mostrarMapaHuevos();
		
		String selec2 = "";
		System.out.println("\n" + "Desea lanzar más proyectiles? (S/N)");
		selec2 = sc.next();
		if(selec2.equalsIgnoreCase("s")) {
			casoTres();
		}else {
			casoCuatro();
		}

	}
	
	
	public static void casoCuatro() {

		
		System.out.println("------- Puntaje obtenido -------");
		System.out.println(tablero.calcularPuntaje()); 

		/*Detallar la cantidad de hits a cada vehiculo
		 * ejemplo
		 * Kromis = 3ptos
		 * Trupallas = 5 ptos, 
		 * 
		 * solo si sobra tiempo = agregar cuantos vehiculos derribó de cada uno
		 */
		
		String selec = "";
		System.out.println("Desea lanzar más proyectiles? (S/N)");
		selec = sc.next();
		if(selec.equalsIgnoreCase("s")) {
			casoTres();
		}else {
			casoCinco();
		}

	}
	
	
	public static void casoCinco() {
		
		System.out.println("---------- Posiciones del Enemigo ----------"+"\n");
		tablero.revelarMatriz();
		
		//agregar resumen "obtuviste x puntos / 100 "
		
		System.out.println("\n"+ "Gracias por participar de la simulación"+"\n"+
						   "---------- Comando FirstLine ----------");
		System.exit(0);	
		
	}
	
	}
		
	


