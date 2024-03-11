import java.util.ArrayList;

public class Compra {
	private Cliente cliente;
	private ArrayList<Vehiculo> vehiculosComprados;
	private String direccionEnvio;



	// Constructor
	Compra(Cliente cliente, ArrayList<Vehiculo> vehiculosComprados, Cliente informacionEnvio) {
		this.cliente = cliente;
		this.vehiculosComprados = vehiculosComprados;
		this.direccionEnvio = informacionEnvio;
	}

// Getters and Setters
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Vehiculo> getVehiculosComprados() {
  	  		return this.vehiculosComprados;}

	public void setVehiculosComprados(Object vehiculosAgregados) {
		this.vehiculosComprados = vehiculosComprados;
	}

	public String getInformacionEnvio() {
		return this.direccionEnvio;
	}

	public void setInformacionEnvio(String informacionEnvio) {
		this.direccionEnvio = informacionEnvio;
	}

	//Methods

	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculosComprados.add(vehiculo);
	}

	public void eliminarVehiculo(Vehiculo vehiculo) {
		vehiculosComprados.remove(vehiculo);
	}

	public double calcularTotal() {
		double total = 0;
		for (Vehiculo v : vehiculosComprados) {
			total += v.getPrecio();
		}
		return total;
	}

	public void vaciarCarrito() {
		vehiculosComprados.clear();
	}

	public void mostrarVehiculosComprados() {
		for (Vehiculo v : vehiculosComprados) {
			System.out.println(v.getMarca() + " " + v.getModelo() + " " + v.getPrecio());
		}
	}

	public void mostrarInformacionCompra() {
		System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
		System.out.println("Direccion de envio: " + direccionEnvio);
		System.out.println("Vehiculos comprados: ");
		mostrarVehiculosComprados();
		System.out.println("Total: " + calcularTotal());
	}

	public void confirmarCompra() {
		System.out.println("Compra confirmada");
	}

	public void cancelarCompra() {
		System.out.println("Compra cancelada");
	}


}