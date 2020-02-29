package objetos;

/**
 * Corresponde a la Clase Madre de los todos los Carros que estaran distruidos en el tablero
 * @author  katramlar, ivillarroelr, victorSoto2712
 *
 */

public abstract class Carro {

	/**
	 * Posicion X del Carro
	 */
	protected int posX;
	/**
	 * Posicion X-2 del Carro para Caguanos
	 */
	protected int posX2;
	/**
	 * Posicion Y del Carro
	 */
	protected int posY;
	/**
	 * Posicion Y-2 del Carro para Kromis
	 */
	protected int posY2;
	/**
	 * Posicion Y-3 del Carro para Kromis
	 */
	protected int posY3;
	/**
	 * Orientacion esta puede ser Norte Sur Este Oeste (primera letra)
	 */
	protected char orientacion;
	/**
	 * Corresponde a la cantidad de ocupantes que van en el Carro
	 */
	protected int cantOcupantes;
	/**
	 * Corresponde a la fecha de ingreso a la institucion
	 */
	protected String fecha;
	/**
	 * Corresponde a la cantidad de vidas restantes del carro
	 */
	protected  int vidas;
	/**
	 * Corresponde a un String que indica que tipo de Carro es
	 */
	protected String tipoObj;

	/**
	*Este constructor de la clase almacenara informacion de todos los carros 
	*Ademas entrega informacion adicional al usuario, en caso de ser necesario
	*
	*/
	
	
	public Carro(int posX, int posY, char orientacion, int cantOcupantes, String fecha) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.orientacion = orientacion;
		this.cantOcupantes = cantOcupantes;
		this.fecha = fecha;
	}
	
	public void disminuirVida() {
		this.vidas--;
	}
	
	/*
	 * Getters y Setters de clase Carro
	 */
	public int getVidas() {
		return vidas;
	}
	
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public char getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(char orientacion) {
		this.orientacion = orientacion;
	}

	public int getCantOcupantes() {
		return cantOcupantes;
	}

	public void setCantOcupantes(int cantOcupantes) {
		this.cantOcupantes = cantOcupantes;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTipoObj() {
		return tipoObj;
	}

	public void setTipoObj(String tipoObj) {
		this.tipoObj = tipoObj;
	}

	public int getPosX2() {
		return posX2;
	}

	public void setPosX2(int posX2) {
		this.posX2 = posX2;
	}

	public int getPosY2() {
		return posY2;
	}

	public void setPosY2(int posY2) {
		this.posY2 = posY2;
	}

	public int getPosY3() {
		return posY3;
	}

	public void setPosY3(int posY3) {
		this.posY3 = posY3;
	}

}
