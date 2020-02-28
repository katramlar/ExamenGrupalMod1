package principal;

import java.util.Scanner;

import controlador.Tablero;
import objetos.Huevo;
public class MenuFirstLine {
	
	private Scanner sc = new Scanner(System.in);
	private Tablero tablero;
	
	public int Menu(Tablero tablero) { /*Menu de visualizacion para usuario, retorna seleccion 
	 							que será utilizada en el metodo siguiente*/
		int selec;
		this.tablero = tablero;
		tablero.generarMapa();
		
		System.out.println
//						("\n"+"------ Simulador de Batalla ------"+"\n"+
//						"1. Instrucciones"+"\n"+
//						"2. Iniciar nueva simulación"+"\n"+
//						"3. Información del enemigo (PKS)"+"\n"+
//						"4. Obtener Puntaje"+"\n"+
//						"5. Salir"+"\n"+
//						 "------- Ingrese una opción -------");
						("\n"+"------ Simulador de Batalla ------"+"\n"+
						"1. Instrucciones"+"\n"+
						"2. Lanzar huevo"+"\n"+
						"3. Mostrar Mapa de Huevos"+"\n"+
						"4. Obtener Puntaje"+"\n"+
						"5. Finalizar juego (muestra mapa de carros) "+"\n"+
						 "------- Ingrese una opción -------");
	
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
				System.err.println("Ingrese una opción válida (entre 1-5).");
			}
		}
		return selec;
		
	}
	
	
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
	
	
	public void mostrarInfo() { 
		System.out.println(
				"En un tablero de 15x15 se ubicaran aleatoriamente "+ "\n"
				+ "3 Kromis, 5 Caguanos y 10 Trupallas, deberás lanzar "+ "\n"
				+ "huevos en las coordenadas(x,y) hasta derribar los carros.");
	}
	
	
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
		
		this.tablero.lanzarHuevo(posX, posY);
		
		System.out.println("\n" +"----- Proyectil Lanzado -----"+"\n");

		
		
//		String selec = "";
//		System.out.println("\n" + "Desea lanzar más proyectiles? (S/N)");
//		selec = sc.next();
//		if(selec.equalsIgnoreCase("s")) {
//			casoDos();
//		}else {
//			casoCuatro();
//		}

	}
	
	
	public void mostrarMapaHuevos() {
		
		/*
		 * Muestra tablero con impactos de proyectil
		 */
		tablero.mostrarMapaHuevos(); 
	}
	
	
	public void mostrarPuntajeAcumulativo() {
		int cantHuevos = tablero.getHuevos().size();
		System.out.println("------- Resumen de puntaje -------\n");
		tablero.calcularPuntaje();
		//System.out.println("Acumulado: "+tablero.calcularPuntaje()); 
		/*Detallar la cantidad de hits a cada vehiculo
		 * ejemplo
		 * Kromis = 3ptos
		 * Trupallas = 5 ptos, 
		 * 
		 * solo si sobra tiempo = agregar cuantos vehiculos derribÃ³ de cada uno
		 */
//		String selec = "";
//		System.out.println("Desea lanzar más proyectiles? (S/N)");
//		selec = sc.next();
//		if(selec.equalsIgnoreCase("s")) {
//			casoDos();
//		}else {
//			seleccion(Menu(this.tablero));
//		}
	}
	

	public void mostrarYSalir() {
		System.out.println("\n"+"---------- Posiciones del Enemigo ----------"+"\n");
		tablero.revelarMatriz();
		
		System.out.println(" ");
		System.out.println("---------- Vehículos destruidos ----------");
		tablero.mostrarDestruidos();
		//agregar resumen "obtuviste x puntos / 100 "
		
		
		System.out.println(" \n \n \n ");
		System.out.println("\n"+ "Gracias por participar de la simulación"+"\n"+
						   "---------- Comando FirstLine ----------");
		System.exit(0);	
	}
	}
