import java.util.ArrayList;
public class Etapa {
    /**
     * Variable que representa si es una etapa de pelea o de loot.
     * 1 pelea
     * 2 loot
     */
    private int tipo_etapa;
    /**
     * Variable que representa el nivel de la etapa;
     *
     */

    private int nivel_etapa;
    /**
     * variable que representa la cantidad de enemigos;
     */
    private int cantidad_Enemigos;
    /**
     * Variable que sirve para guardar la etapa suiguiente hacia la izquiera;
     */
    private Etapa etapa_Siguiente_Izquierda;
    /**
     * Variable que sirve para guarda la etapa siguiente hacia la derecha
     */

    private Etapa etapa_Siguiente_derecha;

    /**
     * Variable que sirve para devolverse en las mazmorra.
     */
    private  Etapa atras;
    /**
     * Variable que representa si el jugador esta en ella.
     */
    private boolean estan_Jugando;
    /**
     * Lista que guarda la cantidad de enemigos que hay.
     */
    private  ArrayList<Enemigos> lista_Enemigos;

    public Etapa(int tipo_etapa, int nivel_etapa, int cantidad_Enemigos,Etapa etapa_Siguiente_derecha, Etapa etapa_Siguiente_Izquierda, Etapa atras, boolean estan_Jugando, ArrayList<Enemigos> lista_Enemigos) {
        this.tipo_etapa = tipo_etapa;
        this.nivel_etapa = nivel_etapa;
        this.cantidad_Enemigos = cantidad_Enemigos;
        this.etapa_Siguiente_Izquierda = null;
        this.etapa_Siguiente_derecha = null;
        this.atras = null;
        this.estan_Jugando = estan_Jugando;
        this.lista_Enemigos = lista_Enemigos;
    }

    public int getTipo_etapa() {
        return tipo_etapa;
    }

    public void setTipo_etapa(int tipo_etapa) {
        this.tipo_etapa = tipo_etapa;
    }

    public int getNivel_etapa() {
        return nivel_etapa;
    }

    public void setNivel_etapa(int nivel_etapa) {
        this.nivel_etapa = nivel_etapa;
    }

    public int getCantidad_Enemigos() {
        return cantidad_Enemigos;
    }

    public Etapa getEtapa_Siguiente_Izquierda() {
        return etapa_Siguiente_Izquierda;
    }

    public void setEtapa_Siguiente_Izquierda(Etapa etapa_Siguiente_Izquierda) {
        this.etapa_Siguiente_Izquierda = etapa_Siguiente_Izquierda;
    }

    public Etapa getEtapa_Siguiente_derecha() {
        return etapa_Siguiente_derecha;
    }

    public void setEtapa_Siguiente_derecha(Etapa etapa_Siguiente_derecha) {
        this.etapa_Siguiente_derecha = etapa_Siguiente_derecha;
    }

    public Etapa getAtras() {
        return atras;
    }

    public void setAtras(Etapa atras) {
        this.atras = atras;
    }

    public boolean isEstan_Jugando() {
        return estan_Jugando;
    }

    public void setEstan_Jugando(boolean estan_Jugando) {
        this.estan_Jugando = estan_Jugando;
    }

    public void setCantidad_Enemigos(int cantidad_Enemigos) {
        this.cantidad_Enemigos = cantidad_Enemigos;


    }

    public ArrayList<Enemigos> getLista_Enemigos() {
        return lista_Enemigos;
    }

    public void setLista_Enemigos(ArrayList<Enemigos> lista_Enemigos) {
        this.lista_Enemigos = lista_Enemigos;
    }
}
