package principal;

public class Main {

	public static void main(String[] args) {
		
		Tablero board = new Tablero();
		String[][] boardS = new String[15][15];
		
        for(int ext = 0; ext < boardS.length; ext++) {
        	for(int inter = 0; inter < boardS[ext].length; inter++) {
        		boardS[ext][inter] = " ";
        	}
        }
        
        boardS[0][0] = "K";
        boardS[1][0] = "K";
        boardS[2][0] = "K";
		
		board.setBoard(boardS);
		board.mostrarMatriz();

		
		
	}
}
