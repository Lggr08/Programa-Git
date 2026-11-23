public class Iglesia {
    // Atributos
    private int id;
    private String nombre;
    private String ciudad;
    private String region;
    private String direccion;
    private String telefono;
    private String pastor;
    private boolean activa;

    // Constructor
    public Iglesia(
            int id,
            String nombre,
            String ciudad,
            String region,
            String direccion,
            String telefono,
            String pastor) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.region = region;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pastor = pastor;
        this.activa = true;
    }

    // Métodos para consultar los atributos
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public String getRegion() {
        return region;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getPastor() {
        return pastor;
    }
    public boolean isActiva() {
        return activa;
    }

    // Métodos para modificar los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setPastor(String pastor) {
        this.pastor = pastor;
    }

    // Métodos para cambiar el estado
    public void activar() {
        this.activa = true;
    }
    public void desactivar() {
        this.activa = false;
    }
}
