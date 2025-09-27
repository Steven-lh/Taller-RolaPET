package modelo;

/**
 * Clase base para cualquier persona en el sistema (Usuario, Proveedor, Administrador).
 */
public abstract class Persona {
    protected String id;
    protected String nombre;
    protected String email;
    protected String password;

    public Persona(String id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    /** Autentica al usuario comparando la contraseña */
    public boolean autenticar(String pw) {
        return password.equals(pw);
    }

    // Getters y setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
