package principal;

import java.util.Scanner;
public class MenuFirstLine {
	
	public static Scanner sc = new Scanner(System.in);
	public static Tablero tablero = new Tablero();
	public static Huevo huevo = new Huevo();
	
	 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		seleccion(Menu());
		
	}	
	

	public static int Menu() { /*Menu de visualizacion para usuario, retorna seleccion 
	 							que será utilizada en el metodo siguiente*/
		int selec;
		
		System.out.println
						("\n"+"------ Simulador de Batalla ------"+"\n"+
						"1. Instrucciones"+"\n"+
						"2. Iniciar nueva simulación"+"\n"+
						"3. Información del enemigo (PKS)"+"\n"+
						"4. Obtener Puntaje"+"\n"+
						"5. Salir"+"\n"+
						 "------- Ingrese una opción -------");
	
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
			seleccion(Menu());
			break;
		case 5:
			casoCinco();
			break;
		default:
			seleccion(Menu());
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
		
		/*
		 * Genera mapa con carros posicionados (no se muestra a usuario)
		 */
		
		tablero.generarMapa();		

		/*
		 * Solicitar coordenadas de proyectil a lanzar
		 */
		
		int posX;
		int posY;
		
		System.out.println("---- Lanzamiento proyectil ----");
		System.out.println("Ingrese coordenada X (entre 0-14):");
		while(true) {
			String por = sc.next();
			try {
				posX = Integer.parseInt(por);
				if(posX>14 | posX<0) {
					throw new Exception();
				}
				break;
			}
			catch(Exception e) {
				System.err.println("Ingrese una opción válida (entre 0-14).");
			}
		}
		
		System.out.println("Ingrese coordenada Y (entre 0-14):");
		while(true) {
			String pos = sc.next();
			try {
				posY = Integer.parseInt(pos);
				if(posY>14 | posY<0) {
					throw new Exception();
				}
				break;
			}
			catch(Exception e) {
				System.err.println("Ingrese una opción válida (entre 0-14).");
			}
		}
		
		/*
		 * Asigna puntajes a cada lanzamiento
		 */
		
		tablero.lanzarHuevo(posX, posY);
		
		

		/*
		 * Muestra tablero con impactos de proyectil
		 */
		
		System.out.println("\n" +"----- Proyectil Lanzado -----"+"\n");
		tablero.mostrarMapaHuevos(); 
		
		
		String selec = "";
		System.out.println("\n" + "Desea lanzar más proyectiles? (S/N)");
		selec = sc.next();
		if(selec.equalsIgnoreCase("s")) {
			casoDos();
		}else {
			casoCuatro();
		}

	}
	
	
	public static void casoTres() {
		
		/*
		 * Despliega informacion de carros
		 */
		
		tablero.toStringAll();
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
			casoDos();
		}else {
			seleccion(Menu());
		}
	}
	

	public static void casoCinco() {
		System.out.println("\n"+"---------- Posiciones del Enemigo ----------"+"\n");
		tablero.revelarMatriz();
		//agregar resumen "obtuviste x puntos / 100 "
		
		
		
		System.out.println("\n"+ "Gracias por participar de la simulación"+"\n"+
						   "---------- Comando FirstLine ----------");
		System.exit(0);	
	}
	}
