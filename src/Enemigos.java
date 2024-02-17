public class Enemigos {
    /**
     * Variable que representa la vida del enemigo
     */
    int vida;
    /**
     * Variable que representa el ataque del enemigo
     */
    int ataque;
    /**
     * Variable que representa el nombre del enemigo
     */

    String nombre;
    /**
     * Int variable que representa el nivel de enemigo
     */
    int nivel;
    /**
     * Variable que representa si esta estuneado o no
     */
    boolean esta_estuneado;
    /**
     * Variable para demostrar si esta vivo.
     */
    boolean esta_muerto;

    public Enemigos(int vida, int ataque, String nombre, int nivel, boolean esta_estuneado, boolean esta_muerto) {
        this.vida = vida;
        this.ataque = ataque;
        this.nombre = nombre;
        this.nivel = nivel;
        this.esta_estuneado = esta_estuneado;
        this.esta_muerto = esta_muerto;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isEsta_estuneado() {
        return esta_estuneado;
    }

    public void setEsta_estuneado(boolean esta_estuneado) {
        this.esta_estuneado = esta_estuneado;
    }

    public boolean isEsta_muerto() {
        return esta_muerto;
    }

    public void setEsta_muerto(boolean esta_muerto) {
        this.esta_muerto = esta_muerto;
    }
}
