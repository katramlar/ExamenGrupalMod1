package principal;

import controlador.Tablero;

public class Main {

	public static void main(String[] args) {
		
		Tablero board = new Tablero();		
        board.generarMapa();
		board.revelarMatriz();	
		System.out.println(" ");
        board.lanzarHuevo();
        board.lanzarHuevo();
        board.lanzarHuevo();
        board.lanzarHuevo();
		board.mostrarMapaHuevos();
		System.out.println("");
		
	}
}
