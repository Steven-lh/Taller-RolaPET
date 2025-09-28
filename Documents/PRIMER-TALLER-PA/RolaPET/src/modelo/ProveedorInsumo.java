package modelo;

/** Proveedor que ofrece insumos o productos físicos. */
public class ProveedorInsumo extends Proveedor {

    /** Constructor que inicializa los datos del proveedor de insumos. */
    public ProveedorInsumo(String id, String nombre, String email, String password, String direccion) {
        super(id, nombre, email, password, direccion);
    }
}
