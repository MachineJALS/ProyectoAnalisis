package AlgoritmosUsados;
import java.util.Set;

import AlgoritmosUsados.LocalSearchMaxCliqueSameResult.*;
import AlgoritmosUsados.BronKerboschMaxClique.*;

public class Main {
    
    public static void main(String[] args) {
        // Apartado de LocalSearchMaxCliqueSameResult
        Graph grafoUno = new Graph(5);

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
        System.out.println("Clique Máximo del primer ejercicio método Busqueda Local: " + maxClique);

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
        System.out.println("Clique Máximo del primer ejercicio método Busqueda Local: " + maxClique);

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
        System.out.println("Clique Máximo del primer ejercicio método Busqueda Local: " + maxClique);

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
        System.out.println("Clique Máximo del primer ejercicio método Busqueda Local: " + maxClique);


        // Sexta Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutaran 20 vertices con 50 aristas
        // Agregando conexiones para el clique de 15 nodos (0-14)
        Graph grafoSeis = new Graph(20);
        grafoSeis.agregarConexion(0, 1);
        grafoSeis.agregarConexion(0, 2);
        grafoSeis.agregarConexion(0, 3);
        grafoSeis.agregarConexion(0, 4);
        grafoSeis.agregarConexion(0, 5);
        grafoSeis.agregarConexion(0, 6);
        grafoSeis.agregarConexion(0, 7);
        grafoSeis.agregarConexion(0, 8);
        grafoSeis.agregarConexion(0, 9);
        grafoSeis.agregarConexion(0, 10);
        grafoSeis.agregarConexion(0, 11);
        grafoSeis.agregarConexion(0, 12);
        grafoSeis.agregarConexion(0, 13);
        grafoSeis.agregarConexion(0, 14);
        grafoSeis.agregarConexion(1, 2);
        grafoSeis.agregarConexion(1, 3);
        grafoSeis.agregarConexion(1, 4);
        grafoSeis.agregarConexion(1, 5);
        grafoSeis.agregarConexion(1, 6);
        grafoSeis.agregarConexion(1, 7);
        grafoSeis.agregarConexion(1, 8);
        grafoSeis.agregarConexion(1, 9);
        grafoSeis.agregarConexion(1, 10);
        grafoSeis.agregarConexion(1, 11);
        grafoSeis.agregarConexion(1, 12);
        grafoSeis.agregarConexion(1, 13);
        grafoSeis.agregarConexion(1, 14);
        // Se repiten las conexiones para el nodo 1, con los demas nodos
        grafoSeis.agregarConexion(2, 3);
        grafoSeis.agregarConexion(2, 4);
        grafoSeis.agregarConexion(2, 5);
        grafoSeis.agregarConexion(2, 6);
        grafoSeis.agregarConexion(2, 7);
        grafoSeis.agregarConexion(2, 8);
        grafoSeis.agregarConexion(2, 9);
        grafoSeis.agregarConexion(2, 10);
        grafoSeis.agregarConexion(2, 11);
        grafoSeis.agregarConexion(2, 12);
        grafoSeis.agregarConexion(2, 13);
        grafoSeis.agregarConexion(2, 14);
        // Se repiten las conexiones para el nodo 2, con los demas nodos
        grafoSeis.agregarConexion(3, 4);
        grafoSeis.agregarConexion(3, 5);
        grafoSeis.agregarConexion(3, 6);
        grafoSeis.agregarConexion(3, 7);
        grafoSeis.agregarConexion(3, 8);
        grafoSeis.agregarConexion(3, 9);
        grafoSeis.agregarConexion(3, 10);
        grafoSeis.agregarConexion(3, 11);
        grafoSeis.agregarConexion(3, 12);
        grafoSeis.agregarConexion(3, 13);
        grafoSeis.agregarConexion(3, 14);
        // Se repiten las conexiones para el nodo 3, con los demas nodos
        grafoSeis.agregarConexion(4, 5);
        grafoSeis.agregarConexion(4, 6);
        grafoSeis.agregarConexion(4, 7);
        grafoSeis.agregarConexion(4, 8);
        grafoSeis.agregarConexion(4, 9);
        grafoSeis.agregarConexion(4, 10);
        grafoSeis.agregarConexion(4, 11);
        grafoSeis.agregarConexion(4, 12);
        grafoSeis.agregarConexion(4, 13);
        grafoSeis.agregarConexion(4, 14);
        // Se repiten las conexiones para el nodo 4, con los demas nodos
        grafoSeis.agregarConexion(5, 6);
        grafoSeis.agregarConexion(5, 7);
        grafoSeis.agregarConexion(5, 8);
        grafoSeis.agregarConexion(5, 9);
        grafoSeis.agregarConexion(5, 10);
        grafoSeis.agregarConexion(5, 11);
        grafoSeis.agregarConexion(5, 12);
        grafoSeis.agregarConexion(5, 13);
        grafoSeis.agregarConexion(5, 14);
        // Se repiten las conexiones para el nodo 5, con los demas nodos
        grafoSeis.agregarConexion(6, 7);
        grafoSeis.agregarConexion(6, 8);
        grafoSeis.agregarConexion(6, 9);
        grafoSeis.agregarConexion(6, 10);
        grafoSeis.agregarConexion(6, 11);
        grafoSeis.agregarConexion(6, 12);
        grafoSeis.agregarConexion(6, 13);
        grafoSeis.agregarConexion(6, 14);
        // Se repiten las conexiones para el nodo 6, con los demas nodos
        grafoSeis.agregarConexion(7, 8);
        grafoSeis.agregarConexion(7, 9);
        grafoSeis.agregarConexion(7, 10);
        grafoSeis.agregarConexion(7, 11);
        grafoSeis.agregarConexion(7, 12);
        grafoSeis.agregarConexion(7, 13);
        grafoSeis.agregarConexion(7, 14);
        // Se repiten las conexiones para el nodo 7, con los demas nodos
        grafoSeis.agregarConexion(8, 9);
        grafoSeis.agregarConexion(8, 10);
        grafoSeis.agregarConexion(8, 11);
        grafoSeis.agregarConexion(8, 12);
        grafoSeis.agregarConexion(8, 13);
        grafoSeis.agregarConexion(8, 14);
        // Se repiten las conexiones para el nodo 8, con los demas nodos
        grafoSeis.agregarConexion(9, 10);
        grafoSeis.agregarConexion(9, 11);
        grafoSeis.agregarConexion(9, 12);
        grafoSeis.agregarConexion(9, 13);
        grafoSeis.agregarConexion(9, 14);
        // Se repiten las conexiones para el nodo 9, con los demas nodos
        grafoSeis.agregarConexion(10, 11);
        grafoSeis.agregarConexion(10, 12);
        grafoSeis.agregarConexion(10, 13);
        grafoSeis.agregarConexion(10, 14);
        // Se repiten las conexiones para el nodo 10, con los demas nodos
        grafoSeis.agregarConexion(11, 12);
        grafoSeis.agregarConexion(11, 13);
        grafoSeis.agregarConexion(11, 14);
        // Se repiten las conexiones para el nodo 11, con los demas nodos
        grafoSeis.agregarConexion(12, 13);
        grafoSeis.agregarConexion(12, 14);
        // Se repiten las conexiones para el nodo 12, con los demas nodos
        grafoSeis.agregarConexion(13, 14);
        // Se repiten las conexiones para el nodo 13, con los demas nodos

        // Ahora, agregamos conexiones adicionales para alcanzar un total de 50 aristas
        // Estas conexiones pueden ser entre nodos del clique o entre nodos del clique y nodos externos
        // Aquí añadimos conexiones entre nodos del clique y algunos nodos externos para diversificar el grafo
        grafoSeis.agregarConexion(15, 0);
        grafoSeis.agregarConexion(15, 1);
        grafoSeis.agregarConexion(15, 2);
        grafoSeis.agregarConexion(16, 0);
        grafoSeis.agregarConexion(16, 3);
        grafoSeis.agregarConexion(16, 6);
        grafoSeis.agregarConexion(17, 0);
        grafoSeis.agregarConexion(17, 7);
        grafoSeis.agregarConexion(17, 9);
        grafoSeis.agregarConexion(18, 1);
        grafoSeis.agregarConexion(18, 2);
        grafoSeis.agregarConexion(18, 12);
        grafoSeis.agregarConexion(19, 4);
        grafoSeis.agregarConexion(19, 8);
        grafoSeis.agregarConexion(19, 14);
        // Se espera un clique de [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14] - Resultado Correcto
        maxClique = new LocalSearchMaxCliqueSameResult().localSearchMaxClique(grafoSeis);
        System.out.println("Clique Máximo del primer ejercicio método Busqueda Local: " + maxClique);


        // Septima Prueba del Proyecto Analisis de Algoritmos
        // En este momento se ejecutaran 20 vertices con 80 aristas
        // Agregando conexiones para el clique de 18 nodos (0-17)
        Graph grafoSiete = new Graph(20);
        // Agregando conexiones para el clique de 18 nodos (0-17)
        grafoSiete.agregarConexion(0, 1);
        grafoSiete.agregarConexion(0, 2);
        grafoSiete.agregarConexion(0, 3);
        grafoSiete.agregarConexion(0, 4);
        grafoSiete.agregarConexion(0, 5);
        grafoSiete.agregarConexion(0, 6);
        grafoSiete.agregarConexion(0, 7);
        grafoSiete.agregarConexion(0, 8);
        grafoSiete.agregarConexion(0, 9);
        grafoSiete.agregarConexion(0, 10);
        grafoSiete.agregarConexion(0, 11);
        grafoSiete.agregarConexion(0, 12);
        grafoSiete.agregarConexion(0, 13);
        grafoSiete.agregarConexion(0, 14);
        grafoSiete.agregarConexion(0, 15);
        grafoSiete.agregarConexion(0, 16);
        grafoSiete.agregarConexion(0, 17);
        grafoSiete.agregarConexion(1, 2);
        grafoSiete.agregarConexion(1, 3);
        grafoSiete.agregarConexion(1, 4);
        grafoSiete.agregarConexion(1, 5);
        grafoSiete.agregarConexion(1, 6);
        grafoSiete.agregarConexion(1, 7);
        grafoSiete.agregarConexion(1, 8);
        grafoSiete.agregarConexion(1, 9);
        grafoSiete.agregarConexion(1, 10);
        grafoSiete.agregarConexion(1, 11);
        grafoSiete.agregarConexion(1, 12);
        grafoSiete.agregarConexion(1, 13);
        grafoSiete.agregarConexion(1, 14);
        grafoSiete.agregarConexion(1, 15);
        grafoSiete.agregarConexion(1, 16);
        grafoSiete.agregarConexion(1, 17);
        grafoSiete.agregarConexion(2, 3);
        grafoSiete.agregarConexion(2, 4);
        grafoSiete.agregarConexion(2, 5);
        grafoSiete.agregarConexion(2, 6);
        grafoSiete.agregarConexion(2, 7);
        grafoSiete.agregarConexion(2, 8);
        grafoSiete.agregarConexion(2, 9);
        grafoSiete.agregarConexion(2, 10);
        grafoSiete.agregarConexion(2, 11);
        grafoSiete.agregarConexion(2, 12);
        grafoSiete.agregarConexion(2, 13);
        grafoSiete.agregarConexion(2, 14);
        grafoSiete.agregarConexion(2, 15);
        grafoSiete.agregarConexion(2, 16);
        grafoSiete.agregarConexion(2, 17);
        grafoSiete.agregarConexion(3, 4);
        grafoSiete.agregarConexion(3, 5);
        grafoSiete.agregarConexion(3, 6);
        grafoSiete.agregarConexion(3, 7);
        grafoSiete.agregarConexion(3, 8);
        grafoSiete.agregarConexion(3, 9);
        grafoSiete.agregarConexion(3, 10);
        grafoSiete.agregarConexion(3, 11);
        grafoSiete.agregarConexion(3, 12);
        grafoSiete.agregarConexion(3, 13);
        grafoSiete.agregarConexion(3, 14);
        grafoSiete.agregarConexion(3, 15);
        grafoSiete.agregarConexion(3, 16);
        grafoSiete.agregarConexion(3, 17);
        grafoSiete.agregarConexion(4, 5);
        grafoSiete.agregarConexion(4, 6);
        grafoSiete.agregarConexion(4, 7);
        grafoSiete.agregarConexion(4, 8);
        grafoSiete.agregarConexion(4, 9);
        grafoSiete.agregarConexion(4, 10);
        grafoSiete.agregarConexion(4, 11);
        grafoSiete.agregarConexion(4, 12);
        grafoSiete.agregarConexion(4, 13);
        grafoSiete.agregarConexion(4, 14);
        grafoSiete.agregarConexion(4, 15);
        grafoSiete.agregarConexion(4, 16);
        grafoSiete.agregarConexion(4, 17);
        grafoSiete.agregarConexion(5, 6);
        grafoSiete.agregarConexion(5, 7);
        grafoSiete.agregarConexion(5, 8);
        grafoSiete.agregarConexion(5, 9);
        grafoSiete.agregarConexion(5, 10);
        grafoSiete.agregarConexion(5, 11);
        grafoSiete.agregarConexion(5, 12);
        grafoSiete.agregarConexion(5, 13);
        grafoSiete.agregarConexion(5, 14);
        grafoSiete.agregarConexion(5, 15);
        grafoSiete.agregarConexion(5, 16);
        grafoSiete.agregarConexion(5, 17);
        grafoSiete.agregarConexion(6, 7);
        grafoSiete.agregarConexion(6, 8);
        grafoSiete.agregarConexion(6, 9);
        grafoSiete.agregarConexion(6, 10);
        grafoSiete.agregarConexion(6, 11);
        grafoSiete.agregarConexion(6, 12);
        grafoSiete.agregarConexion(6, 13);
        grafoSiete.agregarConexion(6, 14);
        grafoSiete.agregarConexion(6, 15);
        grafoSiete.agregarConexion(6, 16);
        grafoSiete.agregarConexion(6, 17);
        grafoSiete.agregarConexion(7, 8);
        grafoSiete.agregarConexion(7, 9);
        grafoSiete.agregarConexion(7, 10);
        grafoSiete.agregarConexion(7, 11);
        grafoSiete.agregarConexion(7, 12);
        grafoSiete.agregarConexion(7, 13);
        grafoSiete.agregarConexion(7, 14);
        grafoSiete.agregarConexion(7, 15);
        grafoSiete.agregarConexion(7, 16);
        grafoSiete.agregarConexion(7, 17);
        grafoSiete.agregarConexion(8, 9);
        grafoSiete.agregarConexion(8, 10);
        grafoSiete.agregarConexion(8, 11);
        grafoSiete.agregarConexion(8, 12);
        grafoSiete.agregarConexion(8, 13);
        grafoSiete.agregarConexion(8, 14);
        grafoSiete.agregarConexion(8, 15);
        grafoSiete.agregarConexion(8, 16);
        grafoSiete.agregarConexion(8, 17);
        grafoSiete.agregarConexion(9, 10);
        grafoSiete.agregarConexion(9, 11);
        grafoSiete.agregarConexion(9, 12);
        grafoSiete.agregarConexion(9, 13);
        grafoSiete.agregarConexion(9, 14);
        grafoSiete.agregarConexion(9, 15);
        grafoSiete.agregarConexion(9, 16);
        grafoSiete.agregarConexion(9, 17);
        grafoSiete.agregarConexion(10, 11);
        grafoSiete.agregarConexion(10, 12);
        grafoSiete.agregarConexion(10, 13);
        grafoSiete.agregarConexion(10, 14);
        grafoSiete.agregarConexion(10, 15);
        grafoSiete.agregarConexion(10, 16);
        grafoSiete.agregarConexion(10, 17);
        grafoSiete.agregarConexion(11, 12);
        grafoSiete.agregarConexion(11, 13);
        grafoSiete.agregarConexion(11, 14);
        grafoSiete.agregarConexion(11, 15);
        grafoSiete.agregarConexion(11, 16);
        grafoSiete.agregarConexion(11, 17);
        grafoSiete.agregarConexion(12, 13);
        grafoSiete.agregarConexion(12, 14);
        grafoSiete.agregarConexion(12, 15);
        grafoSiete.agregarConexion(12, 16);
        grafoSiete.agregarConexion(12, 17);
        grafoSiete.agregarConexion(13, 14);
        grafoSiete.agregarConexion(13, 15);
        grafoSiete.agregarConexion(13, 16);
        grafoSiete.agregarConexion(13, 17);
        grafoSiete.agregarConexion(14, 15);
        grafoSiete.agregarConexion(14, 16);
        grafoSiete.agregarConexion(14, 17);
        grafoSiete.agregarConexion(15, 16);
        grafoSiete.agregarConexion(15, 17);
        grafoSiete.agregarConexion(16, 17);

        // Ahora, agregamos conexiones adicionales para alcanzar un total de 80 aristas
        // Aquí agregamos conexiones entre nodos del clique y algunos nodos externos para diversificar el grafo
        grafoSiete.agregarConexion(18, 0);
        grafoSiete.agregarConexion(18, 1);
        grafoSiete.agregarConexion(18, 2);
        grafoSiete.agregarConexion(18, 3);
        grafoSiete.agregarConexion(18, 4);
        grafoSiete.agregarConexion(18, 5);
        grafoSiete.agregarConexion(18, 6);
        grafoSiete.agregarConexion(18, 7);
        grafoSiete.agregarConexion(19, 0);
        grafoSiete.agregarConexion(19, 1);
        grafoSiete.agregarConexion(19, 2);
        grafoSiete.agregarConexion(19, 3);
        grafoSiete.agregarConexion(19, 4);
        grafoSiete.agregarConexion(19, 5);
        grafoSiete.agregarConexion(19, 6);
        grafoSiete.agregarConexion(19, 7);

        // Se espera un clique de [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17] - Resultado Correcto
        maxClique = new LocalSearchMaxCliqueSameResult().localSearchMaxClique(grafoSiete);
        System.out.println("Clique Máximo del primer ejercicio método Busqueda Local: " + maxClique);


        // Octava Prueba del Proyecto Analisis de Algoritmos

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
