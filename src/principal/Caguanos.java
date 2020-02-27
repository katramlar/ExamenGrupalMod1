package principal;

public class Caguanos extends Carro {
	
	/*
	 * Campos de clase Caguanos 
	 */
	
	private int alcanceTiro;
	private String colorConfetti;
	
	/*
	 * Constructor clase Caguenos, requiere campos de superclase
	 */

	public Caguanos(int posX, int posY, char orientacion, int cantOcupantes, String fecha, int alcanceTiro, String colorConfetti) {
		super(posX, posY, orientacion, cantOcupantes, fecha);
		
		this.alcanceTiro = alcanceTiro;
		this.colorConfetti = colorConfetti;
		
	}
	
	/*
	 * Getters y Setters de clase Caguanos
	 */
	
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

	
	
}
