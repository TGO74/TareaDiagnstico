import java.util.ArrayList;

public class Cliente {

	//Attributes
	private String nombre;
	private String apellido;
	private int edad;

	public String email;
	public String direccion;
	public String telefono;


	private Cuenta cuentaCliente;
	private CarritoDeCompra carritoDeCompra;
	private ArrayList<CarritoDeCompra> carrito = new ArrayList<CarritoDeCompra>();
	private ArrayList<Compra> compras = new ArrayList<Compra>();


	//Constructor
	public Cliente(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.carritoDeCompra = new CarritoDeCompra();
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	//getters and setters

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apelliido) {
		this.apellido = apelliido;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	public CarritoDeCompra getCarritoCompra() {
		return this.carritoDeCompra;
	}

	public void setCarritoCompra(CarritoDeCompra carritoDeCompra) {
		this.carritoDeCompra = carritoDeCompra;
	}

	public Cuenta getCuentaCliente() {
		return this.cuentaCliente;
	}

	public void setCuentaCliente(Cuenta cuentaCliente) {
		this.cuentaCliente = cuentaCliente;
	}

	public ArrayList<CarritoDeCompra> getCarrito() {
		return this.carrito;
	}

	public void setCarrito(ArrayList<CarritoDeCompra> carrito) {
		this.carrito = carrito;
	}

	public ArrayList<Compra> getCompras() {
		return this.compras;
	}

	public void setCompras(ArrayList<Compra> compras) {
		this.compras = compras;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	//Methods
	public void agregarVehiculoAlCarrito(Vehiculo vehiculo) {
		this.carritoDeCompra.agregarVehiculoCarrito(vehiculo);
	}

	public void eliminarVehiculoDelCarrito(Vehiculo vehiculo) {
		this.carritoDeCompra.eliminarVehiculoCarrito(vehiculo);
	}

	//Metodo que confirma la compra llamando al metodo de la clase Compra
	public void confirmarCompra() {
		this.carritoDeCompra.mostrarVehiculosAgregados();
		this.carritoDeCompra.calcularSubtotal();
		this.carritoDeCompra.pedirDireccionEnvio();
	}

	// Método que realiza la compra (se debe proporcionar información de envío)
	public void realizarCompra() {
		//Metodo que pide direccion de envio al cliente al realizar la compra
		this.carritoDeCompra.pedirDireccionEnvio();
		//metodo que registra la informacion de envio
		this.carritoDeCompra.setInformacionEnvio("Direccion de envio");

		//Metodo que pide informacion de pago al cliente al realizar la compra
		this.carritoDeCompra.pedirInformacionPago();
		//Metodo que muestra los vehiculos agregados al carrito
		this.carritoDeCompra.mostrarVehiculosAgregados();

		//metodo que registra metodo de pago
		this.carritoDeCompra.setInformacionPago("Informacion de pago");


		Compra compra = new Compra(this, this.carritoDeCompra.getVehiculosAgregados(), this);
		this.compras.add(compra);
		this.carritoDeCompra.vaciarCarrito(); // Vaciar el carrito después de realizar la compra
	}

	//Metodo del cliente para registrarse, indicando su nombre y apellido,email, direccion y telefono
	public void registrarse(String nombre, String apellido, String email, String direccion, String telefono) {

		this.cuentaCliente = new Cuenta(nombre, apellido, email, direccion, telefono);
	}



}