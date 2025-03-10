/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.aplicacion;


/**
 *
 *  @author Jenifer
 */
public class Cliente {
    private static int contadorClientes = 0;
    private int codigo;
    private String nombre;
    private String dni;
    private String telefono;
/**
 * Esta clase recoge los datos del cliente
 */
    
    public Cliente(String nombre, String dni, String telefono) throws Exception {
        // Validación del DNI, si no es correcto no creará el objeto
        Utilidades.validarDNI(dni); 
        this.setNombre(nombre);
        this.setDni(dni);
        this.setTelefono(telefono);
        this.setCodigo(obtenerNumeroCliente());
    }

        private static int obtenerNumeroCliente() {
        contadorClientes++;
        return contadorClientes;
    }

    
    public String mostrarInformacion() {
        return "Código: " + getCodigo() + ", Nombre: " + getNombre() + ", DNI: " + getDni() + ", Teléfono: " + getTelefono();
    }

	private String getTelefono() {
		return telefono;
	}

	private void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	private String getDni() {
		return dni;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private int getCodigo() {
		return codigo;
	}

	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
