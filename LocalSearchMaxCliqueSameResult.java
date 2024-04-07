import java.util.HashSet;
import java.util.Set;

public class LocalSearchMaxCliqueSameResult {
    
    public static Set<Integer> localSearchMaxClique(Graph graph) {
        // Inicialización
        Set<Integer> currentClique = new HashSet<>();
        
        // Comenzar con el primer vértice
        currentClique.add(0);
        
        // Intentar agregar todos los vértices restantes conectados a este vértice
        for (int v = 1; v < graph.getVertexCount(); v++) {
            if (graph.hasEdge(0, v)) {
                currentClique.add(v);
            }
        }
        
        return currentClique;
    }

    // Clase Graph (simplificada)
    static class Graph {
        private int vertexCount;
        private boolean[][] adjacencyMatrix;

        public Graph(int vertexCount) {
            this.vertexCount = vertexCount;
            this.adjacencyMatrix = new boolean[vertexCount][vertexCount];
        }

        public int getVertexCount() {
            return vertexCount;
        }

        public boolean hasEdge(int u, int v) {
            return adjacencyMatrix[u][v];
        }

        public void addEdge(int u, int v) {
            adjacencyMatrix[u][v] = true;
            adjacencyMatrix[v][u] = true;
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        // Crear un grafo de ejemplo
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(0, 4);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(5, 4);
        graph.addEdge(5, 1);
        graph.addEdge(5, 2);
        graph.addEdge(5, 3);
        graph.addEdge(5, 0);


        
        // Encontrar el clique máximo
        Set<Integer> maxClique = localSearchMaxClique(graph);
        System.out.println("Clique Máximo: " + maxClique);
    }
}
