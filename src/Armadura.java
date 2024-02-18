public class Armadura extends Equipo{

    /**
     * Variable que representa el tipo de armadura
     * 1 es la el casco,
     * 2 es el peto,
     * 3 es los pantalones y
     * 4 son las botas.
     */
    private int elementos_armadura;
    /**
     * Variable que va a representar el tipo de armaduras que tenga.
     * 1 armadura de ataque (Dara más daño).
     * 2 armadura de defensa (resivira más vida)
     * 3 armadura de suerte(dara la mitad de los 2 )
     */
    private int tipo_armadura;
    /**
     * Variable que representa el buff que dara al personaje.
     */
    private int buff;



    public Armadura(String nombre, int tipo_equipo, String descripcion,  int categoria, int elementos_armadura, int tipo_armadura, int buff) {
        super(nombre, tipo_equipo, descripcion, categoria);
        this.elementos_armadura =elementos_armadura;
        this.tipo_armadura =tipo_armadura;
        this.buff =buff;
    }

    public int getElementos_armadura() {
        return elementos_armadura;
    }

    public void setElementos_armadura(int elementos_armadura) {
        this.elementos_armadura = elementos_armadura;
    }

    public int getTipo_armadura() {
        return tipo_armadura;
    }

    public void setTipo_armadura(int tipo_armadura) {
        this.tipo_armadura = tipo_armadura;
    }

    public int getBuff() {
        return buff;
    }

    public void setBuff(int buff) {
        this.buff = buff;
    }
}
