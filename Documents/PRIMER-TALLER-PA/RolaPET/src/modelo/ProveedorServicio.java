package modelo;

/**
 * Proveedor que ofrece servicios (lavaderos, talleres, etc.).
 */
public class ProveedorServicio extends Proveedor {

    public ProveedorServicio(String id, String nombre, String email, String password, String direccion) {
        super(id, nombre, email, password, direccion);
    }

    // Métodos específicos de servicios si se requieren
}
