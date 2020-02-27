package principal;

public abstract class Carro {

	protected int posX;
	protected int posY;
	protected char orientacion;
	protected int cantOcupantes;
	protected String fecha;

	public Carro(int posX, int posY, char orientacion, int cantOcupantes, String fecha) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.orientacion = orientacion;
		this.cantOcupantes = cantOcupantes;
		this.fecha = fecha;
	}
	
	/*
	 * Getters y Setters de clase Carro
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

}
