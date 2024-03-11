import java.util.ArrayList;

public class TiendaVehiculos {
	private ArrayList<Vehiculo> catalogo = new ArrayList<Vehiculo>();


	public ArrayList<Cuenta> clientes = new ArrayList<Cuenta>();




	public TiendaVehiculos() {
		throw new UnsupportedOperationException();
	}

	public void agregarVeiculoCatalogo(Vehiculo vehiculo) {

		catalogo.add(vehiculo);
	}


	public void buscarVehiculosPorMarca(Vehiculo vehiculo) {

		for (Vehiculo v : catalogo) {
			if (v.getMarca().equals(vehiculo.getMarca())) {
				System.out.println(v);
			}
		}
	}
	public void buscarVehiculosPorModelo(Vehiculo vehiculo) {

		for (Vehiculo v : catalogo) {
			if (v.getModelo().equals(vehiculo.getModelo())) {
				System.out.println(v);
			}
		}
	}

	public void buscarVehiculosPorTipo(Vehiculo vehiculo) {

		for (Vehiculo v : catalogo) {
			if (v.getTipo().equals(vehiculo.getTipo())) {
				System.out.println(v);
			}
		}
	}

	//Metodo que agregar un cliente a la lista de clientes
	public void agregarCliente(Cuenta cuenta) {
		clientes.add(cuenta);
	}
}