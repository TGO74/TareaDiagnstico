import java.util.ArrayList;

public class Cuenta {

    private String NombreCliente;
    private String ApellidoCliente;
    private String email;

    private String direccion;

    private String telefono;


    //Constructor
    public Cuenta(String NombreCliente, String ApellidoCliente, String email, String direccion, String telefono) {
        this.NombreCliente = NombreCliente;
        this.ApellidoCliente = ApellidoCliente;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //getters and setters

    public String getNombreCliente() {
        return this.NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getApellidoCliente() {
        return this.ApellidoCliente;
    }

    public void setApellidoCliente(String ApellidoCliente) {
        this.ApellidoCliente = ApellidoCliente;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Metodos

    // Método que agrega la cuenta de un cliente a la lista de clientes en la tienda de vehículos
    public void agregarCuenta(Cuenta cuenta, TiendaVehiculos tienda) {
        tienda.agregarCliente(cuenta);
    }

    // Método que crea una cuenta para un cliente
    public void crearCuenta(Cliente cliente, TiendaVehiculos tienda) {
        Cuenta cuenta = new Cuenta(cliente.getNombre(), cliente.getApellido(), cliente.getEmail(), cliente.getDireccion(), cliente.getTelefono());
        cuenta.agregarCuenta(cuenta, tienda);
    }

}


