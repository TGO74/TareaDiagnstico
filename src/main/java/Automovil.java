public class Automovil extends Vehiculo {

	// Atributos
	private int potenciaHP;
	private int numeroPuertas;
	private Double tamañoMotor;

	// Constructor
	public Automovil(String marca, String modelo, int añoFabricacion, double peso, double precio, int stock, String patente, String tipo, int potenciaHP, int numeroPuertas, Double tamañoMotor) {
		super(marca, modelo, añoFabricacion, peso, precio, stock, patente, tipo);
		this.potenciaHP = potenciaHP;
		this.numeroPuertas = numeroPuertas;
		this.tamañoMotor = tamañoMotor;
	}

	// Métodos getters y setters

	// Método heredado de la clase Vehiculo para calcular la velocidad máxima
	@Override
	public Double calcularVelocidadMaxima() {
		return (double) (potenciaHP / peso) * 10;
	}
}
