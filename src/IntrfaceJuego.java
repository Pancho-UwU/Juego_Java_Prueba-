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

    /**
     * Metodo que sirve para listar los enemigos que existen.
     * Los atributos aumentarán de la siguiente forma.
     * Vida +50
     * ataque +6
     * los enemigos seran los siguientes:
     *
     * vida: 50
     * ataque: 6
     * DUENDES (<--- niveles 1 al 3 70 %)
     *
     * vida: 30
     * ataque: 10
     * ARAÑAS (<--- niveles 1 al 3 70 %)
     *
     * vida: 20
     * ataque: 4
     * RATA (<--- niveles 1 al 3 90 %)
     *
     * vida: 40
     * ataque: 12
     * ESQUELETOS (<--- niveles 1 al 3 40 %)
     *
     * vida: 70
     * ataque: 20
     * DEMONIOS () (<--- niveles 1 al 3 5 %)
     *
     * vida: 200
     * ataque: 300
     * MUJERES (<--- niveles 1 al 3, 1 %)
     *
     * @param nivel_enemigo, esta ddado por el nivel de la mazmorra.
     */
    Enemigos[] lista_Enemigos(int nivel_enemigo);

}
