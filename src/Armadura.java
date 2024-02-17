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
     * 1 armadura de ataque (Dara mas daño).
     * 2 armadura de defensa (resivira más vida)
     * 3 armadura de suerte(si es mago resivira más daño)
     */
    private int tipo_armadura;


    public Armadura(String nombre, int tipo_equipo, String descripcion, int peso, int categoria, int elementos_armadura, int tipo_armadura) {
        super(nombre, tipo_equipo, descripcion, peso, categoria);
        this.elementos_armadura =elementos_armadura;
        this.tipo_armadura =tipo_armadura;
    }
}
