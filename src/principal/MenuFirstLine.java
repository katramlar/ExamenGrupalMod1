package principal;
import java.util.Scanner;
import controlador.Tablero;
import objetos.Huevo;
/**
 * @author ivillaroelr, katramlar, victorSoto2712
 *
 */
public class MenuFirstLine {
	
	/**
	 * Objeto tipo Scanner para obtener datos de entrada
	 */
	private Scanner sc = new Scanner(System.in);
	
	/**
	 * Objeto tipo Tablero para iniciar la logica de la aplicacion
	 */
	private Tablero tablero;
	
	/**
	 * @param tablero recibe input de usuario por teclado para seleccion de menu
	 * @return retorna valor int que sera utilizado en switch de metodo seleccion
	 * @throws excepciones si el input no es un numero entre 1 y 5
	 */
	public int Menu(Tablero tablero) { 
		int selec;
		this.tablero = tablero;
		tablero.generarMapa();
		System.out.println
//						("\n"+"------ Simulador de Batalla ------"+"\n"+
//						"1. Instrucciones"+"\n"+
//						"2. Iniciar nueva simulacion"+"\n"+
//						"3. Informacion del enemigo (PKS)"+"\n"+
//						"4. Obtener Puntaje"+"\n"+
//						"5. Salir"+"\n"+
//						 "------- Ingrese una opcion -------");
						("\n"+"------ Simulador de Batalla ------"+"\n"+
						"1. Instrucciones"+"\n"+
						"2. Lanzar huevo"+"\n"+
						"3. Mostrar Mapa de Huevos"+"\n"+
						"4. Obtener Puntaje"+"\n"+
						"5. Finalizar juego (muestra mapa de carros) "+"\n"+
						 "------- Ingrese una opcion -------");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String aux = sc.next();
			try {
				if(aux.contains("hack.revelarmapa(this.tablero);")) {
					selec = 6;
					break;
				}
				else {
					selec = Integer.parseInt(aux);
					if(selec>5 | selec<1) {
						throw new Exception();
					}
					break;
				}
			}
			catch(Exception e) {
				System.err.println("Ingrese una opcion valida (entre 1-5).");
			}
		}
		return selec;
	}
	/**
	 * <p> Seleccion que llama a los metodos de juego </p>
	 * @param selec recibe un int generado en MenuFirstLine
	 */
	public void seleccion(int selec) {
		switch(selec) {
		case 1:
			mostrarInfo(); // casoUno()
			seleccion(Menu(this.tablero));
			break;
		case 2:
			lanzarHuevo(); // casoDos()
			seleccion(Menu(this.tablero));
			break;
		case 3:
			mostrarMapaHuevos(); // casoTres()
			seleccion(Menu(this.tablero));
			break;
		case 4:
			mostrarPuntajeAcumulativo(); // casoCuatro()
			seleccion(Menu(this.tablero));
			break;
		case 5:
			mostrarYSalir(); // casoCinco()
			break;
		case 6: 
			tablero.revelarMatriz();
			seleccion(Menu(this.tablero));
		default:
			seleccion(Menu(this.tablero));
			break;	
		}
	}
	/**
	 * <p> Muestra instrucciones de juego </p>
	 */
	public void mostrarInfo() { 
		System.out.println(
				"En un tablero de 15x15 se ubicaran aleatoriamente "+ "\n"
				+ "3 Kromis, 5 Caguanos y 10 Trupallas, deberas lanzar "+ "\n"
				+ "huevos en las coordenadas(x,y) hasta derribar los carros.");
	}
	/**
	 * <p> Llama a metodos de tablero para ejecutar lanzamiento 
	 * de proyectiles a tablero recibe int de coordenadas desde teclado </p>
	 */
	public void lanzarHuevo() {
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
				System.err.println("Ingrese una opcion valida (entre 0-14).");
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
				System.err.println("Ingrese una opcion valida (entre 0-14).");
			}
		}
		/*
		 * Asigna puntajes a cada lanzamiento
		 */
		this.tablero.lanzarHuevo(posX, posY);
		System.out.println("\n" +"----- Proyectil Lanzado -----"+"\n");
//		String selec = "";
//		System.out.println("\n" + "Desea lanzar mas proyectiles? (S/N)");
//		selec = sc.next();
//		if(selec.equalsIgnoreCase("s")) {
//			casoDos();
//		}else {
//			casoCuatro();
//		}
	}
	/**
	 * <p> Muestra tablero con impactos de proyectil </p>
	 */
	public void mostrarMapaHuevos() {
		tablero.mostrarMapaHuevos(); 
	}
	/**
	 * <p> Llama a metodo para calculo de puntaje y cantidad de proyectiles lanzados </p>
	 */
	public void mostrarPuntajeAcumulativo() {
		int cantHuevos = tablero.getHuevos().size();
		System.out.println("------- Resumen de puntaje -------\n");
		tablero.calcularPuntaje();
	}
	/**
	 * <p> Revela las posiciones de los enemigos en el tablero y muestra la cantidad de 
	 * carros destruidos </p>
	 */
	public void mostrarYSalir() {
		System.out.println("\n"+"---------- Posiciones del Enemigo ----------"+"\n");
		tablero.revelarMatriz();
		System.out.println(" ");
		System.out.println("---------- Vehiculos destruidos ----------");
		tablero.mostrarDestruidos();
		System.out.println(" \n \n \n ");
		System.out.println("\n"+ "Gracias por participar de la simulacion"+"\n"+
						   "---------- Comando FirstLine ----------");
		System.exit(0);	
	}
	}