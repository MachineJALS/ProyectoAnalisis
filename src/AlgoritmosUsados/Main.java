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





    //--------------------------------------------------------------------------------------------------------------




        // Apartado de BronKerboschMaxClique
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
        System.out.println("Clique Máximo en el método Bron - Kersboch: " + BronKerboschMaxClique.maxCliqueKersboch); 


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
