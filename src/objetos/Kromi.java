package objetos;


/**
 * @author katramlar, ivanillaroelr, victorSoto2712
 *
 */
public class Kromi extends Carro {
	
		
	/**
	 * Ano de fabricacion de la Kromi
	 */
	private int anoFabricacion;
	/**
	 * Marca de la Kromi
	 */
	private String marca;

	/**
	*Este constructor almacenara informacion proporionada por el Tablero 
	*Ademas entrega informacion adicional al usuario, en caso de ser necesario
	*
	*/
	

	public Kromi(int posX, int posY, int posY2, int posY3, char orientacion, int cantOcupantes, String fecha, int anoFabricacion, String marca) {
		
		super(posX, posY, orientacion, cantOcupantes, fecha);
		
		this.posY2 = posY2;
		this.posY3 = posY3;
		
		this.anoFabricacion = anoFabricacion;
		this.marca = marca;
		
		this.vidas = 3;
		this.setTipoObj("Kromi");
		
	}
	
	

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

	public String toString() {
		
		String mensaje = ( " Tipo de objeto: " + this.tipoObj + "\n"
						  +" Posicion X del objeto: " + this.posX + "\n"
						  +" Posicion Y-1 del objeto: " + this.posY + "\n"
						  +" Posicion Y-2 del objeto: " + this.posY2 + "\n"
						  +" Posicion Y-3 del objeto: " + this.posY3+"\n"
						  +" Orientacion del objeto: " + Character.toString(this.orientacion) + "\n"
						  +" Cantidad de ocupantes del objeto: " + this.cantOcupantes + "\n"
						  +" Fecha de ingreso a la institucion del objeto: " + this.fecha + "\n"
						  +" Ano de fabricacion del objeto: " + this.anoFabricacion + "\n"
						  +" Marca del objeto: " + this.marca + "\n"
						  +" Vidas restantes del objeto: " + this.vidas + "\n");				
		
		return mensaje;
		
	}
	
}
