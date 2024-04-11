package AlgoritmosUsados;
import java.util.Set;

import AlgoritmosUsados.LocalSearchMaxCliqueSameResult.*;
import AlgoritmosUsados.BronKerboschMaxClique.*;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("-----------------------------------------------------------------   Apartado de Búsqueda Local   -----------------------------------------------------------------");

        // Apartado de LocalSearchMaxCliqueSameResult
        Graph grafoUno = new Graph(5);
        // Primer Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutaran 5 vertices con 6 aristas
        grafoUno.agregarConexion(0, 1);
        grafoUno.agregarConexion(0, 2);
        grafoUno.agregarConexion(0, 3);
        grafoUno.agregarConexion(1, 2);
        grafoUno.agregarConexion(1, 3);
        grafoUno.agregarConexion(2, 3);
        // Se espera un clique de [0, 1, 2, 3] - Resultado Correcto
        // Encontrar el clique máximo
        Set<Integer> maxClique = new LocalSearchMaxCliqueSameResult().localSearchMaxClique(grafoUno);
        System.out.println("Clique Máximo del primer ejercicio método Busqueda Local: " + maxClique);
        
        // Segunda Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutaran 10 vertices con 12 aristas
        Graph grafoDos = new Graph(10);
        grafoDos.agregarConexion(0, 1);
        grafoDos.agregarConexion(0, 3);
        grafoDos.agregarConexion(0, 4);
        grafoDos.agregarConexion(1, 2);
        grafoDos.agregarConexion(1, 3);
        grafoDos.agregarConexion(1, 4);
        grafoDos.agregarConexion(3, 4);
        grafoDos.agregarConexion(3, 6);
        grafoDos.agregarConexion(4, 7);
        grafoDos.agregarConexion(5, 8);
        grafoDos.agregarConexion(6, 7);
        grafoDos.agregarConexion(6, 8);
        // Se espera un clique de [0, 1, 3, 4] - Resultado Correcto
        maxClique = new LocalSearchMaxCliqueSameResult().localSearchMaxClique(grafoDos);
        System.out.println("Clique Máximo del Segundo ejercicio método Busqueda Local: " + maxClique);


        // Tercera Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutaran 20 vertices con 20 aristas
        Graph grafoTres = new Graph(20);
        grafoTres.agregarConexion(0, 1);
        grafoTres.agregarConexion(0, 2);
        grafoTres.agregarConexion(0, 3);
        grafoTres.agregarConexion(0, 4);
        grafoTres.agregarConexion(1, 2);
        grafoTres.agregarConexion(1, 3);
        grafoTres.agregarConexion(1, 4);
        grafoTres.agregarConexion(1, 5);
        grafoTres.agregarConexion(2, 3);
        grafoTres.agregarConexion(2, 4);
        grafoTres.agregarConexion(2, 5);
        grafoTres.agregarConexion(2, 6);
        grafoTres.agregarConexion(3, 4);
        grafoTres.agregarConexion(3, 5);
        grafoTres.agregarConexion(3, 6);
        grafoTres.agregarConexion(3, 7);
        grafoTres.agregarConexion(4, 5);
        grafoTres.agregarConexion(4, 6);
        grafoTres.agregarConexion(4, 7);
        grafoTres.agregarConexion(4, 8);
        // Se espera un clique de [0, 1, 2, 3, 4] - Resultado Correcto
        maxClique = new LocalSearchMaxCliqueSameResult().localSearchMaxClique(grafoTres);
        System.out.println("Clique Máximo del tercer ejercicio método Busqueda Local: " + maxClique);


        // Cuarta Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutaran 20 vertices con 30 aristas
        Graph grafoCuatro = new Graph(20);
        grafoCuatro.agregarConexion(0, 1); //1
        grafoCuatro.agregarConexion(0, 2); //2
        grafoCuatro.agregarConexion(0, 3); //3
        grafoCuatro.agregarConexion(0, 4); //4
        grafoCuatro.agregarConexion(0, 5); //5
        grafoCuatro.agregarConexion(0, 6); //6
        grafoCuatro.agregarConexion(1, 2); //7 
        grafoCuatro.agregarConexion(1, 3); //8 
        grafoCuatro.agregarConexion(1, 4); //9 
        grafoCuatro.agregarConexion(1, 5); //10 
        grafoCuatro.agregarConexion(1, 6); //11 
        grafoCuatro.agregarConexion(2, 3);  //12
        grafoCuatro.agregarConexion(2, 4); //13
        grafoCuatro.agregarConexion(2, 5); //14 
        grafoCuatro.agregarConexion(2, 6);  //15
        grafoCuatro.agregarConexion(3, 4); //16
        grafoCuatro.agregarConexion(3, 5); //17
        grafoCuatro.agregarConexion(3, 6); //18
        grafoCuatro.agregarConexion(4, 5); //19
        grafoCuatro.agregarConexion(4, 6); //20
        grafoCuatro.agregarConexion(5, 6); //21
        grafoCuatro.agregarConexion(7, 8); //22
        grafoCuatro.agregarConexion(8, 9); //23
        grafoCuatro.agregarConexion(9, 10); //24
        grafoCuatro.agregarConexion(10, 7);  // Forma un pequeño ciclo entre 7, 8, 9, y 10
        grafoCuatro.agregarConexion(11, 12); //26
        grafoCuatro.agregarConexion(13, 14); //27
        grafoCuatro.agregarConexion(7, 0);    // Conectamos un nodo del ciclo al clique
        grafoCuatro.agregarConexion(11, 3);   // Otro nodo externo conectado al clique
        grafoCuatro.agregarConexion(14, 5);   // Y otro más para integrar mejor el grafo
        // Se espera un clique de [0, 1, 2, 3, 4, 5, 6] - Resultado Correcto
        maxClique = new LocalSearchMaxCliqueSameResult().localSearchMaxClique(grafoCuatro);
        System.out.println("Clique Máximo del cuarto ejercicio método Busqueda Local: " + maxClique);


        // Cuarta Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutaran 20 vertices con 40 aristas
        Graph grafoCinco = new Graph(20);
        // Agregando conexiones para el clique de 6 nodos (3-8)
        for (int i = 3; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                grafoCinco.agregarConexion(i, j);
            }
        }
        // En este momento tenemos un clique de 6 nodos (3-8) con 15 aristas
        // Ahora, agregamos conexiones adicionales para alcanzar un total de 40 aristas
        // Pueden ser conexiones entre nodos del clique o entre nodos del clique y nodos externos
        grafoCinco.agregarConexion(7, 12);
        grafoCinco.agregarConexion(15, 18);
        grafoCinco.agregarConexion(7, 17);
        grafoCinco.agregarConexion(14, 17);
        grafoCinco.agregarConexion(8, 10);
        grafoCinco.agregarConexion(7, 13);
        grafoCinco.agregarConexion(10, 19);
        grafoCinco.agregarConexion(13, 16);
        grafoCinco.agregarConexion(9, 12);
        grafoCinco.agregarConexion(11, 9);
        grafoCinco.agregarConexion(8, 15);
        grafoCinco.agregarConexion(14, 19);
        grafoCinco.agregarConexion(9, 18);
        grafoCinco.agregarConexion(10, 15);
        grafoCinco.agregarConexion(11, 14);
        grafoCinco.agregarConexion(7, 19);
        grafoCinco.agregarConexion(12, 18);
        grafoCinco.agregarConexion(13, 17);
        grafoCinco.agregarConexion(8, 14);
        grafoCinco.agregarConexion(10, 11);
        grafoCinco.agregarConexion(9, 17);
        grafoCinco.agregarConexion(12, 19);
        grafoCinco.agregarConexion(13, 15);
        grafoCinco.agregarConexion(16, 10);
        // Se espera un clique de [3,4,5,6,7,8] - Resultado Correcto
        maxClique = new LocalSearchMaxCliqueSameResult().localSearchMaxClique(grafoCinco);
        System.out.println("Clique Máximo del quinto ejercicio método Busqueda Local: " + maxClique);

        
        // Sexta Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutaran 20 vertices con 50 aristas
        // Agregando conexiones para el clique de 7 nodos (0-6)
        Graph grafoSeis = new Graph(20);
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 7; j++) {
                grafoSeis.agregarConexion(i, j);
            }
        }
        // Ahora, agregamos conexiones adicionales para alcanzar un total de 50 aristas
        // Estas conexiones pueden ser entre nodos del clique o entre nodos del clique y nodos externos
        // Aquí añadimos conexiones entre nodos del clique y algunos nodos externos para diversificar el grafo
        grafoSeis.agregarConexion(0, 8);
        grafoSeis.agregarConexion(0, 9);
        grafoSeis.agregarConexion(0, 10);
        grafoSeis.agregarConexion(0, 11);
        grafoSeis.agregarConexion(0, 12);
        grafoSeis.agregarConexion(0, 13);
        grafoSeis.agregarConexion(0, 14);
        grafoSeis.agregarConexion(1, 8);
        grafoSeis.agregarConexion(1, 9);
        grafoSeis.agregarConexion(1, 10);
        grafoSeis.agregarConexion(1, 11);
        grafoSeis.agregarConexion(1, 12);
        grafoSeis.agregarConexion(1, 13);
        grafoSeis.agregarConexion(1, 14);
        grafoSeis.agregarConexion(2, 8);
        grafoSeis.agregarConexion(2, 9);
        grafoSeis.agregarConexion(2, 10);
        grafoSeis.agregarConexion(2, 11);
        grafoSeis.agregarConexion(2, 12);
        grafoSeis.agregarConexion(2, 13);
        grafoSeis.agregarConexion(2, 14);
        grafoSeis.agregarConexion(3, 8);
        grafoSeis.agregarConexion(3, 9);
        grafoSeis.agregarConexion(3, 10);
        grafoSeis.agregarConexion(3, 11);
        grafoSeis.agregarConexion(3, 12);
        grafoSeis.agregarConexion(3, 13);
        grafoSeis.agregarConexion(3, 14);
        grafoSeis.agregarConexion(4, 8);
        // Se espera un clique de [0, 1, 2, 3, 4, 5, 6] - Resultado Correcto
        maxClique = new LocalSearchMaxCliqueSameResult().localSearchMaxClique(grafoSeis);
        System.out.println("Clique Máximo del sexto ejercicio método Busqueda Local: " + maxClique);

        // Septima Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutaran 20 vertices con 80 aristas
        Graph grafoSiete = new Graph(20);
        // Agregando conexiones para el clique de 18 nodos (0-12)
        for (int i = 0; i < 13; i++) {
            for (int j = i + 1; j < 13; j++) {
                grafoSiete.agregarConexion(i,j);
            }
        }
        // En este momento tenemos un clique de 13 nodos (0-12) con 78 aristas
        // Ahora, agregamos conexiones adicionales para alcanzar un total de 80 aristas
        // Aquí agregamos conexiones entre nodos del clique y algunos nodos externos para diversificar el grafo
        grafoSiete.agregarConexion(13,14);
        grafoSiete.agregarConexion(18,15);
        // Se espera un clique de [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12] - Resultado Correcto
        maxClique = new LocalSearchMaxCliqueSameResult().localSearchMaxClique(grafoSiete);
        System.out.println("Clique Máximo del Septimo ejercicio método Busqueda Local: " + maxClique);

        // Octava Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutaran 40 vertices con 120 aristas
        // Agregando conexiones para el clique de 15 nodos (0-14)
        Graph grafoOcho = new Graph(40);
        for (int i = 0; i < 15; i++) {
            for (int j = i + 1; j < 15; j++) {
                grafoOcho.agregarConexion(i, j);
            }
        }
        // En este momento tenemos un clique de 15 nodos (0-14) con 105 aristas
        // Ahora, agregamos conexiones adicionales para alcanzar un total de 120 aristas
        grafoOcho.agregarConexion(15, 16);
        grafoOcho.agregarConexion(15, 17);
        grafoOcho.agregarConexion(15, 18);
        grafoOcho.agregarConexion(15, 19);
        grafoOcho.agregarConexion(16, 17);
        grafoOcho.agregarConexion(16, 18);
        grafoOcho.agregarConexion(16, 19);
        grafoOcho.agregarConexion(17, 18);
        grafoOcho.agregarConexion(17, 19);
        grafoOcho.agregarConexion(18, 19);
        grafoOcho.agregarConexion(19, 20);
        grafoOcho.agregarConexion(19, 21);
        grafoOcho.agregarConexion(19, 22);
        grafoOcho.agregarConexion(19, 23);
        grafoOcho.agregarConexion(19, 24);
        // Se espera un clique de [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14] - Resultado Correcto
        maxClique = new LocalSearchMaxCliqueSameResult().localSearchMaxClique(grafoOcho);
        System.out.println("Clique Máximo del Octava ejercicio método Busqueda Local: " + maxClique);


        // Novena Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutan 60 vertices con 240 aristas
        // Agregando Conexiones para el clique de 20 nodos (19-39)
        Graph grafoNueve = new Graph(60);
        for (int i = 19; i < 41; i++) {
            for (int j = i + 1; j < 41; j++) {
                grafoNueve.agregarConexion(i, j);
            }
        }
        // En este momento tenemos un clique de 22 nodos con 231 aristas
        //Ahora agregamos las conexiones restantes 240 - 231 = 9
        grafoNueve.agregarConexion(3, 6);
        grafoNueve.agregarConexion(5, 8);
        grafoNueve.agregarConexion(12, 17);
        grafoNueve.agregarConexion(10, 14);
        grafoNueve.agregarConexion(44, 53);
        grafoNueve.agregarConexion(45, 58);
        grafoNueve.agregarConexion(48, 57);
        grafoNueve.agregarConexion(47, 59);
        grafoNueve.agregarConexion(46, 51);
        maxClique = new LocalSearchMaxCliqueSameResult().localSearchMaxClique(grafoNueve);
        System.out.println("Clique Máximo del novena ejercicio método Busqueda Local: " + maxClique);

        // Decima Prueba del Proyecto Analisis de Algoritmos
        //En este momento se realizan 80 Vertices con 400 aristas
        // Vamos elegir un clique en este grafo de 28 nodos el cual tendra 378 aristas
        Graph grafoDiez = new Graph(80);
        for (int i = 10; i < 39; i++) {
            for (int j = i + 1; j < 39; j++) {
                grafoDiez.agregarConexion(i, j);
            }
        }
        // En este momento tenemos un clique de 28 nodos con 378 aristas
        // Ahora agregamos los nodos restantes 400 - 378 = 22
        grafoDiez.agregarConexion(0, 2);
        grafoDiez.agregarConexion(3, 8);
        grafoDiez.agregarConexion(4, 9);
        grafoDiez.agregarConexion(6, 7);
        grafoDiez.agregarConexion(1, 5);
        grafoDiez.agregarConexion(40, 45);
        grafoDiez.agregarConexion(41, 46);
        grafoDiez.agregarConexion(42, 50);
        grafoDiez.agregarConexion(43, 55);
        grafoDiez.agregarConexion(44, 49);
        grafoDiez.agregarConexion(51, 58);
        grafoDiez.agregarConexion(52, 59);
        grafoDiez.agregarConexion(60, 65);
        grafoDiez.agregarConexion(61, 70);
        grafoDiez.agregarConexion(62, 66);
        grafoDiez.agregarConexion(63, 67);
        grafoDiez.agregarConexion(64, 68);
        grafoDiez.agregarConexion(69, 75);
        grafoDiez.agregarConexion(71, 76);
        grafoDiez.agregarConexion(72, 77);
        grafoDiez.agregarConexion(73, 78);
        grafoDiez.agregarConexion(74, 79);
        maxClique = new LocalSearchMaxCliqueSameResult().localSearchMaxClique(grafoDiez);
        System.out.println("Clique Máximo del decimo ejercicio método Busqueda Local: " + maxClique);
        // El clique esperado es [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37]

    //--------------------------------------------------------------------------------------------------------------
        // Apartado de BronKerboschMaxClique
        System.out.println("");
        System.out.println("-----------------------------------------------------------------   Apartado de BronKerboschMaxClique   -----------------------------------------------------------------");

        GraphKerbosch grafoUnoKerbosch = new GraphKerbosch(5);

        // En este momento se ejecutaran 5 vertices con 6 aristas
        grafoUnoKerbosch.addEdge(0, 1);
        grafoUnoKerbosch.addEdge(0, 2);
        grafoUnoKerbosch.addEdge(0, 3);
        grafoUnoKerbosch.addEdge(1, 2);
        grafoUnoKerbosch.addEdge(1, 3);
        grafoUnoKerbosch.addEdge(2, 3);
        // Se espera un clique de [0, 1, 2, 3] - Resultado Correcto

        
        BronKerboschMaxClique.bronKerbosch(grafoUnoKerbosch);
        System.out.println("Clique Máximo del primer ejercicio de Bron - Kersboch " + BronKerboschMaxClique.maxCliqueKersboch); 


        // Forzar a que se limpie el clique máximo
        BronKerboschMaxClique.maxCliqueKersboch.clear();

        GraphKerbosch grafoDosKerbosch = new GraphKerbosch(10);
        grafoDosKerbosch.addEdge(0, 1);
        grafoDosKerbosch.addEdge(0, 3);
        grafoDosKerbosch.addEdge(0, 4);
        grafoDosKerbosch.addEdge(1, 2);
        grafoDosKerbosch.addEdge(1, 3);
        grafoDosKerbosch.addEdge(1, 4);
        grafoDosKerbosch.addEdge(3, 4);
        grafoDosKerbosch.addEdge(3, 6);
        grafoDosKerbosch.addEdge(4, 7);
        grafoDosKerbosch.addEdge(5, 8);
        grafoDosKerbosch.addEdge(6, 7);
        grafoDosKerbosch.addEdge(6, 8);
        // Se espera un clique de [0, 1, 3, 4] - Resultado Correcto
        BronKerboschMaxClique.bronKerbosch(grafoDosKerbosch);
        System.out.println("Clique Máximo del segundo ejercicio de Bron - Kersboch " + BronKerboschMaxClique.maxCliqueKersboch);


        GraphKerbosch grafoTresKerbosch = new GraphKerbosch(20);
        grafoTresKerbosch.addEdge(0, 1);
        grafoTresKerbosch.addEdge(0, 2);
        grafoTresKerbosch.addEdge(0, 3);
        grafoTresKerbosch.addEdge(0, 4);
        grafoTresKerbosch.addEdge(1, 2);
        grafoTresKerbosch.addEdge(1, 3);
        grafoTresKerbosch.addEdge(1, 4);
        grafoTresKerbosch.addEdge(1, 5);
        grafoTresKerbosch.addEdge(2, 3);
        grafoTresKerbosch.addEdge(2, 4);
        grafoTresKerbosch.addEdge(2, 5);
        grafoTresKerbosch.addEdge(2, 6);
        grafoTresKerbosch.addEdge(3, 4);
        grafoTresKerbosch.addEdge(3, 5);
        grafoTresKerbosch.addEdge(3, 6);
        grafoTresKerbosch.addEdge(3, 7);
        grafoTresKerbosch.addEdge(4, 5);
        grafoTresKerbosch.addEdge(4, 6);
        grafoTresKerbosch.addEdge(4, 7);
        grafoTresKerbosch.addEdge(4, 8);
        // Se espera un clique de [0, 1, 2, 3, 4] - Resultado Correcto
        
        BronKerboschMaxClique.bronKerbosch(grafoTresKerbosch);
        System.out.println("Clique Máximo del tercer ejercicio Bron - Kersboch: " + BronKerboschMaxClique.maxCliqueKersboch); 

        // Forzar a que se limpie el clique máximo
        BronKerboschMaxClique.maxCliqueKersboch.clear();

        GraphKerbosch grafoCuatroKerbosch = new GraphKerbosch(20);
        //Cuarto Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutaran 20 vertices con 30 aristas
        grafoCuatroKerbosch.addEdge(0, 1); //1
        grafoCuatroKerbosch.addEdge(0, 2); //2
        grafoCuatroKerbosch.addEdge(0, 3); //3
        grafoCuatroKerbosch.addEdge(0, 4); //4
        grafoCuatroKerbosch.addEdge(0, 5); //5
        grafoCuatroKerbosch.addEdge(0, 6); //6
        grafoCuatroKerbosch.addEdge(1, 2); //7
        grafoCuatroKerbosch.addEdge(1, 3); //8
        grafoCuatroKerbosch.addEdge(1, 4); //9
        grafoCuatroKerbosch.addEdge(1, 5); //10
        grafoCuatroKerbosch.addEdge(1, 6); //11
        grafoCuatroKerbosch.addEdge(2, 3);  //12
        grafoCuatroKerbosch.addEdge(2, 4); //13
        grafoCuatroKerbosch.addEdge(2, 5); //14
        grafoCuatroKerbosch.addEdge(2, 6);  //15
        grafoCuatroKerbosch.addEdge(3, 4); //16
        grafoCuatroKerbosch.addEdge(3, 5); //17
        grafoCuatroKerbosch.addEdge(3, 6); //18
        grafoCuatroKerbosch.addEdge(4, 5); //19
        grafoCuatroKerbosch.addEdge(4, 6); //20
        grafoCuatroKerbosch.addEdge(5, 6); //21
        grafoCuatroKerbosch.addEdge(7, 8); //22
        grafoCuatroKerbosch.addEdge(8, 9); //23
        grafoCuatroKerbosch.addEdge(9, 10); //24
        grafoCuatroKerbosch.addEdge(10, 7);  // Forma un pequeño ciclo entre 7, 8, 9, y 10
        grafoCuatroKerbosch.addEdge(11, 12); //26
        grafoCuatroKerbosch.addEdge(13, 14); //27
        grafoCuatroKerbosch.addEdge(7, 0);    // Conectamos un nodo del ciclo al clique
        grafoCuatroKerbosch.addEdge(11, 3);   // Otro nodo externo conectado al clique
        grafoCuatroKerbosch.addEdge(14, 5);   // Y otro más para integrar mejor el grafo
        // Se espera un clique de [0, 1, 2, 3, 4, 5, 6] - Resultado Correcto

        BronKerboschMaxClique.bronKerbosch(grafoCuatroKerbosch);
        System.out.println("Clique Máximo del cuarto ejercicio de Bron - Kersboch " + BronKerboschMaxClique.maxCliqueKersboch);

        // Forzar a que se limpie el clique máximo
        BronKerboschMaxClique.maxCliqueKersboch.clear();

        GraphKerbosch grafoCincoKerbosch = new GraphKerbosch(20);
        // Quinta Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutaran 20 vertices con 40 aristas
        // Agregando conexiones para el clique de 6 nodos (3-8)
        for (int i = 3; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                grafoCincoKerbosch.addEdge(i, j);
            }
        }
        // Ahora, agregamos conexiones adicionales para alcanzar un total de 40 aristas
        // Pueden ser conexiones entre nodos del clique o entre nodos del clique y nodos externos
        grafoCincoKerbosch.addEdge(7, 12);
        grafoCincoKerbosch.addEdge(15, 18);
        grafoCincoKerbosch.addEdge(7, 17);
        grafoCincoKerbosch.addEdge(14, 17);
        grafoCincoKerbosch.addEdge(8, 10);
        grafoCincoKerbosch.addEdge(7, 13);
        grafoCincoKerbosch.addEdge(10, 19);
        grafoCincoKerbosch.addEdge(13, 16);
        grafoCincoKerbosch.addEdge(9, 12);
        grafoCincoKerbosch.addEdge(11, 9);
        grafoCincoKerbosch.addEdge(8, 15);
        grafoCincoKerbosch.addEdge(14, 19);
        grafoCincoKerbosch.addEdge(9, 18);
        grafoCincoKerbosch.addEdge(10, 15);
        grafoCincoKerbosch.addEdge(11, 14);
        grafoCincoKerbosch.addEdge(7, 19);
        grafoCincoKerbosch.addEdge(12, 18);
        grafoCincoKerbosch.addEdge(13, 17);
        grafoCincoKerbosch.addEdge(8, 14);
        grafoCincoKerbosch.addEdge(10, 11);
        grafoCincoKerbosch.addEdge(9, 17);
        grafoCincoKerbosch.addEdge(12, 19);
        grafoCincoKerbosch.addEdge(13, 15);
        grafoCincoKerbosch.addEdge(16, 10);
        // Se espera un clique de [3,4,5,6,7,8] - Resultado Correcto
        BronKerboschMaxClique.bronKerbosch(grafoCincoKerbosch);
        System.out.println("Clique Máximo del quinto ejercicio de Bron - Kersboch " + BronKerboschMaxClique.maxCliqueKersboch);

        // Forzar a que se limpie el clique máximo
        BronKerboschMaxClique.maxCliqueKersboch.clear();

        GraphKerbosch grafoSeisKerbosch = new GraphKerbosch(20);
        // En este momento se ejecutaran 20 vertices con 50 aristas
        // Agregando conexiones para el clique de 7 nodos (0-6)
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 7; j++) {
                grafoSeisKerbosch.addEdge(i, j);
            }
        }
        // Ahora, agregamos conexiones adicionales para alcanzar un total de 50 aristas
        // Estas conexiones pueden ser entre nodos del clique o entre nodos del clique y nodos externos
        // Aquí añadimos conexiones entre nodos del clique y algunos nodos externos para diversificar el grafo
        grafoSeisKerbosch.addEdge(0, 8);
        grafoSeisKerbosch.addEdge(0, 9);
        grafoSeisKerbosch.addEdge(0, 10);
        grafoSeisKerbosch.addEdge(0, 11);
        grafoSeisKerbosch.addEdge(0, 12);
        grafoSeisKerbosch.addEdge(0, 13);
        grafoSeisKerbosch.addEdge(0, 14);
        grafoSeisKerbosch.addEdge(1, 8);
        grafoSeisKerbosch.addEdge(1, 9);
        grafoSeisKerbosch.addEdge(1, 10);
        grafoSeisKerbosch.addEdge(1, 11);
        grafoSeisKerbosch.addEdge(1, 12);
        grafoSeisKerbosch.addEdge(1, 13);
        grafoSeisKerbosch.addEdge(1, 14);
        grafoSeisKerbosch.addEdge(2, 8);
        grafoSeisKerbosch.addEdge(2, 9);
        grafoSeisKerbosch.addEdge(2, 10);
        grafoSeisKerbosch.addEdge(2, 11);
        grafoSeisKerbosch.addEdge(2, 12);
        grafoSeisKerbosch.addEdge(2, 13);
        grafoSeisKerbosch.addEdge(2, 14);
        grafoSeisKerbosch.addEdge(3, 8);
        grafoSeisKerbosch.addEdge(3, 9);
        grafoSeisKerbosch.addEdge(3, 10);
        grafoSeisKerbosch.addEdge(3, 11);
        grafoSeisKerbosch.addEdge(3, 12);
        grafoSeisKerbosch.addEdge(3, 13);
        grafoSeisKerbosch.addEdge(3, 14);
        grafoSeisKerbosch.addEdge(4, 8);
        // Se espera un clique de [0, 1, 2, 3, 4, 5, 6] - Resultado Correcto
        BronKerboschMaxClique.bronKerbosch(grafoSeisKerbosch);
        System.out.println("Clique Máximo del sexto ejercicio de Bron - Kersboch " + BronKerboschMaxClique.maxCliqueKersboch);

        // Forzar a que se limpie el clique máximo
        BronKerboschMaxClique.maxCliqueKersboch.clear();

        GraphKerbosch grafoSieteKerbosch = new GraphKerbosch(20);
        // En este momento se ejecutaran 20 vertices con 80 aristas
        // Agregando conexiones para el clique de 13 nodos (0-12)
        for (int i = 0; i < 13; i++) {
            for (int j = i + 1; j < 13; j++) {
                grafoSieteKerbosch.addEdge(i, j);
            }
        }
        // Ahora, agregamos conexiones adicionales para alcanzar un total de 80 aristas
        // Aquí agregamos conexiones entre nodos del clique y algunos nodos externos para diversificar el grafo
        grafoSieteKerbosch.addEdge(13, 14);
        grafoSieteKerbosch.addEdge(18, 15);
        // Se espera un clique de [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12] - Resultado Correcto
        BronKerboschMaxClique.bronKerbosch(grafoSieteKerbosch);
        System.out.println("Clique Máximo del Septimo ejercicio de Bron - Kersboch " + BronKerboschMaxClique.maxCliqueKersboch);

        // Forzar a que se limpie el clique máximo
        BronKerboschMaxClique.maxCliqueKersboch.clear();

        // Octava Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutaran 40 vertices con 120 aristas
        // Agregando conexiones para el clique de 15 nodos (0-14)
        GraphKerbosch grafoOchoKerbosch = new GraphKerbosch(40);
        for (int i = 0; i < 15; i++) {
            for (int j = i + 1; j < 15; j++) {
                grafoOchoKerbosch.addEdge(i, j);
            }
        }
        // En este momento tenemos un clique de 15 nodos (0-14) con 105 aristas
        // Ahora, agregamos conexiones adicionales para alcanzar un total de 120 aristas
        grafoOchoKerbosch.addEdge(15, 16);
        grafoOchoKerbosch.addEdge(15, 17);
        grafoOchoKerbosch.addEdge(15, 18);
        grafoOchoKerbosch.addEdge(15, 19);
        grafoOchoKerbosch.addEdge(16, 17);
        grafoOchoKerbosch.addEdge(16, 18);
        grafoOchoKerbosch.addEdge(16, 19);
        grafoOchoKerbosch.addEdge(17, 18);
        grafoOchoKerbosch.addEdge(17, 19);
        grafoOchoKerbosch.addEdge(18, 19);
        grafoOchoKerbosch.addEdge(19, 20);
        grafoOchoKerbosch.addEdge(19, 21);
        grafoOchoKerbosch.addEdge(19, 22);
        grafoOchoKerbosch.addEdge(19, 23);
        grafoOchoKerbosch.addEdge(19, 24);
        // Se espera un clique de [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14] - Resultado Correcto
        BronKerboschMaxClique.bronKerbosch(grafoOchoKerbosch);
        System.out.println("Clique Máximo del Octava ejercicio de Bron - Kersboch " + BronKerboschMaxClique.maxCliqueKersboch);

        // Forzar a que se limpie el clique máximo
        BronKerboschMaxClique.maxCliqueKersboch.clear();

        // Novena Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutan 60 vertices con 240 aristas
        // Agregando Conexiones para el clique de 20 nodos (19-39)
        GraphKerbosch grafoNueveKerbosch = new GraphKerbosch(60);
        for (int i = 19; i < 41; i++) {
            for (int j = i + 1; j < 41; j++) {
                grafoNueveKerbosch.addEdge(i, j);
            }
        }
        // En este momento tenemos un clique de 22 nodos con 231 aristas
        //Ahora agregamos las conexiones restantes 240 - 231 = 9
        grafoNueveKerbosch.addEdge(3, 6);
        grafoNueveKerbosch.addEdge(5, 8);
        grafoNueveKerbosch.addEdge(12, 17);
        grafoNueveKerbosch.addEdge(10, 14);
        grafoNueveKerbosch.addEdge(44, 53);
        grafoNueveKerbosch.addEdge(45, 58);
        grafoNueveKerbosch.addEdge(48, 57);
        grafoNueveKerbosch.addEdge(47, 59);
        grafoNueveKerbosch.addEdge(46, 51);

        BronKerboschMaxClique.bronKerbosch(grafoNueveKerbosch);
        System.out.println("Clique Máximo del novena ejercicio de Bron - Kersboch " + BronKerboschMaxClique.maxCliqueKersboch);

        // Forzar a que se limpie el clique máximo
        BronKerboschMaxClique.maxCliqueKersboch.clear();

        // Decima Prueba del Proyecto Analisis de Algoritmos
        //En este momento se realizan 80 Vertices con 400 aristas
        // Vamos elegir un clique en este grafo de 28 nodos el cual tendra 378 aristas
        GraphKerbosch grafoDiezKerbosch = new GraphKerbosch(80);
        for (int i = 10; i < 39; i++) {
            for (int j = i + 1; j < 39; j++) {
                grafoDiezKerbosch.addEdge(i, j);
            }
        }
        // En este momento tenemos un clique de 28 nodos con 378 aristas
        // Ahora agregamos los nodos restantes 400 - 378 = 22
        grafoDiezKerbosch.addEdge(0, 2);
        grafoDiezKerbosch.addEdge(3, 8);
        grafoDiezKerbosch.addEdge(4, 9);
        grafoDiezKerbosch.addEdge(6, 7);
        grafoDiezKerbosch.addEdge(1, 5);
        grafoDiezKerbosch.addEdge(40, 45);
        grafoDiezKerbosch.addEdge(41, 46);
        grafoDiezKerbosch.addEdge(42, 50);
        grafoDiezKerbosch.addEdge(43, 55);
        grafoDiezKerbosch.addEdge(44, 49);
        grafoDiezKerbosch.addEdge(51, 58);
        grafoDiezKerbosch.addEdge(52, 59);
        grafoDiezKerbosch.addEdge(60, 65);
        grafoDiezKerbosch.addEdge(61, 70);
        grafoDiezKerbosch.addEdge(62, 66);
        grafoDiezKerbosch.addEdge(63, 67);
        grafoDiezKerbosch.addEdge(64, 68);
        grafoDiezKerbosch.addEdge(69, 75);
        grafoDiezKerbosch.addEdge(71, 76);  
        grafoDiezKerbosch.addEdge(72, 77);
        grafoDiezKerbosch.addEdge(73, 78);
        grafoDiezKerbosch.addEdge(74, 79);
        BronKerboschMaxClique.bronKerbosch(grafoDiezKerbosch);
        System.out.println("Clique Máximo del decima ejercicio de Bron - Kersboch " + BronKerboschMaxClique.maxCliqueKersboch);
    //--------------------------------------------------------------------------------------------------------------
    }
}
