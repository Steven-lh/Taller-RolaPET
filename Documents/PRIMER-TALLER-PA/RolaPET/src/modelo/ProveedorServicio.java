package modelo;

// Proveedor que ofrece servicios como lavaderos o talleres.
public class ProveedorServicio extends Proveedor {

    // Constructor que inicializa los datos del proveedor de servicios.
    public ProveedorServicio(String id, String nombre, String email, String password, String direccion) {
        super(id, nombre, email, password, direccion);
    }
}
