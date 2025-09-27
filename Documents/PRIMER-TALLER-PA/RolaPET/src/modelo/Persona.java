package modelo;

/** Clase abstracta que define los datos básicos de cualquier persona del sistema. */
public abstract class Persona {

    protected String id;
    protected String nombre;
    protected String email;
    protected String password;

    /** Constructor que inicializa los datos principales de la persona. */
    public Persona(String id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    /** Verifica si la contraseña proporcionada coincide con la registrada. */
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
