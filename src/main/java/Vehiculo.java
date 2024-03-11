public abstract class Vehiculo {
	// Atributos
	protected String marca;
	protected String modelo;
	protected int añoFabricacion;
	protected double peso;
	protected double precio;
	protected int stock;

	protected String patente;

	protected String tipo;

	// Constructor
	public Vehiculo(String marca, String modelo, int añoFabricacion, double peso, double precio, int stock, String patente, String tipo) {
		this.marca = marca;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
		this.peso = peso;
		this.precio = precio;
		this.stock = stock;
		this.patente = "";
		this.tipo = "";
	}



	//Getters y Setters
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAñoFabricacion() {
		return this.añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public Double getPeso() {
		return this.peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getPrecio() {
		return this.precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//Metodos
	public abstract Double calcularVelocidadMaxima();


	public String toStringVehiculo() {
		return "Marca: " + marca + "\nModelo: " + modelo + "\nAño: " + añoFabricacion + "\nStock: " + stock + "\nPrecio: " + precio + "\nPeso: " + peso;
	}

}
