package objetos;

public class Trupalla extends Carro {
	

	/**
	 * Nivel de armadura de la Trupalla
	 */
	private int nivelArmadura;
	/**
	 * Nombre del controlador de la trupalla
	 */
	private String nombreControlador;
	
	/*
	 * Constructor clase Trupalla, requiere campos de superclase
	 */

	public Trupalla(int posX, int posY, char orientacion, int cantOcupantes, String fecha, int nivelArmadura, String nombreControlador) {
		super(posX, posY, orientacion, cantOcupantes, fecha);
		
		this.nivelArmadura = nivelArmadura;
		this.nombreControlador = nombreControlador;
		
		this.vidas = 1;
		this.setTipoObj("Trupalla");
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
	
	public String toString() {
		
		String mensaje = ( " Tipo de objeto: " + this.tipoObj + "\n"
						  +" Posicion X del objeto: " + this.posX + "\n"
						  +" Posicion Y-1 del objeto: " + this.posY + "\n"
						  +" Orientacion del objeto: " + Character.toString(this.orientacion) + "\n"
						  +" Cantidad de ocupantes del objeto: " + this.cantOcupantes + "\n"
						  +" Fecha de ingreso a la institucion del objeto: " + this.fecha + "\n"
						  +" Nivel de armadura del objeto: " + this.nivelArmadura + "\n"
						  +" Nombre del conductor del objeto: " + this.nombreControlador + "\n"
						  +" Vidas restantes del objeto: " + this.vidas + "\n");				
		
		return mensaje;
		
	}
}
