import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class IMPL_Juego implements IntrfaceJuego{
    Scanner scanner = new Scanner(System.in);
    private Etapa mazmorra_inicial;
    Random random = new Random();

    public IMPL_Juego(Etapa mazmorraInicial) {
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
     */
    @Override
    public void inicio_Mazmorra() {
        Etapa primera_Mazmorra;
        int ramdon_1;
        int enemigo_1;
        ramdon_1 = random.nextInt(100);
        enemigo_1 = random.nextInt()
        if(ramdon_1> 25){
            primera_Mazmorra = new Etapa(1);
        }





    }

    /**
     * Metodo que sirve para avanzar hacia la izquiera en los mazmorra.
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
     * Metodo que sirve para crear personaje, este contendra el nombre del personaje, .
     *
     * @return
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
                System.out.println("Error Error: Se produjo un error, ingrese nuevamente la opción correta.");
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
                System.out.println("Ingrese una opcion valida, tendra que escrbirlo denuevo.");
            }
        }
        int tipo_Personaje;
        label:
        while (true){
            System.out.println("En este mundo existen 4 tipo de personajes.  \n" +
                    "[1] La clase guerrero \n" +
                    "[2] La clase Arquero \n" +
                    "[3] La clase Mago \n " +
                    "[4] La clase Sanador \n" +
                    "Cada clase Tiene habilidades y armas unicas, por lo tanto escoja con cuidado \n" +
                    "Ingrese el numero correspondiente a la clase");
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
                    System.out.println("Iingrese una opcion valida");
                    break;
            }
        }

    return new Personaje(vida,nombre_Personaje,true,false,null,1,tipo_Personaje,null,tipo_Clase,ataque,0);


    }
}
