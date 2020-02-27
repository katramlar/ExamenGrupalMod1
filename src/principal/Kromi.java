package principal;

public class Kromi extends Carro {
	
	/*
	 * Campos de clase Kromi 
	 */
	

	private int anoFabricacion;
	private String marca;
	
	/*
	 * Constructor clase Kromi, requiere campos de superclase
	 */

	public Kromi(int posX, int posY, char orientacion, int cantOcupantes, String fecha, int anoFabricacion, String marca) {
		super(posX, posY, orientacion, cantOcupantes, fecha);
		
		this.anoFabricacion = anoFabricacion;
		this.marca = marca;
		
	}
	
	/*
	 * Getters y Setters instancia Kromi
	 */

	public int getAnoFabricacion() {
		return anoFabricacion;
	}

	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
