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
    }

