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
     * Método para representar el inicio del juego.
     */
    @Override
    public void Juego() {
        Personaje main_Personaje;
        label:

        while (true)
        {

            try{
                System.out.println("""
                        Bienvenido al juego MazMOR-Pancho-Test
                        Seleccione una opción para inciar\s
                        Debe de indicar el numero seleccionado\s
                        [1] Iniciar el juego
                        [2] Salir del juego""");
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
     * Método que sirve para guardar las diferentes armas que existen en el juego
     *
     * @return un listado con las armas que existen
     */
    @Override
    public ArrayList<Arma> Armas() {
        ArrayList<Equipo> lista_Equipo = new ArrayList<>();
        lista_Equipo.add(new Arma("Arco Común",2,"Es la arma más común del juego, debido a su producción en masa",1,5,2,10));

        return null;
    }

    /**
     * Método que sirve para guardar las diferentes armaduras que existen en el juego.
     *
     * @return un listado con las armaduras que existen.
     */
    @Override
    public ArrayList<Armadura> Armaduras() {
            ArrayList<Armadura> armaduras_juego = new ArrayList<>();
            //armaduras normales.
            armaduras_juego.add(new Armadura("Casco aldeno",1,"Armadura hecha por los aldeanos alrededor del pueblo",1,1,2,3));
            armaduras_juego.add(new Armadura("Peto aldeno",1,"Armadura hecha por los aldeanos alrededor del pueblo",1,2,2,5));
            armaduras_juego.add(new Armadura("Pantalones aldeno",1,"Armadura hecha por los aldeanos alrededor del pueblo",1,3,2,4));
            armaduras_juego.add(new Armadura("Botas aldeno",1,"Armadura hecha por los aldeanos alrededor del pueblo",1,4,2,1));
            armaduras_juego.add(new Armadura("Casco de la mazmorra inicial",1,"Armadura encontrada en la primera etapa de la mazmorra, si tienes suerte",1,1,2,2));
            armaduras_juego.add(new Armadura("Peto de la mazmorra inicial",1,"Armadura encontrada en la primera etapa de la mazmorra, si tienes suerte",1,2,2,4));
            armaduras_juego.add(new Armadura("Pantalones de la mazmorra inicial",1,"Armadura encontrada en la primera etapa de la mazmorra, si tienes suerte",1,3,2,3));
            armaduras_juego.add(new Armadura("Botas de la mazmorra inicial",1,"Armadura encontrada en la primera etapa de la mazmorra, si tienes suerte",1,4,2,1));
            armaduras_juego.add(new Armadura("Casco del novato.",1,"Ideal para aprendices y recién llegados al mundo de la aventura, este set ofrece una combinación básica de cuero y metal para una protección modesta.",1,1,3,5));
            armaduras_juego.add(new Armadura("Peto del novato.",1,"Ideal para aprendices y recién llegados al mundo de la aventura, este set ofrece una combinación básica de cuero y metal para una protección modesta.",1,1,3,5));
            armaduras_juego.add(new Armadura("Pantalones del novato.",1,"Ideal para aprendices y recién llegados al mundo de la aventura, este set ofrece una combinación básica de cuero y metal para una protección modesta.",1,1,3,5));
            armaduras_juego.add(new Armadura("Botas del novato.",1,"Ideal para aprendices y recién llegados al mundo de la aventura, este set ofrece una combinación básica de cuero y metal para una protección modesta.",1,1,3,5));
            //armaduras poco normales.
            armaduras_juego.add(new Armadura("Armadura de Alba",1,"Una armadura básica con placas de metal ligero, confeccionada por los artesanos locales. Su diseño sencillo ofrece protección decente para aventureros novatos.",2,1,1,7));
            armaduras_juego.add(new Armadura("Armadura de Alba",1,"Una armadura básica con placas de metal ligero, confeccionada por los artesanos locales. Su diseño sencillo ofrece protección decente para aventureros novatos.",2,2,1,13));
            armaduras_juego.add(new Armadura("Armadura de Alba",1,"Una armadura básica con placas de metal ligero, confeccionada por los artesanos locales. Su diseño sencillo ofrece protección decente para aventureros novatos.",2,3,1,6));
            armaduras_juego.add(new Armadura("Armadura de Alba",1,"Una armadura básica con placas de metal ligero, confeccionada por los artesanos locales. Su diseño sencillo ofrece protección decente para aventureros novatos.",2,4,1,5));
            armaduras_juego.add(new Armadura("Manto de Hierro",1,"Una armadura simple compuesta principalmente de láminas de hierro, ideal para enfrentarse a amenazas menores. Es la elección común para los primeros enfrentamientos.",2,1,2,20));
            armaduras_juego.add(new Armadura("Manto de Hierro",1,"Una armadura simple compuesta principalmente de láminas de hierro, ideal para enfrentarse a amenazas menores. Es la elección común para los primeros enfrentamientos.",2,2,2,24));
            armaduras_juego.add(new Armadura("Manto de Hierro",1,"Una armadura simple compuesta principalmente de láminas de hierro, ideal para enfrentarse a amenazas menores. Es la elección común para los primeros enfrentamientos.",2,3,2,16));
            armaduras_juego.add(new Armadura("Manto de Hierro",1,"Una armadura simple compuesta principalmente de láminas de hierro, ideal para enfrentarse a amenazas menores. Es la elección común para los primeros enfrentamientos.",2,4,2,10));
            armaduras_juego.add(new Armadura("Guardia Ligera,",1,"Este conjunto de armaduras, común en las ciudades fronterizas, está diseñado para los guardianes locales. Ofrece una protección esencial para enfrentar los desafíos cotidianos.",2,1,3,13));
            armaduras_juego.add(new Armadura("Guardia Ligera,",1,"Este conjunto de armaduras, común en las ciudades fronterizas, está diseñado para los guardianes locales. Ofrece una protección esencial para enfrentar los desafíos cotidianos.",2,2,3,13));
            armaduras_juego.add(new Armadura("Guardia Ligera,",1,"Este conjunto de armaduras, común en las ciudades fronterizas, está diseñado para los guardianes locales. Ofrece una protección esencial para enfrentar los desafíos cotidianos.",2,3,3,13));
            armaduras_juego.add(new Armadura("Guardia Ligera,",1,"Este conjunto de armaduras, común en las ciudades fronterizas, está diseñado para los guardianes locales. Ofrece una protección esencial para enfrentar los desafíos cotidianos.",2,4,3,13));
            //armaduras rara.
            armaduras_juego.add(new Armadura("Set del Errante Nocturno",1,"Compuesto por cuero tratado y adornado con gemas oscuras, este set proporciona una protección superior sin sacrificar la movilidad en la oscuridad.",3,1,2,23));
            armaduras_juego.add(new Armadura("Set del Errante Nocturno",1,"Compuesto por cuero tratado y adornado con gemas oscuras, este set proporciona una protección superior sin sacrificar la movilidad en la oscuridad.",3,2,2,25));
            armaduras_juego.add(new Armadura("Set del Errante Nocturno",1,"Compuesto por cuero tratado y adornado con gemas oscuras, este set proporciona una protección superior sin sacrificar la movilidad en la oscuridad.",3,3,2,24));
            armaduras_juego.add(new Armadura("Set del Errante Nocturno",1,"Compuesto por cuero tratado y adornado con gemas oscuras, este set proporciona una protección superior sin sacrificar la movilidad en la oscuridad.",3,4,2,21));
            armaduras_juego.add(new Armadura("Manto del Eco Estelar",1,"Esta armadura rara, cubierta con cristales resplandecientes, refleja la luz de las estrellas. Su diseño único atrae miradas curiosas y ofrece una defensa excepcional.",3,1,3,23));
            armaduras_juego.add(new Armadura("Manto del Eco Estelar",1,"Esta armadura rara, cubierta con cristales resplandecientes, refleja la luz de las estrellas. Su diseño único atrae miradas curiosas y ofrece una defensa excepcional.",3,2,3,23));
            armaduras_juego.add(new Armadura("Manto del Eco Estelar",1,"Esta armadura rara, cubierta con cristales resplandecientes, refleja la luz de las estrellas. Su diseño único atrae miradas curiosas y ofrece una defensa excepcional.",3,3,3,23));
            armaduras_juego.add(new Armadura("Manto del Eco Estelar",1,"Esta armadura rara, cubierta con cristales resplandecientes, refleja la luz de las estrellas. Su diseño único atrae miradas curiosas y ofrece una defensa excepcional.",3,4,3,23));
            armaduras_juego.add(new Armadura("Armadura del Alba Silente",1,"Forjada con aleaciones raras, esta armadura emite un suave resplandor en la penumbra, ofreciendo una defensa fiable y un toque de elegancia discreta.",3,1,2,27));
            armaduras_juego.add(new Armadura("Armadura del Alba Silente",1,"Forjada con aleaciones raras, esta armadura emite un suave resplandor en la penumbra, ofreciendo una defensa fiable y un toque de elegancia discreta.",3,2,2,29));
            armaduras_juego.add(new Armadura("Armadura del Alba Silente",1,"Forjada con aleaciones raras, esta armadura emite un suave resplandor en la penumbra, ofreciendo una defensa fiable y un toque de elegancia discreta.",3,3,2,28));
            armaduras_juego.add(new Armadura("Armadura del Alba Silente",1,"Forjada con aleaciones raras, esta armadura emite un suave resplandor en la penumbra, ofreciendo una defensa fiable y un toque de elegancia discreta.",3,4,2,25));
            //armadura única.
            armaduras_juego.add(new Armadura("Armadura del Silencio Estelar",1,"Forjada en las forjas celestiales, esta única armadura irradia un aura de silencio y está adornada con constelaciones brillantes.",4,1,2,32));
            armaduras_juego.add(new Armadura("Armadura del Silencio Estelar",1,"Forjada en las forjas celestiales, esta única armadura irradia un aura de silencio y está adornada con constelaciones brillantes.",4,2,2,35));
            armaduras_juego.add(new Armadura("Armadura del Silencio Estelar",1,"Forjada en las forjas celestiales, esta única armadura irradia un aura de silencio y está adornada con constelaciones brillantes.",4,3,2,33));
            armaduras_juego.add(new Armadura("Armadura del Silencio Estelar",1,"Forjada en las forjas celestiales, esta única armadura irradia un aura de silencio y está adornada con constelaciones brillantes.",4,4,2,31));
            armaduras_juego.add(new Armadura("Set del Ocaso Dorado",1,"Un conjunto único, confeccionado con láminas de oro celestial, que proporciona no solo una defensa excepcional sino también un aura dorada que ilumina la oscuridad.",4,1,1,36));
            armaduras_juego.add(new Armadura("Set del Ocaso Dorado",1,"Un conjunto único, confeccionado con láminas de oro celestial, que proporciona no solo una defensa excepcional sino también un aura dorada que ilumina la oscuridad.",4,2,1,39));
            armaduras_juego.add(new Armadura("Set del Ocaso Dorado",1,"Un conjunto único, confeccionado con láminas de oro celestial, que proporciona no solo una defensa excepcional sino también un aura dorada que ilumina la oscuridad.",4,3,1,38));
            armaduras_juego.add(new Armadura("Set del Ocaso Dorado",1,"Un conjunto único, confeccionado con láminas de oro celestial, que proporciona no solo una defensa excepcional sino también un aura dorada que ilumina la oscuridad.",4,4,1,35));
            //armadura legendaria.
            armaduras_juego.add(new Armadura("Armadura del Éxodo Eterno",1,"Una legendaria armadura forjada con metales ancestrales y encantada con la esencia de los viajes interdimensionales.",5,1,3,43));
            armaduras_juego.add(new Armadura("Armadura del Éxodo Eterno",1,"Una legendaria armadura forjada con metales ancestrales y encantada con la esencia de los viajes interdimensionales.",5,2,3,45));
            armaduras_juego.add(new Armadura("Armadura del Éxodo Eterno",1,"Una legendaria armadura forjada con metales ancestrales y encantada con la esencia de los viajes interdimensionales.",5,3,3,44));
            armaduras_juego.add(new Armadura("Armadura del Éxodo Eterno",1,"Una legendaria armadura forjada con metales ancestrales y encantada con la esencia de los viajes interdimensionales.",5,4,3,41));
            armaduras_juego.add(new Armadura("Set del Alba Divina",1,"Este conjunto legendario, con incrustaciones de diamantes estelares, resplandece con la luz divina y otorga al portador una protección insuperable.",5,1,3,44));
            armaduras_juego.add(new Armadura("Set del Alba Divina",1,"Este conjunto legendario, con incrustaciones de diamantes estelares, resplandece con la luz divina y otorga al portador una protección insuperable.",5,2,3,47));
            armaduras_juego.add(new Armadura("Set del Alba Divina",1,"Este conjunto legendario, con incrustaciones de diamantes estelares, resplandece con la luz divina y otorga al portador una protección insuperable.",5,3,3,41));
            armaduras_juego.add(new Armadura("Set del Alba Divina",1,"Este conjunto legendario, con incrustaciones de diamantes estelares, resplandece con la luz divina y otorga al portador una protección insuperable.",5,4,3,42));
            //armadura mítica
            armaduras_juego.add(new Armadura("Set de la Égida Primordial",1,"Este conjunto mítico, confeccionado con fragmentos de la primera barrera que protegió el universo, brinda una defensa absoluta. Cada pieza está imbuida con la esencia de los titanes primordiales, permitiendo al portador resistir incluso los ataques más devastadores y alterar la realidad misma en su beneficio.",1,1,3,60));
            armaduras_juego.add(new Armadura("Set de la Égida Primordial",1,"Este conjunto mítico, confeccionado con fragmentos de la primera barrera que protegió el universo, brinda una defensa absoluta. Cada pieza está imbuida con la esencia de los titanes primordiales, permitiendo al portador resistir incluso los ataques más devastadores y alterar la realidad misma en su beneficio.",1,2,3,60));
            armaduras_juego.add(new Armadura("Set de la Égida Primordial",1,"Este conjunto mítico, confeccionado con fragmentos de la primera barrera que protegió el universo, brinda una defensa absoluta. Cada pieza está imbuida con la esencia de los titanes primordiales, permitiendo al portador resistir incluso los ataques más devastadores y alterar la realidad misma en su beneficio.",1,3,3,60));
            armaduras_juego.add(new Armadura("Set de la Égida Primordial",1,"Este conjunto mítico, confeccionado con fragmentos de la primera barrera que protegió el universo, brinda una defensa absoluta. Cada pieza está imbuida con la esencia de los titanes primordiales, permitiendo al portador resistir incluso los ataques más devastadores y alterar la realidad misma en su beneficio.",1,4,3,60));
        return armaduras_juego;
    }

    /**
     * Metodo que creara la mazmorra inicial.
     * 25% de probabilidad que sea etama de bonificación, el resto es de batalla.
     * -----------------
     * Nivel 1:
     * -----------------
     * 45% () ratas
     * 25% () arañas
     * 15% () duendes
     * 10% () esqueletos
     * 3%  () demonios.
     * 2%  () Mujeres.
     *-----------------
     * Nivel 2:
     * -----------------
     * 36% ratas
     * 24% arañas
     * 21% duendes
     * 10%esqueletos
     * 5% demonios.
     * 4% Mujeres.
     *-----------------
     * Nivel 3
     * -----------------
     * 20% ratas
     * 30% arañas
     * 10% duendes
     * 20%esqueletos
     * 15% demonios.
     * 5% Mujeres.
     * -----------------
     * Nivel 4
     * -----------------
     * 20% ratas
     * 50% arañas
     * 90% duendes
     * 70%esqueletos
     * 40% demonios.
     * 5% Mujeres.
     * -----------------
     * Nivel 5
     * -----------------
     * 5% (0-10) ratas
     * 10% arañas
     * 15% duendes
     * 20%esqueletos
     * 40% demonios.
     * 10% Mujeres.
     * -----------------
     * Porcentajes de aparición de las armaduras.
     * Nivel 1:
     * -----------------
     * Normal: 50%.
     * Poco normal: 30%.
     * Rara: 10%.
     * Única: 7%.
     * Legendaria: 2%.
     * Mítica: 1%
     * -----------------
     * Nivel 2:
     * -----------------
     * Normal: 30%.
     * Poco normal: 40%.
     * Rara: 15%.
     * Única: 10%.
     * Legendaria: 3%.
     * Mítica: 2%
     * -----------------
     * Nivel 3:
     * -----------------
     * Normal: 10%.
     * Poco normal: 40%.
     * Rara: 25%.
     * Única: 15%.
     * Legendaria: 7%.
     * Mítica: 3%
     * -----------------
     * Nivel 4:
     * -----------------
     * Normal: 5%.
     * Poco normal: 15%.
     * Rara: 40%.
     * Única: 20%.
     * Legendaria: 15%.
     * Mítica: 5%
     * -----------------
     * Nivel 5:
     * -----------------
     * Normal: 1%.
     * Poco normal: 10%.
     * Rara: 19%.
     * Única: 30%.
     * Legendaria: 28%.
     * Mítica: 12%.
     * -----------------
     * Para el tipo de armadura serán los siguientes.
     * Nivel 1 al 3.
     * -----------------
     * Tipo 1: 40%.
     * Tipo 2: 40%.
     * Tipo 3: 10%
     * -----------------
     * para el resto de 50%
     */

    @Override
    public void inicio_Mazmorra() {
        Etapa primera_Mazmorra;
        ArrayList<Armadura> armaduras_existente = Armaduras();
        ArrayList<Equipo> equipos_Etapa =new ArrayList<>();
        Enemigos[] lista_enemigos_Existente = lista_Enemigos(1);
        Enemigos[] lista_Enemigos_Mazmorra = new Enemigos[3];
        double tipo_etapa;
        double enemigo_1;
        double enemigo_2;
        double enemigo_3;
        double armadura;
        double armadura_categoria;


        tipo_etapa = random.nextDouble();
        enemigo_1 = random.nextDouble();
        enemigo_2 = random.nextDouble();
        enemigo_3 = random.nextDouble();
        armadura = random.nextDouble();
        armadura_categoria = random.nextDouble();


        if(tipo_etapa< 0.25){

            //if que indica el ratio de aparición de las categorías.
            if(armadura<0.5){
                if(armadura_categoria<0.4){
                    for (int i =0; i<= armaduras_existente.size();i++){
                        if (armaduras_existente.get(i).getTipo_armadura() ==1 && armaduras_existente.get(i).getCategoria() == 1){
                            equipos_Etapa.add(armaduras_existente.get(i));
                        }
                    }
                } else if (armadura_categoria<0.4+0.4) {
                    for (int i =0; i<= armaduras_existente.size();i++){
                        if (armaduras_existente.get(i).getTipo_armadura() ==2 && armaduras_existente.get(i).getCategoria() == 1){
                            equipos_Etapa.add(armaduras_existente.get(i));
                        }
                    }
                }
                else {
                    for (int i =0; i<= armaduras_existente.size();i++){
                        if (armaduras_existente.get(i).getTipo_armadura() ==3 && armaduras_existente.get(i).getCategoria() == 1){
                            equipos_Etapa.add(armaduras_existente.get(i));
                        }
                    }
                }
            }
            else if (armadura<0.5+0.3) {
                if(armadura_categoria<0.4){
                    for (int i =0; i<= armaduras_existente.size();i++){
                        if (armaduras_existente.get(i).getTipo_armadura() ==1 && armaduras_existente.get(i).getCategoria() == 2){
                            equipos_Etapa.add(armaduras_existente.get(i));
                        }
                    }
                } else if (armadura_categoria<0.4+0.4) {
                    for (int i =0; i<= armaduras_existente.size();i++){
                        if (armaduras_existente.get(i).getTipo_armadura() ==2 && armaduras_existente.get(i).getCategoria() == 2){
                            equipos_Etapa.add(armaduras_existente.get(i));
                        }
                    }
                }
                else {
                    for (int i =0; i<= armaduras_existente.size();i++){
                        if (armaduras_existente.get(i).getTipo_armadura() ==3 && armaduras_existente.get(i).getCategoria() == 2){
                            equipos_Etapa.add(armaduras_existente.get(i));
                        }
                    }
                }

            }
            else if (armadura<0.5+0.3+0.1) {
                if(armadura_categoria<0.4){
                    for (int i =0; i<= armaduras_existente.size();i++){
                        if (armaduras_existente.get(i).getTipo_armadura() ==1 && armaduras_existente.get(i).getCategoria() == 3){
                            equipos_Etapa.add(armaduras_existente.get(i));
                        }
                    }
                } else if (armadura_categoria<0.4+0.4) {
                    for (int i =0; i<= armaduras_existente.size();i++){
                        if (armaduras_existente.get(i).getTipo_armadura() ==2 && armaduras_existente.get(i).getCategoria() == 3){
                            equipos_Etapa.add(armaduras_existente.get(i));
                        }
                    }
                }
                else {
                    for (int i =0; i<= armaduras_existente.size();i++){
                        if (armaduras_existente.get(i).getTipo_armadura() ==3 && armaduras_existente.get(i).getCategoria() == 3){
                            equipos_Etapa.add(armaduras_existente.get(i));
                        }
                    }
                }
            }
            else if (armadura<0.5+0.3+0.1+0.07) {
                if(armadura_categoria<0.5){
                    for (int i = 0; i<= armaduras_existente.size();i++){
                        if ((armaduras_existente.get(i).getCategoria()==4 && armaduras_existente.get(i).getTipo_armadura()==1)){
                            equipos_Etapa.add(armaduras_existente.get(i));
                        }
                    }
                }
                else {
                    for (int i = 0; i<= armaduras_existente.size();i++){
                        if ((armaduras_existente.get(i).getCategoria()==4 && armaduras_existente.get(i).getTipo_armadura()==2)){
                            equipos_Etapa.add(armaduras_existente.get(i));
                        }
                    }
                }
            }
            else if (armadura<0.5+0.3+0.1+0.07+0.02) {
                if(armadura_categoria<0.5){
                    for (int i = 0; i<= armaduras_existente.size();i++){
                        if ((armaduras_existente.get(i).getCategoria()==5 && Objects.equals(armaduras_existente.get(i).getNombre(), "Armadura del Éxodo Eterno"))){
                            equipos_Etapa.add(armaduras_existente.get(i));
                        }
                    }
                }
                else {
                    for (int i = 0; i<= armaduras_existente.size();i++){
                        if ((armaduras_existente.get(i).getCategoria()==5 && Objects.equals(armaduras_existente.get(i).getNombre(), "Set del Alba Divina"))){
                            equipos_Etapa.add(armaduras_existente.get(i));
                        }
                    }
                }

            }
            else {
                for (int i = 0; i<= armaduras_existente.size();i++){
                    if (armaduras_existente.get(i).getCategoria()==6 ){
                        equipos_Etapa.add(armaduras_existente.get(i));
                    }
                }
            }
            // hacer otro if pero con las armas.


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
     * Método que sirve para avanzar hacia la izquierda en la mazmorra.
     */
    @Override
    public void avanzar_Izquierda() {

    }

    /**
     * Método que sirve para avanzar hacia la derecha en la mazmorra.
     */
    @Override
    public void avanzar_Derecha() {

    }

    /**
     * Método que sirve para crear personaje, este contendrá el nombre del personaje.
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
                System.out.println("""
                        Bienvenido al creador de personaje:\s
                        Se le mostraran las siguientes tipos de personajes\s
                        Escriba el numero correspondiente del personaje que dese\s
                        [1] Clase Humano, esta clase tiene 150 de vida y \s
                        [2] Clase Elfo\s
                        [3] Clase Enano\s
                        [4] Clase Troll""");
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
            if (confirmacion.equals("SI")){
                System.out.println("Se confirma el nombre del personaje");
                break;
            }
            else if (confirmacion.equals("NO")){
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
                    Cada clase Tiene habilidades y armas únicas, por lo tanto escoja con cuidado\s
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
