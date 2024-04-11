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
    static class Graph {
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