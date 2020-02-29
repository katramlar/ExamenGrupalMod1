package objetos;



/**
 * @author katramlar, ivanillaroelr, victorSoto2712
 *
 */
public class Huevo {
	
	/**
	 * Posicion X del huevo lanzado
	 */
	private int posX;
	/**
	 * Posicion Y del huevo lanzado
	 */
	private int posY;
	/**
	 * Puntaje del Huevo lanzado
	 */
	private int puntaje;
	/**
	 * Tipo de vehiculo golpeado (solo si golpea uno)
	 */
	private String vehiculoGolpeado;

	/**
	*Este constructor almacenara informacion proporionada por el usuario 
	*por cada disparo, ademas del puntaje que puede obtener
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
