package servicio;

import modelo.Proveedor;
import java.util.ArrayList;
import java.util.List;

/** Servicio para administrar el registro y gestión de proveedores. */
public class GestorProveedores {

    private final List<Proveedor> proveedores = new ArrayList<>();

    /** Registra un nuevo proveedor. */
    public void registrar(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    /** Elimina un proveedor según su identificador. */
    public void eliminar(String id) {
        proveedores.removeIf(p -> p.getId().equals(id));
    }

    /** Busca un proveedor por su identificador. */
    public Proveedor buscarPorId(String id) {
        return proveedores.stream()
                          .filter(p -> p.getId().equals(id))
                          .findFirst()
                          .orElse(null);
    }

    /** Devuelve una lista con todos los proveedores registrados. */
    public List<Proveedor> listar() {
        return new ArrayList<>(proveedores);
    }
    
    /** Actualiza los datos de un proveedor existente. */
    public void actualizarProveedor(Proveedor datos) {
        for (Proveedor p : proveedores) {
            if (p.getId().equals(datos.getId())) {
                p.setNombre(datos.getNombre());
                p.setEmail(datos.getEmail());
                p.setPassword(datos.getPassword());
                p.setDireccion(datos.getDireccion());
                break;
            }
        }
    }
}
