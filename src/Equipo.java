public class Equipo {

    /**
     * Nombre del equipo
     */
    private String nombre;
    /**
     * Tipo de equipo
     * 1 para indicar armaduras,
     * 2 para indicar armas.
      */
    private int tipo_equipo;
    /**
     * Descripción del equipo.
     */
    private String descripcion;

    /**
     * Atributo que indica la rareza, esta constara de 6 tipos
     * numero 1, arma normal,
     * numero 2, arma poco normal,
     * número 3, arma rara,
     * número 4, arma única,
     * número 5, arma legendaria,
     * número 6, arma mitica.
     */
    private int categoria;

    public Equipo(String nombre, int tipo_equipo, String descripcion, int categoria) {
        this.nombre = nombre;
        this.tipo_equipo = tipo_equipo;
        this.descripcion = descripcion;
        this.categoria =categoria;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public int getTipo_equipo() {
        return tipo_equipo;
    }

    public void setTipo_equipo(int tipo_equipo) {
        this.tipo_equipo = tipo_equipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
