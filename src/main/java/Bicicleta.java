public class Bicicleta extends Vehiculo {

	// Atributos
	private String materialConstruccion;
	private int fuerzaDePedaleo;
	private int numeroVelocidades;

	// Constructor

	public Bicicleta(String marca, String modelo, int añoFabricacion, double peso, double precio, int stock, String materialConstruccion, int fuerzaDePedaleo, int numeroVelocidades, String patente, String tipo) {
		super(marca, modelo, añoFabricacion, peso, precio, stock, patente, tipo);
		this.materialConstruccion = materialConstruccion;
		this.fuerzaDePedaleo = fuerzaDePedaleo;
		this.numeroVelocidades = numeroVelocidades;
	}

	// Getters y setters

	public String getMaterialConstruccion() {
		return this.materialConstruccion;
	}

	public void setMaterialConstruccion(String materialConstruccion) {
		this.materialConstruccion = materialConstruccion;
	}

	public int getFuerzaDePedaleo() {
		return this.fuerzaDePedaleo;
	}

	public void setFuerzaDePedaleo(int fuerzaDePedaleo) {
		this.fuerzaDePedaleo = fuerzaDePedaleo;
	}

	public int getNumeroVelocidades() {
		return this.numeroVelocidades;
	}

	public void setNumeroVelocidades(int numeroVelocidades) {
		this.numeroVelocidades = numeroVelocidades;
	}



	@Override
	public Double calcularVelocidadMaxima() {
		return (double) (fuerzaDePedaleo * numeroVelocidades) / peso;
	}
}