package AlgoritmosUsados;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//TODO implementar las asignaciones y comparaciones en el algoritmo de BronKerbosch ademas
//TODO Que se puedan buscar cliques sin necesidad de comentar los anteriores grafos

public class BronKerboschMaxClique {
    
    public static Set<Integer> bronKerbosch(GraphKerbosch graph) {
        Set<Integer> clique = new HashSet<>();
        Set<Integer> candidates = new HashSet<>();
        Set<Integer> excluded = new HashSet<>();
        for (int v = 0; v < graph.getVertexCount(); v++) {
            candidates.add(v);
        }
        bronKerbosch(graph, clique, candidates, excluded);
        return clique;
    }

    private static void bronKerbosch(GraphKerbosch graph, Set<Integer> clique, Set<Integer> candidates, Set<Integer> excluded) {
        if (candidates.isEmpty() && excluded.isEmpty()) {
            if (clique.size() > maxCliqueKersboch.size()) {
                maxCliqueKersboch = new HashSet<>(clique);
            }
            return;
        }
        
        List<Integer> candidatesList = new ArrayList<>(candidates);
        for (Integer v : candidatesList) {
            Set<Integer> neighbors = graph.getNeighbors(v);
            Set<Integer> newClique = new HashSet<>(clique);
            newClique.add(v);
            bronKerbosch(graph, newClique, intersection(candidates, neighbors), intersection(excluded, neighbors));
            candidates.remove(v);
            excluded.add(v);
        }
    }

    private static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    static class GraphKerbosch {
        private int vertexCount;
        private List<Set<Integer>> adjacencyList;

        public GraphKerbosch(int vertexCount) {
            this.vertexCount = vertexCount;
            this.adjacencyList = new ArrayList<>(vertexCount);
            for (int i = 0; i < vertexCount; i++) {
                adjacencyList.add(new HashSet<>());
            }
        }

        public int getVertexCount() {
            return vertexCount;
        }

        public void addEdge(int u, int v) {
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }

        public Set<Integer> getNeighbors(int v) {
            return adjacencyList.get(v);
        }
    }

    static Set<Integer> maxCliqueKersboch = new HashSet<>();

    public static void main(String[] args) {
        // Crear un grafo de ejemplo
        //GraphKerbosch grafoUno = new GraphKerbosch(5);

        // En este momento se ejecutaran 5 vertices con 6 aristas
        // grafoUno.addEdge(0, 1);
        // grafoUno.addEdge(0, 2);
        // grafoUno.addEdge(0, 3);
        // grafoUno.addEdge(1, 2);
        // grafoUno.addEdge(1, 3);
        // grafoUno.addEdge(2, 3);
        // Se espera un clique de [0, 1, 2, 3] - Resultado Correcto


        

        // Encontrar el clique máximo
        // bronKerbosch(grafoUno);
        // System.out.println("Clique Máximo: " + maxClique);


        // En este momento se ejecutaran 10 vertices con 12 aristas
        //GraphKerbosch grafoDos = new GraphKerbosch(10);
        // grafoDos.addEdge(0, 1);
        // grafoDos.addEdge(0, 3);
        // grafoDos.addEdge(0, 4);
        // grafoDos.addEdge(1, 2);
        // grafoDos.addEdge(1, 3);
        // grafoDos.addEdge(1, 4);
        // grafoDos.addEdge(3, 4);
        // grafoDos.addEdge(3, 6);
        // grafoDos.addEdge(4, 7);
        // grafoDos.addEdge(5, 8);
        // grafoDos.addEdge(6, 7);
        // grafoDos.addEdge(6, 8);
        // bronKerbosch(grafoDos);
        // System.out.println("Clique Máximo: " + maxClique); 
         //Resultado esperado = [0,1,3,4] - Funcionó correctamente

        //Tercera prueba del proyecto de Análisis de Algoritmos
        //En este momento se ejecutarán 20 vértices con 20 aristas

        GraphKerbosch grafoTres = new GraphKerbosch(20);
        grafoTres.addEdge(0, 1);
        grafoTres.addEdge(0, 2);
        grafoTres.addEdge(0, 3);
        grafoTres.addEdge(0, 4);
        grafoTres.addEdge(1, 2);
        grafoTres.addEdge(1, 3);
        grafoTres.addEdge(1, 4);
        grafoTres.addEdge(1, 5);
        grafoTres.addEdge(2, 3);
        grafoTres.addEdge(2, 4);
        grafoTres.addEdge(2, 5);
        grafoTres.addEdge(2, 6);
        grafoTres.addEdge(3, 4);
        grafoTres.addEdge(3, 5);
        grafoTres.addEdge(3, 6);
        grafoTres.addEdge(3, 7);
        grafoTres.addEdge(4, 5);
        grafoTres.addEdge(4, 6);
        grafoTres.addEdge(4, 7);
        grafoTres.addEdge(4, 8);
        
        bronKerbosch(grafoTres);
        System.out.println("Clique Máximo: " + maxCliqueKersboch); 

    }
}
