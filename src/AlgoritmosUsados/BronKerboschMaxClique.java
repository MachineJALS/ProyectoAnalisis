package AlgoritmosUsados;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// importamos la clase de tiempo
import java.util.concurrent.TimeUnit;

public class BronKerboschMaxClique {
    public static long a = 0;
    public static long c = 0;
    public static long lineasEjecutadas = 0;
    
    public static Set<Integer> bronKerbosch(GraphKerbosch graph) {
        //Obtenemos el tiempo de inicio
        long startTime = System.nanoTime(); a++;
        Set<Integer> clique = new HashSet<>(); a++;
        Set<Integer> candidates = new HashSet<>(); a++;
        Set<Integer> excluded = new HashSet<>(); a++;
        for (int v = 0; v < graph.getVertexCount(); v++) {
            a+=3; // Asignamos 3 unidades a la variable a por v=0, v++, candidates.add(v)
            candidates.add(v);
        }
        c++; // Sumamos 1 a la variable c por la iteración del for falsa

        bronKerbosch(graph, clique, candidates, excluded);
        //Obtenemos el tiempo de fin
        long endTime = System.nanoTime();
        //Calculamos el tiempo de ejecución
        long durationInNano = (endTime - startTime);
        //Convertimos el tiempo de ejecución a milisegundos
        long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);
        //Imprimimos el tiempo de ejecución
        System.out.println("Tiempo de ejecución: " + durationInMillis + " ms");

        lineasEjecutadas = a + c;
        System.out.println("Valor de lineas ejecutadas: " + lineasEjecutadas);
        System.out.println("Valor de asignaciones: " + a);
        System.out.println("Valor de comparaciones: " + c);
        //Reseteamos las variables a, c y lineasEjecutadas
        a = 0;
        c = 0;
        lineasEjecutadas = 0;
        return clique;
    }

    private static void bronKerbosch(GraphKerbosch graph, Set<Integer> clique, Set<Integer> candidates, Set<Integer> excluded) {
        a+=4; // Asignamos 4 unidades a la variable a por los 4 parámetros de la función
        c++; // Sumamos 1 a la variable c por la condición del if
        if (candidates.isEmpty() && excluded.isEmpty()) {
            c++; // Sumamos 1 a la variable c por la condición del if anidado
            if (clique.size() > maxCliqueKersboch.size()) {
                maxCliqueKersboch = new HashSet<>(clique);
                a++; // Sumamos 1 a la variable a por la creación de maxCliqueKersboch
            }
            return;
        }
        
        List<Integer> candidatesList = new ArrayList<>(candidates);
        a++; // Sumamos 1 a la variable a por la creación de candidatesList
        for (Integer v : candidatesList) {
            Set<Integer> neighbors = graph.getNeighbors(v);
            a++; // Sumamos 1 a la variable a por la creación de neighbors
            Set<Integer> newClique = new HashSet<>(clique);
            a++; // Sumamos 1 a la variable a por la creación de newClique
            newClique.add(v);
            a++; // Sumamos 1 a la variable a por la adición de v a newClique
            bronKerbosch(graph, newClique, intersection(candidates, neighbors), intersection(excluded, neighbors));
            candidates.remove(v);
            excluded.add(v);
            a+=2; // Sumamos 2 a la variable a por la eliminación de v de candidates y la adición de v a excluded
        }
    }

    private static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        a+=2; // Asignamos 2 unidades a la variable a por los 2 parámetros de la función
        Set<Integer> intersection = new HashSet<>(set1);
        a++; // Sumamos 1 a la variable a por la creación de intersection
        intersection.retainAll(set2);
        c++; // Sumamos 1 a la variable c por la llamada a retainAll
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
    }

