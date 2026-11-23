public class Oportunidad {
    // Atributos
    private int id;
    private String titulo;
    private String descripcion;
    private String tipo;
    private String fecha;
    private String ubicacion;
    private boolean activa;

    // Constructor
    public Oportunidad(
            int id,
            String titulo,
            String descripcion,
            String tipo,
            String fecha,
            String ubicacion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.activa = true;
    }

    // Métodos para consultar los atributos
    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getTipo() {
        return tipo;
    }
    public String getFecha() {
        return fecha;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public boolean isActiva() {
        return activa;
    }

    // Métodos para modificar los atributos
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Métodos para cambiar el estado
    public void activar() {
        this.activa = true;
    }
    public void desactivar() {
        this.activa = false;
    }
}
