# Sistema de Venta de Vehículos

## Descripción
Este sistema de venta de vehículos permite a los clientes comprar automóviles, motocicletas y bicicletas. Los clientes pueden registrar una cuenta en la tienda, buscar vehículos por marca, modelo o tipo, agregar vehículos a su carrito de compras, realizar compras proporcionando información de envío y pago, y ver el historial de compras realizadas.

## Características

# Clase Cliente

#### Atributos
- Nombre: String
- Apellido: String
- Edad: int
- Email: String
- Dirección: String
- Teléfono: String

#### Métodos
- Constructor(nombre, apellido, edad, email, dirección, teléfono): Crea un nuevo cliente con los atributos especificados.
- getters y setters para todos los atributos.

# Clase Vehículo

#### Atributos
- Marca: String
- Modelo: String
- Año de Fabricación: int
- Peso: double
- Precio: double
- Cantidad en Stock: int

#### Métodos
- Constructor(marca, modelo, año, peso, precio, stock): Crea un nuevo vehículo con los atributos especificados.
- getters y setters para todos los atributos.
- calcularVelocidadMaxima(): Calcula la velocidad máxima permitida del vehículo según su tipo y atributos específicos.

# Clase Automóvil (subclase de Vehículo)

#### Atributos
- Potencia en Caballos de Fuerza (HP): int
- Número de Puertas: int
- Tamaño del Motor: double

#### Métodos
- Constructor(marca, modelo, año, peso, precio, stock, potenciaHP, puertas, tamañoMotor): Crea un nuevo automóvil con los atributos especificados.
- getters y setters para todos los atributos.

# Clase Motocicleta (subclase de Vehículo)

#### Atributos
- Potencia en Caballos de Fuerza (HP): int
- Tipo de Motor: String
- Suspensión: String

#### Métodos
- Constructor(marca, modelo, año, peso, precio, stock, potenciaHP, tipoMotor, suspensión): Crea una nueva motocicleta con los atributos especificados.
- getters y setters para todos los atributos.

# Clase Bicicleta (subclase de Vehículo)

#### Atributos
- Material de Construcción: String
- Fuerza de Pedaleo: int
- Número de Velocidades: int

#### Métodos
- Constructor(marca, modelo, año, peso, precio, stock, material, fuerzaPedaleo, velocidades): Crea una nueva bicicleta con los atributos especificados.
- getters y setters para todos los atributos.

### Clase CarritoDeCompras

#### Atributos
- Lista de Vehículos: ArrayList<Vehículo>

#### Métodos
- Constructor(): Crea un nuevo carrito de compras vacío.
- agregarVehículo(vehículo): Agrega un vehículo al carrito de compras.
- eliminarVehículo(vehículo): Elimina un vehículo del carrito de compras.
- calcularSubtotal(): Calcula el subtotal de la compra sumando el precio de todos los vehículos en el carrito.

# Clase Compra

#### Atributos
- Cliente: Cliente
- Lista de Vehículos: ArrayList<Vehículo>
- Fecha de Compra: Date

#### Métodos
- Constructor(cliente, listaVehículos, fecha): Crea una nueva compra con los atributos especificados.
- getters y setters para todos los atributos.

# Clase TiendaDeVehículos

#### Atributos
- Catálogo de Vehículos: ArrayList<Vehículo>

#### Métodos
- Constructor(): Crea una nueva tienda de vehículos con un catálogo vacío.
- agregarVehículo(vehículo): Agrega un vehículo al catálogo de la tienda.
- buscarVehículosPorMarca(marca): Busca vehículos en el catálogo por marca.
- buscarVehículosPorModelo(modelo): Busca vehículos en el catálogo por modelo.
- buscarVehículosPorTipo(tipo): Busca vehículos en el catálogo por tipo.

## Diagrama de Clases

El diagrama de clases se encuentra en el repositorio Git junto con el código fuente Java.

## Repositorio Git

El repositorio Git contiene el código fuente Java del sistema y el diagrama de clases en formato PNG.


