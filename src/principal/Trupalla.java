package principal;

public class Trupalla extends Carro {
	
	/*
	 * Campos de clase Trupalla 
	 */

	private int nivelArmadura;
	private String nombreControlador;
	
	/*
	 * Constructor clase Trupalla, requiere campos de superclase
	 */

	public Trupalla(int posX, int posY, char orientacion, int cantOcupantes, String fecha, int nivelArmadura, String nombreControlador) {
		super(posX, posY, orientacion, cantOcupantes, fecha);
		
		this.nivelArmadura = nivelArmadura;
		this.nombreControlador = nombreControlador;
	}
	
	/*
	 * Getters y Setters de clase Trupalla
	 */

	public int getNivelArmadura() {
		return nivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	public String getNombreControlador() {
		return nombreControlador;
	}

	public void setNombreControlador(String nombreControlador) {
		this.nombreControlador = nombreControlador;
	}
}
