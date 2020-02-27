package principal;
import java.util.ArrayList;
import principal.Carro;
import principal.Huevo;

public class Tablero{

    /*
    *  VARIABLES DE INSTANCIA 
    */

    private String[][] board = new String[15][15];

    private ArrayList<Carro> carros = new ArrayList<Carro>();

    private ArrayList<Huevo> huevos = new ArrayList<Huevo>();

    /*
    * CONSTRUCTORES 
    */
    public Tablero(){
        super();
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
    
    public void crearCarro(){
    	
    	try {
    		
    		int random = (int)(Math.random() * ((3 - 1) + 1)) + 1;
    		
    		switch(random) {
    		
    		case 1: Carro kromi = new Kromi();
    				carros.add(kromi);
    				break;
    			
    		case 2: Carro trupalla = new Trupalla();
    				break;
    			
    		case 3: Carro caguenos = new Caguenos();
    				break;
    		
    		}
    		
    		
    	}
    	catch(Exception e) {
    		
    	}
    	finally {
    		
    	}
    }

    public void lanzarHuevo(){

    }
    
    
    private void generarMapa() {
    	
    	for(int ext = 0; ext < 18; ext++) {
    	
    	try {
    		
    	}
    	
    	catch(Exception e) {
    		
    	}
    	
    	finally {
    		
    	}
    		
    	}
    }

    public void mostrarMatriz(){
    	
        for(int ext = 0; ext < this.board.length; ext++) {
        	
        	System.out.println(" ");
        	
        	for(int inter = 0; inter < this.board[ext].length; inter++) {
        		
        		System.out.printf("%-2s %-2s", "|",this.board[ext][inter]);
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
