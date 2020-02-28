package principal;

import controlador.Tablero;

public class Main {

	public static void main(String[] args) {
		
		Tablero board = new Tablero();		
        board.generarMapa();
        System.out.println(" = TABLERO DE POSICIONES = ");
		board.revelarMatriz();	
		System.out.println(" ");
        board.lanzarHuevo(2,4);
        board.lanzarHuevo(5,3);
        board.lanzarHuevo(9,9);
        board.lanzarHuevo(4,2);
        board.lanzarHuevo(0,0);
        board.lanzarHuevo(0,14);
        board.lanzarHuevo(3,13);
        board.lanzarHuevo(4,4);
        System.out.println(" ");
        System.out.println(" = TABLERO DE HUEVOS IMPACTADOS = ");
		board.mostrarMapaHuevos();
		System.out.println("");
		
		board.toStringAll();
	}
}
