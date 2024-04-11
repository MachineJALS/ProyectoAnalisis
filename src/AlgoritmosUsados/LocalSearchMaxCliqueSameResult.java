package AlgoritmosUsados;
import java.util.HashSet;
import java.util.Set;

public class LocalSearchMaxCliqueSameResult {
    public static int a = 0;
    public static int c = 0;

    public static Set<Integer> localSearchMaxClique(Graph graph) {
        
        Set<Integer> candidates = new HashSet<>(); a++;
        for (int v = 0; v < graph.getCantidadDeVertices(); v++) { 
            candidates.add(v);
            a+=3; // Asignamos 3 unidades a la variable a por v=0, v++, candidates.add(v)
            c++; // Sumamos 1 a la variable c por la iteración del for
        }
        c++; // Sumamos 1 a la variable c por la iteración del for falsa



        Set<Integer> bestClique = null; a++;

        for (int v : candidates) {
            c++; // Sumamos 1 a la variable c por la iteración del for
            Set<Integer> currentClique = new HashSet<>(); 
            currentClique.add(v);
            a+=2; // Asignamos 2 unidades por la creación de la variable currentClique y la adición de v a currentClique


            for (int u : candidates) {
                c++; // Sumamos 1 a la variable c por la iteración del for
                if (currentClique.contains(u)) continue; // Evita agregar vértices ya presentes en el clique
                c++; 
                boolean isConnectedToAll = true;
                a++; // Asignamos 1 unidad a la variable a por la creación de la variable isConnectedToAll
                for (int w : currentClique) {
                    c++; // Sumamos 1 a la variable c por la iteración del for
                    if (!graph.tieneConexion(u, w)) {
                        c++; // Sumamos 1 a la variable c por la condición del if
                        isConnectedToAll = false;
                        a++; // Sumamos 1 a la variable a por la asignación de false a isConnectedToAll
                        break;
                    }
                    c++; // sumamos uno por la comparación falsa del if
                }
                if (isConnectedToAll) {
                    c++; // Sumamos 1 a la variable c por la condición del if
                    currentClique.add(u);
                    a++; // Sumamos 1 a la variable a por la adición de u a currentClique
                }
            }

            if (bestClique == null || bestClique.size() < currentClique.size()) {
                c+=2; // Sumamos 2 a la variable c por la condición del if
                bestClique = currentClique;
                a++; // Sumamos 1 a la variable a por la asignación de currentClique a bestClique
            }
        }
        System.out.println("Valor de asignaciones: " + a);
        System.out.println("Valor de comparaciones: " + c);
        return bestClique;
    }


    // Clase Graph (simplificada)
    static public class Graph {
        private int cantidadDeVertices;
        private boolean[][] adjacencyMatrix;

        public Graph(int vertexCount) {
            this.cantidadDeVertices = vertexCount;
            a++; // Sumamos 1 a la variable a por la creación de la variable cantidadDeVertices
            this.adjacencyMatrix = new boolean[vertexCount][vertexCount];
            a++; // Sumamos 1 a la variable a por la creación de la variable adjacencyMatrix
        }

        public int getCantidadDeVertices() {
            return cantidadDeVertices;
        }

        public boolean tieneConexion(int u, int v) {
            return adjacencyMatrix[u][v];
        }

        public void agregarConexion(int u, int v) {
            adjacencyMatrix[u][v] = true;
            a++; // Sumamos 1 a la variable a por la asignación de true a adjacencyMatrix[u][v] 
            adjacencyMatrix[v][u] = true;
            a++; // Sumamos 1 a la variable a por la asignación de true a adjacencyMatrix[v][u]
        }
    }
}