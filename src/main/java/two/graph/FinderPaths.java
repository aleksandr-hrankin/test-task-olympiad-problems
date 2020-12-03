package two.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FinderPaths {
    private Graph graph;

    public FinderPaths(Graph graph) {
        this.graph = graph;
    }

    public Map<List<String>, Double> getAllPaths(String source, String destination) {
        Map<List<String>, Double> pathWithCost = new HashMap<>();
        List<List<String>> paths = new ArrayList<>();
        List<Double> totalCost = new ArrayList<>();
        Double cost = 0D;
        recursiveWithCost(source, destination, paths,
                new LinkedHashSet<>(), totalCost, cost, new HashMap<>());
        for (int i = 0; i < paths.size(); i++) {
            pathWithCost.put(paths.get(i), totalCost.get(i));
        }
        return pathWithCost;
    }

    private void recursiveWithCost(String current,
                                   String destination,
                                   List<List<String>> paths,
                                   LinkedHashSet<String> path,
                                   List<Double> totalCost, Double cost,
                                   Map<String, Double> allEdges) {
        path.add(current);
        if (allEdges.get(current) != null) {
            cost = cost + allEdges.get(current);
        }
        if (current.equals(destination)) {
            cost = cost + allEdges.get(current);
            paths.add(new ArrayList<>(path));

            cost = cost - allEdges.get(current);
            totalCost.add(cost);
            path.remove(current);
            return;
        }

        allEdges = graph.edgesFrom(current);
        Set<String> edges = graph.edgesFrom(current).keySet();
        for (String t : edges) {
            if (!path.contains(t)) {
                recursiveWithCost(t, destination, paths, path, totalCost, cost, allEdges);
            }
        }
        path.remove(current);
    }
}
