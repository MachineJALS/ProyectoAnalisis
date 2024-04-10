import java.util.HashSet;
import java.util.Set;

public class LocalSearchMaxCliqueSameResult {

    public static Set<Integer> localSearchMaxClique(Graph graph) {
        int asiganciones = 0;
        int comparaciones = 0;
        Set<Integer> candidates = new HashSet<>(); asiganciones++;
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
        // Primera Prueba del Proyecto Analisis de Algoritmos
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
        Set<Integer> maxClique = localSearchMaxClique(grafoUno);
        System.out.println("Clique Máximo del primer ejercicio: " + maxClique);




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

        // Encontrar el clique máximo
        maxClique = localSearchMaxClique(grafoDos);
        System.out.println("Clique Máximo del Segundo Ejercicio ejercicio: " + maxClique);

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

        maxClique = localSearchMaxClique(grafoTres);
        System.out.println("Clique Máximo del Segundo Ejercicio ejercicio: " + maxClique);

    }
}