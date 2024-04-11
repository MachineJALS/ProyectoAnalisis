package AlgoritmosUsados;
import java.util.Set;

import AlgoritmosUsados.LocalSearchMaxCliqueSameResult.*;
import AlgoritmosUsados.BronKerboschMaxClique.*;

public class Main {
    
    public static void main(String[] args) {
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
        grafoTres.agregarConexion(5, 6);
        grafoTres.agregarConexion(5, 7);
        grafoTres.agregarConexion(5, 8);
        grafoTres.agregarConexion(5, 9);
        grafoTres.agregarConexion(6, 7);
        grafoTres.agregarConexion(6, 8);
        grafoTres.agregarConexion(6, 9);
        grafoTres.agregarConexion(7, 8);
        grafoTres.agregarConexion(7, 9);
        grafoTres.agregarConexion(8, 9);
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
        // Agregando conexiones para el clique de 10 nodos (0-9)
        grafoCinco.agregarConexion(0, 1);
        grafoCinco.agregarConexion(0, 2);
        grafoCinco.agregarConexion(0, 3);
        grafoCinco.agregarConexion(0, 4);
        grafoCinco.agregarConexion(0, 5);
        grafoCinco.agregarConexion(0, 6);
        grafoCinco.agregarConexion(0, 7);
        grafoCinco.agregarConexion(0, 8);
        grafoCinco.agregarConexion(0, 9);
        grafoCinco.agregarConexion(1, 2);
        grafoCinco.agregarConexion(1, 3);
        grafoCinco.agregarConexion(1, 4);
        grafoCinco.agregarConexion(1, 5);
        grafoCinco.agregarConexion(1, 6);
        grafoCinco.agregarConexion(1, 7);
        grafoCinco.agregarConexion(1, 8);
        grafoCinco.agregarConexion(1, 9);
        grafoCinco.agregarConexion(2, 3);
        grafoCinco.agregarConexion(2, 4);
        grafoCinco.agregarConexion(2, 5);
        grafoCinco.agregarConexion(2, 6);
        grafoCinco.agregarConexion(2, 7);
        grafoCinco.agregarConexion(2, 8);
        grafoCinco.agregarConexion(2, 9);
        grafoCinco.agregarConexion(3, 4);
        grafoCinco.agregarConexion(3, 5);
        grafoCinco.agregarConexion(3, 6);
        grafoCinco.agregarConexion(3, 7);
        grafoCinco.agregarConexion(3, 8);
        grafoCinco.agregarConexion(3, 9);
        grafoCinco.agregarConexion(4, 5);
        grafoCinco.agregarConexion(4, 6);
        grafoCinco.agregarConexion(4, 7);
        grafoCinco.agregarConexion(4, 8);
        grafoCinco.agregarConexion(4, 9);
        grafoCinco.agregarConexion(5, 6);
        grafoCinco.agregarConexion(5, 7);
        grafoCinco.agregarConexion(5, 8);
        grafoCinco.agregarConexion(5, 9);
        grafoCinco.agregarConexion(6, 7);
        grafoCinco.agregarConexion(6, 8);
        grafoCinco.agregarConexion(6, 9);
        grafoCinco.agregarConexion(7, 8);
        grafoCinco.agregarConexion(7, 9);
        grafoCinco.agregarConexion(8, 9);

        // Ahora, agregamos conexiones adicionales para alcanzar un total de 40 aristas
        // Pueden ser conexiones entre nodos del clique o entre nodos del clique y nodos externos
        grafoCinco.agregarConexion(10, 11);
        grafoCinco.agregarConexion(10, 12);
        grafoCinco.agregarConexion(11, 12);
        grafoCinco.agregarConexion(10, 0); // Conectamos un nodo externo al clique
        grafoCinco.agregarConexion(11, 1); // Conectamos otro nodo externo al clique
        grafoCinco.agregarConexion(12, 2); // Conectamos otro nodo externo al clique
        grafoCinco.agregarConexion(13, 14);
        grafoCinco.agregarConexion(13, 15);
        grafoCinco.agregarConexion(14, 15);
        grafoCinco.agregarConexion(13, 3); // Conectamos un nodo externo al clique
        grafoCinco.agregarConexion(14, 4); // Conectamos otro nodo externo al clique
        grafoCinco.agregarConexion(15, 5); // Conectamos otro nodo externo al clique

        // Se espera un clique de [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] - Resultado Correcto
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

        // Se espera un clique de [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17] - Resultado Correcto
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


        // Decima Prueba del Proyecto Analisis de Algoritmos



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
        
        BronKerboschMaxClique.bronKerbosch(grafoTresKerbosch);
        System.out.println("Clique Máximo: " + BronKerboschMaxClique.maxCliqueKersboch); 
    }
}
