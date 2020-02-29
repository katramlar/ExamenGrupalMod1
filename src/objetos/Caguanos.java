package objetos;

/**
 * @author katramlar, ivanillaroelr, victorSoto2712
 *
 */
public class Caguanos extends Carro {
	
	
	/**
	 * Esta variable hace referencia al alcance de tiro del Caguano
	 */
	private int alcanceTiro;
	/**
	 * Esta variable hace referencia al color del confetti que dispara el Caguano
	 */
	private String colorConfetti;


	/**
	*Este constructor almacenara informacion proporionada por el Tablero 
	*Ademas entrega informacion adicional al usuario, en caso de ser necesario
	*
	*/
	

	public Caguanos(int posX, int posX2, int posY, char orientacion, int cantOcupantes, String fecha, int alcanceTiro, String colorConfetti) {
		super(posX, posY, orientacion, cantOcupantes, fecha);
		
		this.posX2 = posX2;
		
		this.alcanceTiro = alcanceTiro;
		this.colorConfetti = colorConfetti;
		
		this.vidas = 2;
		this.setTipoObj("Caguanos");
		
	}
	

	
	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfetti() {
		return colorConfetti;
	}

	public void setColorConfetti(String colorConfetti) {
		this.colorConfetti = colorConfetti;
	}

	public int getPosX2() {
		return posX2;
	}

	public void setPosX2(int posX2) {
		this.posX2 = posX2;
	}
	
	public String toString() {
		
		String mensaje = ( " Tipo de objeto: " + this.tipoObj + "\n"
						  +" Posicion X del objeto: " + this.posX + "\n"
						  +" Posicion Y-1 del objeto: " + this.posY + "\n"
						  +" Posicion X-2 del objeto: " + this.posX2 + "\n"
						  +" Orientacion del objeto: " + Character.toString(this.orientacion) + "\n"
						  +" Cantidad de ocupantes del objeto: " + this.cantOcupantes + "\n"
						  +" Fecha de ingreso a la institucion del objeto: " + this.fecha + "\n"
						  +" Alcance de tiro del objeto: " + this.alcanceTiro + "\n"
						  +" Color del confetti del objeto: " + this.colorConfetti + "\n"
						  +" Vidas restantes del objeto: " + this.vidas + "\n");				
		
		return mensaje;
		
	}
	
}
