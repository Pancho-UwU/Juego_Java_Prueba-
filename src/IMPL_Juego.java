import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class IMPL_Juego implements IntrfaceJuego{
    Scanner scanner = new Scanner(System.in);
    private Etapa mazmorra_inicial;
    Random random = new Random();

    public IMPL_Juego() {
        mazmorra_inicial = null ;
    }

    /**
     * Metodo para representar el incio del juego.
     */
    @Override
    public void Juego() {
        Personaje main_Personaje;
        label:

        while (true)
        {

            try{
                System.out.println("Bienvenido al juego MazMOR-Pancho-Test\n " +
                        "Seleccione una opcion para inciar \n" +
                        "Deve de indicar el numero seleccionado \n" +
                        "[1] Iniciar el juego\n " +
                        "[2] Salir del jeugo");
                int opcion_a = scanner.nextInt();

                switch (opcion_a) {
                    case 1:
                        main_Personaje =crear_Peronaje();
                        break;
                    case 2:
                        break label;
                }
            }
            catch (Exception e) {
                System.out.println("ERROR-ERROR: Ingrese una opción valida");

            }
        }

    }

    /**
     * Metodo que sirve para guardar las diferentes armas que exiten en el juego
     *
     * @return un listado con las armas que existen
     */
    @Override
    public Equipo[] Armas() {
        ArrayList<Equipo> lista_Equipo = new ArrayList<>();
        lista_Equipo.add(new Arma("Arco Común",2,"Es la arma más comun del juego, debido a su porducción en masa",1,5,2,1,10));

        return new Equipo[0];
    }

    /**
     * Metodo que sirve para jugardar las diferentes armaduras que existen en el juego.
     *
     * @return un listado con las armaduras que existen.
     */
    @Override
    public Equipo[] Armaduras() {
        return new Equipo[0];
    }

    /**
     * Metodo que creara la mazmorra inicial.
     * 25% de probabilidad que sea etama de bonificación, el resto es de batalla.
     * -----------------
     * Nivel 1:
     * 45% () ratas
     * 25% () arañas
     * 15% () duendes
     * 10% () esqueletos
     * 3%  () demonios.
     * 2%  () Mujeres.
     *-----------------
     * Nivel 2:
     * 36% ratas
     * 24% arañas
     * 21% duendes
     * 10%esqueletos
     * 5% demonios.
     * 4% Mujeres.
     *-----------------
     * Nivel 3
     * 20% ratas
     * 30% arañas
     * 10% duendes
     * 20%esqueletos
     * 15% demonios.
     * 5% Mujeres.
     * -----------------
     * Nivel 4
     * 20% ratas
     * 50% arañas
     * 90% duendes
     * 70%esqueletos
     * 40% demonios.
     * 5% Mujeres.
     * -----------------
     * Nivel 5
     * 5% (0-10) ratas
     * 10% arañas
     * 15% duendes
     * 20%esqueletos
     * 40% demonios.
     * 10% Mujeres.
     */
    @Override
    public void inicio_Mazmorra() {
        Etapa primera_Mazmorra;
        Enemigos[] lista_enemigos_Existente = lista_Enemigos(1);
        Enemigos[] lista_Enemigos_Mazmorra = new Enemigos[3];
        double tipo_etapa;
        double enemigo_1;
        double enemigo_2;
        double enemigo_3;
        tipo_etapa = random.nextDouble();
        enemigo_1 = random.nextDouble();
        enemigo_2 = random.nextDouble();
        enemigo_3 = random.nextDouble();
        if(tipo_etapa< 0.25){

            //hacer lo mismo pero con el equipo.

            /*
              else que indica la 3 enemigos de la mazmorra.
             */
        }else {
            if(enemigo_1 < 0.45){
                lista_Enemigos_Mazmorra[0] = lista_enemigos_Existente[0];
            }
            else if (enemigo_1 <0.45+0.25){
                lista_Enemigos_Mazmorra[0] =lista_enemigos_Existente[1];
            }
            else if(enemigo_1<0.45+0.25+0.15){
                lista_Enemigos_Mazmorra[0]= lista_enemigos_Existente[2];
            } else if (enemigo_1<0.45+0.25+0.15+0.10) {
                lista_Enemigos_Mazmorra[0]= lista_enemigos_Existente[3];
            }
            else if (enemigo_1<0.45+0.25+0.15+0.10+0.03) {
                lista_Enemigos_Mazmorra[0]= lista_enemigos_Existente[4];
            }
            else {
                lista_Enemigos_Mazmorra[0]= lista_enemigos_Existente[5];
            }


            if(enemigo_2 < 0.45){
                lista_Enemigos_Mazmorra[1] = lista_enemigos_Existente[0];
            }
            else if (enemigo_2 <0.45+0.25){
                lista_Enemigos_Mazmorra[1] =lista_enemigos_Existente[1];
            }
            else if(enemigo_2<0.45+0.25+0.15){
                lista_Enemigos_Mazmorra[1]= lista_enemigos_Existente[2];
            } else if (enemigo_2<0.45+0.25+0.15+0.10) {
                lista_Enemigos_Mazmorra[1]= lista_enemigos_Existente[3];
            }
            else if (enemigo_2<0.45+0.25+0.15+0.10+0.03) {
                lista_Enemigos_Mazmorra[1]= lista_enemigos_Existente[4];
            }
            else {
                lista_Enemigos_Mazmorra[1]= lista_enemigos_Existente[5];
            }

            if(enemigo_3 < 0.45){
                lista_Enemigos_Mazmorra[2] = lista_enemigos_Existente[0];
            }
            else if (enemigo_3 <0.45+0.25){
                lista_Enemigos_Mazmorra[2] =lista_enemigos_Existente[1];
            }
            else if(enemigo_3<0.45+0.25+0.15){
                lista_Enemigos_Mazmorra[2]= lista_enemigos_Existente[2];
            } else if (enemigo_3<0.45+0.25+0.15+0.10) {
                lista_Enemigos_Mazmorra[2]= lista_enemigos_Existente[3];
            }
            else if (enemigo_3<0.45+0.25+0.15+0.10+0.03) {
                lista_Enemigos_Mazmorra[2]= lista_enemigos_Existente[4];
            }
            else {
                lista_Enemigos_Mazmorra[2]= lista_enemigos_Existente[5];
            }
        }

    }

    /**
     * Metodo que sirve para avanzar hacia la izquiera en la mazmorra.
     */
    @Override
    public void avanzar_Izquierda() {

    }

    /**
     * Metodo que sirve para avanzar hacia la derecha en la mazmorra.
     */
    @Override
    public void avanzar_Derecha() {

    }

    /**
     * Metodo que sirve para crear personaje, este contendra el nombre del personaje.
     *
     * @return el personaje creado
     */
    @Override
    public Personaje crear_Peronaje() {
        int tipo_Clase;
        int vida;
        int ataque;
        label:
        while (true){
            try{
                System.out.println("Bienvenido al creador de personaje: \n" +
                        "Se le mostraran las siguientes tipos de personajes \n" +
                        "Escriba el numero correspondiente del personaje que dese \n" +
                        "[1] Clase Humano, esta clase tiene 150 de vida y  \n" +
                        "[2] Clase Elfo \n " +
                        "[3] Clase Enano \n " +
                        "[4] Clase Troll");
                String opcion = scanner.next("Escriba su opción aquí: ");
                switch (opcion) {
                    case "1":
                        tipo_Clase = 1;
                        vida = 150;
                        ataque = 8;
                        break label;
                    case "2":
                        tipo_Clase = 2;
                        vida = 100;
                        ataque = 10;
                        break label;
                    case "3":
                        tipo_Clase = 3;
                        vida = 175;
                        ataque = 7;
                        break label;
                    case "4":
                        tipo_Clase = 4;
                        vida = 200;
                        ataque = 6;
                        break label;
                    case null:
                    default:
                        System.out.println("Ingrese una opción valida.");
                        break;
                }
            }
            catch (Exception e){
                System.out.println("Error Error: Se produjo un error, ingrese nuevamente la opción correcta.");
            }
        }
        String nombre_Personaje;
        while (true){
            System.out.println("Ingrese el nombre de su personaje \n ");
             nombre_Personaje = scanner.next();
            System.out.println("El nombre de su personaje es " +nombre_Personaje+ " Si desea confirmar este nombre escriba si, no para ingresar un nuevo nombre.");
            String confirmacion = scanner.next().toUpperCase();
            if (confirmacion == "SI"){
                System.out.println("Se confirma el nombre del personaje");
                break;
            }
            else if (confirmacion == "NO"){
                System.out.println("Se volvera a indicar las instrucciones.");
                continue;
            }
            else{
                System.out.println("Ingrese una opción valida, tendrá que escribirlo de nuevo.");
            }
        }
        int tipo_Personaje;
        label:
        while (true){
            System.out.println("""
                    En este mundo existen 4 tipo de personajes. \s
                    [1] La clase guerrero\s
                    [2] La clase Arquero\s
                    [3] La clase Mago\s
                     [4] La clase Sanador\s
                    Cada clase Tiene habilidades y armas unicas, por lo tanto escoja con cuidado\s
                    Ingrese el numero correspondiente a la clase""");
            String opcion =scanner.next();
            switch (opcion){
                case ("1"):
                    tipo_Personaje = 1;
                    break label;
                case ("2"):
                    tipo_Personaje = 2;
                    break label;
                case ("3"):
                    tipo_Personaje =3;
                    break label;
                case ("4"):
                    tipo_Personaje = 4;
                    break label;
                case null:
                default:
                    System.out.println("Ingrese una opción valida");
                    break;
            }
        }

    return new Personaje(vida,nombre_Personaje,true,false,null,1,tipo_Personaje,null,tipo_Clase,ataque,0);


    }

    /**
     * Metodo que sirve para listar los enemigos que existen.
     * Los atributos aumentarán de la siguiente forma.
     * Vida +50
     * ataque +6
     * los enemigos serán los siguientes:
     *
     * vida: 50
     * ataque: 6
     * DUENDES
     *
     * vida: 30
     * ataque: 10
     * ARAÑAS
     *
     * vida: 20
     * ataque: 4
     * RATA
     *
     * vida: 40
     * ataque: 12
     * ESQUELETOS
     *
     * vida: 70
     * ataque: 20
     * DEMONIOS ()
     *
     * vida: 200
     * ataque: 300
     * MUJERES
     *
     * @param nivel_enemigo, está dado por el nivel de la mazmorra.
     */
    @Override
    public Enemigos[] lista_Enemigos(int nivel_enemigo) {
        Enemigos[] lista_enemigo_creados = new Enemigos[6];
        label:
        switch (nivel_enemigo){
            case (1):
                lista_enemigo_creados[0] = new Enemigos(50,6,"Duenede",nivel_enemigo,false,false);
                lista_enemigo_creados[1] = new Enemigos(30,10,"Araña", nivel_enemigo,false,false);
                lista_enemigo_creados[2] = new Enemigos(20,4,"Rata", nivel_enemigo,false,false);
                lista_enemigo_creados[3] = new Enemigos(40,12,"Esqueleto", nivel_enemigo,false,false);
                lista_enemigo_creados[4] = new Enemigos(70,20,"Demonio", nivel_enemigo,false,false);
                lista_enemigo_creados[5] = new Enemigos(200,300,"Mujer", nivel_enemigo,false,false);
                return lista_enemigo_creados;
            case (2):
                lista_enemigo_creados[0] = new Enemigos(100,12,"Duenede",nivel_enemigo,false,false);
                lista_enemigo_creados[1] = new Enemigos(80,16,"Araña", nivel_enemigo,false,false);
                lista_enemigo_creados[2] = new Enemigos(70,10,"Rata", nivel_enemigo,false,false);
                lista_enemigo_creados[3] = new Enemigos(90,18,"Esqueleto", nivel_enemigo,false,false);
                lista_enemigo_creados[4] = new Enemigos(120,26,"Demonio", nivel_enemigo,false,false);
                lista_enemigo_creados[5] = new Enemigos(250,306,"Mujer", nivel_enemigo,false,false);
                return lista_enemigo_creados;
            case (3):
                lista_enemigo_creados[0] = new Enemigos(150,18,"Duenede",nivel_enemigo,false,false);
                lista_enemigo_creados[1] = new Enemigos(120,22,"Araña", nivel_enemigo,false,false);
                lista_enemigo_creados[2] = new Enemigos(110,16,"Rata", nivel_enemigo,false,false);
                lista_enemigo_creados[3] = new Enemigos(140,24,"Esqueleto", nivel_enemigo,false,false);
                lista_enemigo_creados[4] = new Enemigos(170,32,"Demonio", nivel_enemigo,false,false);
                lista_enemigo_creados[5] = new Enemigos(300,312,"Mujer", nivel_enemigo,false,false);
                return lista_enemigo_creados;
            case (4):
                lista_enemigo_creados[0] = new Enemigos(200,24,"Duenede",nivel_enemigo,false,false);
                lista_enemigo_creados[1] = new Enemigos(170,28,"Araña", nivel_enemigo,false,false);
                lista_enemigo_creados[2] = new Enemigos(160,22,"Rata", nivel_enemigo,false,false);
                lista_enemigo_creados[3] = new Enemigos(200,30,"Esqueleto", nivel_enemigo,false,false);
                lista_enemigo_creados[4] = new Enemigos(220,38,"Demonio", nivel_enemigo,false,false);
                lista_enemigo_creados[5] = new Enemigos(350,318,"Mujer", nivel_enemigo,false,false);
                return lista_enemigo_creados;
            case(5):
                lista_enemigo_creados[0] = new Enemigos(250,30,"Duenede",nivel_enemigo,false,false);
                lista_enemigo_creados[1] = new Enemigos(220,34,"Araña", nivel_enemigo,false,false);
                lista_enemigo_creados[2] = new Enemigos(210,28,"Rata", nivel_enemigo,false,false);
                lista_enemigo_creados[3] = new Enemigos(250,36,"Esqueleto", nivel_enemigo,false,false);
                lista_enemigo_creados[4] = new Enemigos(270,44,"Demonio", nivel_enemigo,false,false);
                lista_enemigo_creados[5] = new Enemigos(400,324,"Mujer", nivel_enemigo,false,false);
                return lista_enemigo_creados;
        }

        return null;
    }
}
