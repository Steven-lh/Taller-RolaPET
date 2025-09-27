package servicio;

import modelo.Proveedor;
import java.util.ArrayList;
import java.util.List;

public class GestorProveedores {

    private final List<Proveedor> proveedores = new ArrayList<>();

    public void registrar(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public void eliminar(String id) {
        proveedores.removeIf(p -> p.getId().equals(id));
    }

    public Proveedor buscarPorId(String id) {
        return proveedores.stream()
                          .filter(p -> p.getId().equals(id))
                          .findFirst()
                          .orElse(null);
    }

    public List<Proveedor> listar() {
        return new ArrayList<>(proveedores);
    }
    
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
