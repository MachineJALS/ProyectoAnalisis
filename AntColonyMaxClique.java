import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Arrays;

public class AntColonyMaxClique {
    private static final int ANT_COUNT = 10; // Número de hormigas
    private static final double EVAPORATION_RATE = 0.5; // Tasa de evaporación de feromonas
    private static final double ALPHA = 1.0; // Peso de la cantidad de feromonas
    private static final double BETA = 2.0; // Peso de la heurística
    private static final double PHEROMONE_INIT = 0.1; // Nivel inicial de feromonas
    private static final int MAX_ITERATIONS = 100; // Número máximo de iteraciones

    public static Set<Integer> antColonyMaxClique(Graph graph) {
        Random random = new Random();
        Set<Integer> bestClique = new HashSet<>();
        double[][] pheromones = initializePheromones(graph.getVertexCount());
        
        // Bucle principal
        for (int iter = 0; iter < MAX_ITERATIONS; iter++) {
            Set<Integer> currentClique = new HashSet<>();
            // Construir soluciones de las hormigas
            for (int ant = 0; ant < ANT_COUNT; ant++) {
                Set<Integer> solution = constructSolution(graph, pheromones, random);
                if (solution.size() > currentClique.size()) {
                    currentClique = new HashSet<>(solution);
                }
            }
            // Actualizar la mejor solución
            if (currentClique.size() > bestClique.size()) {
                bestClique = new HashSet<>(currentClique);
            }
            // Actualizar feromonas
            updatePheromones(pheromones, currentClique);
            // Evaporar feromonas
            evaporatePheromones(pheromones);
        }
        return bestClique;
    }

    private static double[][] initializePheromones(int vertexCount) {
        double[][] pheromones = new double[vertexCount][vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                pheromones[i][j] = PHEROMONE_INIT;
            }
        }
        return pheromones;
    }

    private static Set<Integer> constructSolution(Graph graph, double[][] pheromones, Random random) {
        Set<Integer> solution = new HashSet<>();
        List<Integer> candidates = new ArrayList<>();
        for (int i = 0; i < graph.getVertexCount(); i++) {
            candidates.add(i);
        }
        while (!candidates.isEmpty()) {
            int vertexToAdd = selectNextVertex(graph, solution, candidates, pheromones, random);
            solution.add(vertexToAdd);
            candidates.remove((Integer) vertexToAdd);
        }
        return solution;
    }

    private static int selectNextVertex(Graph graph, Set<Integer> solution, List<Integer> candidates,
                                        double[][] pheromones, Random random) {
        double total = 0;
        double[] probabilities = new double[candidates.size()];
        int currentIndex = 0;
        for (int currentCandidate : candidates) {
            double pheromoneLevel = pheromones[currentCandidate][currentCandidate];
            double heuristicValue = calculateHeuristic(graph, solution, currentCandidate);
            probabilities[currentIndex] = Math.pow(pheromoneLevel, ALPHA) * Math.pow(heuristicValue, BETA);
            total += probabilities[currentIndex];
            currentIndex++;
        }
        double randomValue = random.nextDouble() * total;
        double cumulativeProbability = 0;
        for (int i = 0; i < candidates.size(); i++) {
            cumulativeProbability += probabilities[i];
            if (cumulativeProbability >= randomValue) {
                return candidates.get(i);
            }
        }
        // Si no se ha seleccionado un vértice, seleccionar aleatoriamente uno de los candidatos restantes
        return candidates.get(random.nextInt(candidates.size()));
    }

    private static double calculateHeuristic(Graph graph, Set<Integer> solution, int candidate) {
        // Se puede implementar una heurística simple para calcular la calidad de añadir un vértice al conjunto
        // Por ejemplo, se puede calcular el número de vecinos que el vértice tiene en el conjunto actual
        int neighborCount = 0;
        for (int vertex : solution) {
            if (graph.hasEdge(candidate, vertex)) {
                neighborCount++;
            }
        }
        return neighborCount;
    }

    private static void updatePheromones(double[][] pheromones, Set<Integer> clique) {
        // Incrementar feromonas en las aristas de los vértices en la clique
        for (int u : clique) {
            for (int v : clique) {
                if (u != v) {
                    pheromones[u][v] += 1.0;
                }
            }
        }
    }

    private static void evaporatePheromones(double[][] pheromones) {
        // Evaporar las feromonas en todas las aristas
        for (int i = 0; i < pheromones.length; i++) {
            for (int j = 0; j < pheromones[i].length; j++) {
                pheromones[i][j] *= (1 - EVAPORATION_RATE);
            }
        }
    }

    // La clase Graph es la misma que la proporcionada en el código anterior

    // Método main para probar el algoritmo
    public static void main(String[] args) {
        // Crear un grafo de ejemplo
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        //graph.addEdge(0, 4);

        // Encontrar el clique máximo utilizando el algoritmo de colonia de hormigas
        Set<Integer> maxClique = antColonyMaxClique(graph);
        System.out.println("Clique Máximo: " + maxClique);
    }
}

class Graph {
    private final int vertexCount;
    private final boolean[][] adjacencyMatrix;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Graph adjacency matrix:\n");
        for (int i = 0; i < vertexCount; i++) {
            sb.append(Arrays.toString(adjacencyMatrix[i])).append("\n");
        }
        return sb.toString();
    }
}
