import java.nio.channels.FileChannel;

public interface IntrfaceJuego {
    /**
     * Metodo para representar el incio del juego.
     */
    void Juego();



    /**
     * Metodo que sirve para guardar las diferentes armas que exiten en el juego
     * @return un listado con las armas que existen
     */
    Equipo[] Armas();

    /**
     * Metodo que sirve para jugardar las diferentes armaduras que existen en el juego.
     * @return un listado con las armaduras que existen.
     */
    Equipo[] Armaduras();

    /**
     * Metodo que creara la mazmorra inicial.
     */
    void inicio_Mazmorra();

    /**
     * Metodo que sirve para avanzar hacia la izquiera en los mazmorra.
     */
    void avanzar_Izquierda();

    /**
     * Metodo que sirve para avanzar hacia la derecha en la mazmorra.
     */
    void avanzar_Derecha();

    /**
     * Metodo que sirve para crear personaje, este contendra el nombre del personaje, .
     *
     */
    Personaje crear_Peronaje();


}
