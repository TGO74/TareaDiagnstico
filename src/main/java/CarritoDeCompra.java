import java.util.ArrayList;

public class CarritoDeCompra {

	//Attributes
	private ArrayList<Vehiculo> vehiculosAgregados;
	private String informacionEnvio;


	//Constructor
	public CarritoDeCompra() {
		this.vehiculosAgregados = new ArrayList<Vehiculo>();
	}

	public ArrayList<Vehiculo> getVehiculosAgregados() {
		return this.vehiculosAgregados;
	}


	public void setVehiculosAgregados(ArrayList<Vehiculo> vehiculosAgregados) {
		this.vehiculosAgregados = vehiculosAgregados;
	}

//Methods

	//Metodo que agrega un vehiculo al carrito de compra
	public void agregarVehiculoCarrito(Vehiculo vehiculo) {
		vehiculosAgregados.add(vehiculo);
	}

	//Metodo que elimina un vehiculo del carrito de compra
	public void eliminarVehiculoCarrito(Vehiculo vehiculo) {
		vehiculosAgregados.remove(vehiculo);
	}


	//Metodo que calcula el subtotal de los vehiculos agregados al carrito, tomando el precio de cada vehiculo y sumandolos
	public double calcularSubtotal() {
		double subtotal = 0;
		for (Vehiculo v : vehiculosAgregados) {
			subtotal += v.getPrecio();
		}
		return subtotal;
	}

	//Metodo que vacia el carrito de compra
	public void vaciarCarrito() {
		vehiculosAgregados.clear();
	}

	//Metodo que pide la direccion de envio al cliente al realizar la compra
	public void pedirDireccionEnvio() {
		System.out.println("Ingrese la dirección de envío: ");
	}
	//metodo que registra la informacion de envio
	public void setInformacionEnvio(String informacionEnvio) {
		this.informacionEnvio = informacionEnvio;
	}

	//Metodo que pide informacion de pago al cliente al realizar la compra
	public void pedirInformacionPago() {
		System.out.println("Ingrese la información de pago: ");

	}



	//Metodo que muestra los vehiculos agregados al carrito

	public void mostrarVehiculosAgregados() {
		for (Vehiculo v : vehiculosAgregados) {
			System.out.println(v);
		}
	}


	public void setInformacionPago(String informacionDePago) {


	}
}