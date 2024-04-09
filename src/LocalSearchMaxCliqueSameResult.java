import java.util.HashSet;
import java.util.Set;

public class LocalSearchMaxCliqueSameResult {

    public static Set<Integer> localSearchMaxClique(Graph graph) {
        Set<Integer> candidates = new HashSet<>();
        for (int v = 0; v < graph.getCantidadDeVertices(); v++) {
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
                    if (!graph.tieneConexion(u, w)) {
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
        private int cantidadDeVertices;
        private boolean[][] adjacencyMatrix;

        public Graph(int vertexCount) {
            this.cantidadDeVertices = vertexCount;
            this.adjacencyMatrix = new boolean[vertexCount][vertexCount];
        }

        public int getCantidadDeVertices() {
            return cantidadDeVertices;
        }

        public boolean tieneConexion(int u, int v) {
            return adjacencyMatrix[u][v];
        }

        public void agregarConexion(int u, int v) {
            adjacencyMatrix[u][v] = true;
            adjacencyMatrix[v][u] = true;
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        // Crear un grafo de ejemplo
        Graph graph = new Graph(7);
        // graph.agregarConexion(1, 2);
        // graph.agregarConexion(2, 5);
        // graph.agregarConexion(3, 4);
        // graph.agregarConexion(6, 4);
        // graph.agregarConexion(1, 5); //Prueba Uno //Superada*/

        
        // graph.agregarConexion(1, 3);
        // graph.agregarConexion(1, 5);
        // graph.agregarConexion(2, 8);
        // graph.agregarConexion(3, 2);
        // graph.agregarConexion(3, 5);
        // graph.agregarConexion(3, 4);
        // graph.agregarConexion(3, 6);
        // graph.agregarConexion(5, 4);
        // graph.agregarConexion(5, 6);
        // graph.agregarConexion(5, 9);
        // graph.agregarConexion(5, 7);
        // graph.agregarConexion(4, 6);
        // graph.agregarConexion(4, 2);
        // graph.agregarConexion(8, 7);
        // graph.agregarConexion(8, 6);
        // graph.agregarConexion(7, 6);
        // graph.agregarConexion(8, 9);
        // graph.agregarConexion(9, 7);
        

        //  graph.agregarConexion(1,2);
        //  graph.agregarConexion(2,3);
        //  graph.agregarConexion(3,1);
        //  graph.agregarConexion(3,4);
        // Otra prueba superada


        graph.agregarConexion(0, 1);
        graph.agregarConexion(0, 2);
        graph.agregarConexion(0, 3);
        graph.agregarConexion(1, 2);
        graph.agregarConexion(1, 3);
        



        // Encontrar el clique máximo
        Set<Integer> maxClique = localSearchMaxClique(graph);
        System.out.println("Clique Máximo: " + maxClique);
    }
}