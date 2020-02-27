package objetos;

public class Huevo {
	
	/*
	 * Campos de la clase huevo
	 */
	
	private int posX;
	private int posY;
	private int puntaje;

	/*
	 * Constructor parametrizado clase Huevo
	 */

	
	public Huevo(int posX, int posY, int puntaje) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.puntaje = puntaje;

	}
	
	/*
	 * Getters y Setters clase Huevo
	 */

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
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
}
