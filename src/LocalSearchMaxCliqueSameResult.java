import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class LocalSearchMaxCliqueSameResult {

    public static Set<Integer> localSearchMaxClique(Graph graph) {
        Set<Integer> candidates = new HashSet<>();
        for (int v = 0; v < graph.getVertexCount(); v++) {
            candidates.add(v);
        }

        Set<Integer> bestClique = null;

        for (int v : candidates) {
            Set<Integer> currentClique = new HashSet<>();
            currentClique.add(v);

            for (int u : candidates) {
                if (currentClique.contains(u)) continue; // Evita agregar vértices ya presentes en el clique
                boolean isConnectedToAll = true;
                for (int w : currentClique) {
                    if (!graph.hasEdge(u, w)) {
                        isConnectedToAll = false;
                        break;
                    }
                }
                if (isConnectedToAll) {
                    currentClique.add(u);
                }
            }

            if (bestClique == null || bestClique.size() < currentClique.size()) {
                bestClique = currentClique;
            }
        }
        return bestClique;
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
        Graph graph = new Graph(11);
        /*graph.addEdge(1, 2);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(6, 4);
        graph.addEdge(1, 5); Prueba Uno Superada*/


        graph.addEdge(1, 3);
        graph.addEdge(1, 5);
        graph.addEdge(2, 8);
        graph.addEdge(3, 2);
        graph.addEdge(3, 5);
        graph.addEdge(3, 4);
        graph.addEdge(3, 6);
        graph.addEdge(5, 4);
        graph.addEdge(5, 6);
        graph.addEdge(5, 9);
        graph.addEdge(5, 7);
        graph.addEdge(4, 6);
        graph.addEdge(4, 2);
        graph.addEdge(8, 7);
        graph.addEdge(8, 6);
        graph.addEdge(7, 6);
        graph.addEdge(8, 9);
        graph.addEdge(9, 7);

        // Encontrar el clique máximo
        Set<Integer> maxClique = localSearchMaxClique(graph);
        System.out.println("Clique Máximo: " + maxClique);
    }
}