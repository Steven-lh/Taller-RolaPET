package modelo;

/**
 * Proveedor que ofrece insumos o productos físicos (cascos, repuestos, etc.).
 */
public class ProveedorInsumo extends Proveedor {

    public ProveedorInsumo(String id, String nombre, String email, String password, String direccion) {
        super(id, nombre, email, password, direccion);
    }

    // Métodos específicos de insumos si se requieren
}
