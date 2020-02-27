package controlador;
import java.util.ArrayList;

import objetos.Carro;
import objetos.Huevo;
import objetos.Kromi;
import objetos.Caguanos;
import objetos.Trupalla;

public class Tablero{

    /*
    *  VARIABLES DE INSTANCIA 
    */

    private String[][] board = new String[15][15];

    private ArrayList<Carro> carros = new ArrayList<Carro>();

    private ArrayList<Huevo> huevos = new ArrayList<Huevo>();

	private int contadorKromis;

	private int contadorCaguanos;

	private int contadorTrupallas;

    /*
    * CONSTRUCTORES 
    */
    public Tablero(){
        super();
        this.contadorKromis=0;
        this.contadorTrupallas=0;
        this.contadorCaguanos=0;
    }

    public Tablero(String[][] board, ArrayList<Carro> carros, ArrayList<Huevo> huevos){
    	
        super();
        this.board = board;
        this.carros = carros;
        this.huevos = huevos;
    }

    /*
    * METODOS ESPECIFICOS 
    */
    
    private boolean crearKromi() {
    	
    	boolean respuesta;
    	
    	Kromi kromi;
		/* 
		 *  El metodo generará aleatoriamente:
		 *  - La fecha
		 *  - La cantidad de ocupantes
		 *  - El año de fabricación
		 *  - La marca
		 */
		String dia = Integer.toString((int)(Math.random() * ((31 - 1) + 1)) + 1);
		String mes = Integer.toString((int)(Math.random() * ((12 - 1) + 1)) + 1);
		String ano = Integer.toString((int)(Math.random() * ((2020 - 1990) + 1)) + 1990);
		
		String fecha = (dia+"/"+mes+"/"+ano);
		
		int cantOcupantes = (int)(Math.random() * ((46 - 1) + 1)) + 1;
		
		int anoFabricacion = (int)(Math.random() * ((2019 - 1960) + 1)) + 1960;
		
		int marcaAux = (int)(Math.random() * ((4 - 1) + 1)) + 1;
		
		String marca = "";
		
		switch(marcaAux) {
		
		case 1: marca = "FORD";
				break;
			
		case 2: marca = "MERCEDES BENZ";
				break;
			
		case 3: marca = "TOYOTA";
				break;
			
		case 4: marca = "CHEVROLET";
				break;
			
		}
		
		try {
			
			int posX =  (int)(Math.random() * ((14 - 0) + 1)) + 0;
			int posY =  (int)(Math.random() * ((14 - 0) + 1)) + 0;
			
			int orientacionAux = (int)(Math.random() * ((2 - 1) + 1)) + 1;
			
			char orientacion = '-';
			
			switch (orientacionAux) {
			
			case 1: 
					if(board[posY][posX]==null & board[posY-1][posX]==null & board[posY-2][posX]==null) {
						orientacion = 'N';
						
						kromi = new Kromi(posX, posY, orientacion, cantOcupantes, fecha, anoFabricacion, marca);
						
						carros.add(kromi);
						
						board[kromi.getPosY()][kromi.getPosX()]="K";
						board[kromi.getPosY()-1][kromi.getPosX()]="K";
						board[kromi.getPosY()-2][kromi.getPosX()]="K";
						
						respuesta = true;

					}
					else {
						throw new Exception();
					}
			
			case 2: 
					if(board[posY][posX]==null & board[posY+1][posX]==null & board[posY+2][posX]==null) {
						orientacion = 'S';
						kromi = new Kromi(posX, posY, orientacion, cantOcupantes, fecha, anoFabricacion, marca);
						
						carros.add(kromi);
						
						board[kromi.getPosY()][kromi.getPosX()]="K";
						board[kromi.getPosY()+1][kromi.getPosX()]="K";
						board[kromi.getPosY()+2][kromi.getPosX()]="K";
						
						respuesta = true;
					}
					
					else {
						throw new Exception();
					}
				
			}
				
		}
		catch(Exception e) {
			
			respuesta = false;
			
		}
		return false;
    }

    private boolean crearCaguanos() {
    	boolean respuesta;
    	
    	Caguanos caguano;
		/* 
		 *  El metodo generará aleatoriamente:
		 *  - La fecha
		 *  - La cantidad de ocupantes
		 *  - El alcance de tiro
		 *  - El color del confetti
		 */
		String dia = Integer.toString((int)(Math.random() * ((31 - 1) + 1)) + 1);
		String mes = Integer.toString((int)(Math.random() * ((12 - 1) + 1)) + 1);
		String ano = Integer.toString((int)(Math.random() * ((2020 - 1990) + 1)) + 1990);
		
		String fecha = (dia+"/"+mes+"/"+ano);
		
		int cantOcupantes = (int)(Math.random() * ((46 - 1) + 1)) + 1;
		
		int alcanceTiro = (int)(Math.random() * ((100 - 50) + 1)) + 50;
		
		int colorConfettiAux = (int)(Math.random() * ((4 - 1) + 1)) + 1;
		
		String colorConfetti = "";
		
		switch(colorConfettiAux) {
		
		case 1: colorConfetti = "ROJO";
				break;
			
		case 2: colorConfetti = "AZUL";
				break;
			
		case 3: colorConfetti = "AMARILLO";
				break;
			
		case 4: colorConfetti = "VERDE";
				break;
			
		}
		
		try {
			
			int posX =  (int)(Math.random() * ((14 - 0) + 1)) + 0;
			int posY =  (int)(Math.random() * ((14 - 0) + 1)) + 0;
			
			int orientacionAux = (int)(Math.random() * ((2 - 1) + 1)) + 1;
			
			char orientacion = '-';
			
			switch (orientacionAux) {
			
			case 1: 
				if(board[posY][posX]==null & board[posY][posX-1]==null) {
					orientacion = 'O';

					caguano = new Caguanos(posX, posY, orientacion, cantOcupantes, fecha, alcanceTiro, colorConfetti);
					
					carros.add(caguano);
					
					board[caguano.getPosY()][caguano.getPosX()]="C";
					board[caguano.getPosY()][caguano.getPosX()-1]="C";

					
					respuesta = true;
				}
				
				else {
					throw new Exception();
				}
			
			case 2: 
				if(board[posY][posX]==null & board[posY][posX+1]==null) {
					orientacion = 'E';

					caguano = new Caguanos(posX, posY, orientacion, cantOcupantes, fecha, alcanceTiro, colorConfetti);
					
					carros.add(caguano);
					
					board[caguano.getPosY()][caguano.getPosX()]="C";
					board[caguano.getPosY()][caguano.getPosX()+1]="C";
					
					respuesta = true;
				}
				
				else {
					throw new Exception();
				}
				
			}
				
		}
		catch(Exception e) {
			
			respuesta = false;
			
		}
		return false;
	}

	private boolean crearTrupalla() {
    	boolean respuesta;
    	
    	Trupalla trupalla;
		/* 
		 *  El metodo generará aleatoriamente:
		 *  - La fecha
		 *  - La cantidad de ocupantes
		 *  - El nivel de armadura
		 *  - El nombre del controlador
		 */
		String dia = Integer.toString((int)(Math.random() * ((31 - 1) + 1)) + 1);
		String mes = Integer.toString((int)(Math.random() * ((12 - 1) + 1)) + 1);
		String ano = Integer.toString((int)(Math.random() * ((2020 - 1990) + 1)) + 1990);
		
		String fecha = (dia+"/"+mes+"/"+ano);
		
		int cantOcupantes = (int)(Math.random() * ((46 - 1) + 1)) + 1;
		
		int nivelArmadura = (int)(Math.random() * ((5 - 1) + 1)) + 1;
		
		int nombreAux = (int)(Math.random() * ((4 - 1) + 1)) + 1;
		
		String nombreControlador = "";
		
		switch(nombreAux) {
		
		case 1: nombreControlador = "TENIENTE CAVIERES";
				break;
			
		case 2: nombreControlador = "BELENCITA";
				break;
			
		case 3: nombreControlador = "VALDERRAMA";
				break;
			
		case 4: nombreControlador = "GENERAL ROZAS";
				break;
			
		}
		
		try {
			
			int posX =  (int)(Math.random() * ((14 - 0) + 1)) + 0;
			int posY =  (int)(Math.random() * ((14 - 0) + 1)) + 0;
			
			int orientacionAux = (int)(Math.random() * ((4 - 1) + 1)) + 1;
			
			char orientacion = '-';
			
			switch (orientacionAux) {
			
			case 1: 
					if(board[posY][posX]==null) {
						orientacion = 'N';
						
						trupalla = new Trupalla(posX, posY, orientacion, cantOcupantes, fecha, nivelArmadura, nombreControlador);
						
						carros.add(trupalla);
						
						board[trupalla.getPosY()][trupalla.getPosX()]="T";

						
						respuesta = true;

					}
					else {
						throw new Exception();
					}
			
			case 2: 
				if(board[posY][posX]==null) {
					orientacion = 'S';
					
					trupalla = new Trupalla(posX, posY, orientacion, cantOcupantes, fecha, nivelArmadura, nombreControlador);
					
					carros.add(trupalla);
					
					board[trupalla.getPosY()][trupalla.getPosX()]="T";

					
					respuesta = true;

				}
				else {
					throw new Exception();
				}
			case 3: 
				if(board[posY][posX]==null) {
					orientacion = 'O';
					
					trupalla = new Trupalla(posX, posY, orientacion, cantOcupantes, fecha, nivelArmadura, nombreControlador);
					
					carros.add(trupalla);
					
					board[trupalla.getPosY()][trupalla.getPosX()]="T";

					
					respuesta = true;

				}
				else {
					throw new Exception();
				}
			
			case 4: 
				if(board[posY][posX]==null) {
					orientacion = 'E';
					
					trupalla = new Trupalla(posX, posY, orientacion, cantOcupantes, fecha, nivelArmadura, nombreControlador);
					
					carros.add(trupalla);
					
					board[trupalla.getPosY()][trupalla.getPosX()]="T";

					
					respuesta = true;

				}
				else {
					throw new Exception();
				}
				
			}
				
		}
		catch(Exception e) {
			
			respuesta = false;
			
		}
		return false;
	}
	
    

	public void lanzarHuevo(){

    }
    
    
    public void generarMapa() {
    	
    	do {
    	
        	try {
        		
        		int random = (int)(Math.random() * ((3 - 1) + 1)) + 1;
        		
        		switch(random) {
        		
        		case 1: 
        				if(contadorKromis<=3) {
        					if(crearKromi()) {
        						contadorKromis++;
        						break;
        					}
        					else {
        						continue;
        					}
        				}
        				else {
        					continue;
        				}

        			
        		case 2: 
    					if(contadorCaguanos<=5) {
        					if(crearCaguanos()) {
        						contadorCaguanos++;
        						break;
        					}
        					else {
        						continue;
        					}
    					}
    					else {
    						continue;
    					}
        		case 3: 
    					if(contadorTrupallas<=10) {
        					if(crearTrupalla()) {
        						contadorTrupallas++;
        						break;
        					}
        					else {
        						continue;
        					}
    					}
    					else {
    						break;
    					}
        		}
        	}
    	
    	catch(Exception e) {
    			System.out.println("Hay un error");
    		}
    	}while(carros.size()<18);
    }

    public void mostrarMatriz(){
    	
        for(int ext = 0; ext < this.board.length; ext++) {
        	
        	System.out.println(" ");
        	
        	for(int inter = 0; inter < this.board[ext].length; inter++) {
        		
        		String posicionAux = this.board[ext][inter];
        		
        		if(this.board[ext][inter]==null) {
        			
        			posicionAux = " ";
        			System.out.printf("%-2s %-2s", "|",posicionAux);
        		}
        		
        		else {
        			
        			System.out.printf("%-2s %-2s", "|",this.board[ext][inter]);
        		}
        	}
        }
    }

    public static void calcularPuntaje(){

    }


    /*
    * GETTERS Y SETTERS 
    */

    public String[][] getBoard(){
        return this.board;
    }

    public ArrayList<Carro> getCarros(){
        return this.carros;
    }

    public ArrayList<Huevo> getHuevos(){
        return this.huevos;
    }

    public void setBoard(String [][] board){
        this.board = board;
    }

    public void setCarros(ArrayList<Carro> carros){
        this.carros = carros;
    }

    public void setHuevos(ArrayList<Huevo> huevos){
        this.huevos = huevos;
    }

    public String toString(){
    	String string = "";
        return string;
    }

}
