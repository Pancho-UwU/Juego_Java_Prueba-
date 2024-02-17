
public class Personaje {
    /**
     * Atributo de vida del personaje, este constara con:
     * 150 de vida principal si es de clase humano,
     * 100 si es un elfo,
     * 175 si es un enano,
     * y 200 si es un Troll.
     */
    private double vida;
    /**
     * Nombre cualquiera del personaje
     */
    private String nombre;
    /**
     * Atributo que sirve para identificar que tipo de personaje sera.
     * 1 Humano,
     * 2 Elfo,
     * 3 Enano,
     * 4 Troll.
     */
    private int tipo_Clase;

    /**
     * Atributo para verificar si el jugador esta muerto, true si esta vivo, false si esta muerto.
     */
    private boolean esta_Vivo;

    /**
     * Atributo para verificar si el jugador se encuentra estuneado, true si es estuneado y false si esta muerto.
     */
    private boolean esta_Estuneado;
    /**
     * Atributo para identificar el arma actual del personaje.
     */
    private Arma arma;
    /**
     * Atributo para verificar el nivel del personaje Cada subida de nivel optendra cada subida de nivel dara 5 puntos a daño y a vida.
     * Los niveles se subiran dependiendo de las mazmorra y el nivel de la mazmorra,
     * los puntos de mazmorras dependeran de su nivel,
     * las mazmorras de bonificación daran daran la mitad de su nivel.
     */
    private float nivel;
    /**
     * Atributo que indica el tipo de personaje:
     * 1 sera el guerrero.
     * 2 sera el arquero.
     * 3 sera el sanador .
     * 4 sera el mago.
     */
    private int tipo_personaje;
    /**
     * Atributo que sirve para indicar las mardaruas.
     */
    private Armadura[] armadura;
    /**
     * Atributo que identificara el daño del personaje, el daño base de los personajes depende de la elección de la clase
     * para los humanoos, el daño es de 8,
     * para los elfos el daño es de 10,
     * para los enanos el daño es de 7,
     * para los Troll el dalo es de 6.
     */
    private int ataque;

    private float puntos_Mazmorra;

    public Personaje(double vida, String nombre, boolean esta_Vivo, boolean esta_Estuneado, Arma arma, float nivel, int tipo_personaje, Armadura[] armadura, int tipo_Clase, int ataque, float puntos_Mazmorra) {
        this.vida = vida;
        this.nombre = nombre;
        this.esta_Vivo = esta_Vivo;
        this.esta_Estuneado = esta_Estuneado;
        this.arma = arma;
        this.nivel = nivel;
        this.tipo_personaje = tipo_personaje;
        this.armadura = new Armadura[4];
        this.tipo_Clase = tipo_Clase;
        this.ataque = ataque;
        this.puntos_Mazmorra = puntos_Mazmorra;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsta_Vivo() {
        return esta_Vivo;
    }

    public void setEsta_Vivo(boolean esta_Vivo) {
        this.esta_Vivo = esta_Vivo;
    }

    public boolean isEsta_Estuneado() {
        return esta_Estuneado;
    }

    public void setEsta_Estuneado(boolean esta_Estuneado) {
        this.esta_Estuneado = esta_Estuneado;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public float getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getTipo_personaje() {
        return tipo_personaje;
    }

    public void setTipo_personaje(int tipo_personaje) {
        this.tipo_personaje = tipo_personaje;
    }

    public Armadura[] getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura[] armadura) {
        this.armadura = armadura;
    }

    public int getTipo_Clase() {
        return tipo_Clase;
    }

    public void setTipo_Clase(int tipo_Clase) {
        this.tipo_Clase = tipo_Clase;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public float getPuntos_Mazmorra() {
        return puntos_Mazmorra;
    }

    public void setPuntos_Mazmorra(float puntos_Mazmorra) {
        this.puntos_Mazmorra = puntos_Mazmorra;
    }
}
