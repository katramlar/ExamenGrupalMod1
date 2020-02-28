package objetos;



/**Este objeto es quien proporcionara informacion de los tiro en el tablero
 * @author  katramlar, ivillarroelr, victorSoto2712
 *
 */
public class Huevo {
	
		
	private int posX;
	private int posY;
	private int puntaje;
	private String vehiculoGolpeado;

	/**
	*Este constructor almacenara información proporionada por el usuario 
	*por cada disparo, además del puntaje que puede obtener
	*
	*/
	
	public Huevo(int posX, int posY, int puntaje) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.puntaje = puntaje;

	}
	
	

	public int getPosX() {
		return this.posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return this.posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getPuntaje() {
		return this.puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	public String getVehiculoGolpeado() {
		return this.vehiculoGolpeado;
	}

	public void setVehiculoGolpeado(String vehiculoGolpeado) {
		this.vehiculoGolpeado = vehiculoGolpeado;
	}
	
	public String toString() {
		String mensaje = ("Hit: "+this.vehiculoGolpeado
						  +" Posicion X: "+this.posX
						  +" Posicion Y: "+this.posY
						  +" Puntaje: "+this.puntaje				
				);
		return mensaje;
	}
}
