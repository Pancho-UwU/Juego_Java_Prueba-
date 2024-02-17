public class Arma extends Equipo{
    /**
     * Tipo de arma, esta constaran de 4 tipo
     * el numero 1 sera para las espadas,
     * el número 2 sera para los arcos,
     * el numero 3 sera para las lanzas
     * y el numero 4 seran lara las varas de los magos
     */
    private int tipo_Arma;


    /**
     *  Atributo que indicara las restricciones del arma,
     *  1 no tiene restricciones,
     *  2 solo lo pueden ocupar arqueros.
     *  3 solo lo pueden ocupar guerreros.
     *  4 solo lo pueden ocupar magos.
     *  5 solo lo pueden ocupar sanador.
     *  6 solo lo ocupan guerreros y arqueros.
     *  7 solo lo ocupan magos y sanadores.
     */
    private int restriccion;

    private int daño;

    public Arma(String nombre, int tipo_equipo, String descripcion,int categoria, int peso, int tipo_Arma, int restriccion,int daño){
        super(nombre,tipo_Arma,descripcion,peso,categoria);
        this.tipo_Arma = tipo_Arma;
        this.restriccion = restriccion;
        this.daño = daño;

    }

    public int getTipo_Arma() {
        return tipo_Arma;
    }

    public void setTipo_Arma(int tipo_Arma) {
        this.tipo_Arma = tipo_Arma;
    }

    public int getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(int restriccion) {
        this.restriccion = restriccion;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
}
