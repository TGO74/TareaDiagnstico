public class Motocicleta extends Vehiculo {
	private int potenciaHP;
	private String tipoMotor;
	private String suspension;

	// Constructor
	public Motocicleta(String marca, String modelo, int añoFabricacion, double peso, double precio, int stock, int potenciaHP, String tipoMotor, String suspension, String patente, String tipo) {
		super(marca, modelo, añoFabricacion, peso, precio, stock, patente, tipo);
		this.potenciaHP = potenciaHP;
		this.tipoMotor = tipoMotor;
		this.suspension = suspension;
	}

	public int getPotenciaHP() {
		return this.potenciaHP;
	}

	public void setPotenciaHP(int potenciaHP) {
		this.potenciaHP = potenciaHP;
	}

	public String getTipoMotor() {
		return this.tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getSuspension() {
		return this.suspension;
	}

	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}


	//Metodos

	@Override
	public Double calcularVelocidadMaxima() {
		return (double) (potenciaHP * 2) / peso;
	}
}