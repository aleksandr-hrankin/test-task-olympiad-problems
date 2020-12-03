package two.graph;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Graph implements Iterable<String> {
    private static Graph instance;
    public final Map<String, Map<String, Double>> graph = new HashMap<>();

    public static Graph getInstance() {
        if (instance == null) {
            instance = new Graph();
        }
        return instance;
    }

    public void addCity(String node) {
        graph.put(node, new HashMap<>());
    }

    public void addPath(String source, String destination, double length) {
        graph.get(source).put(destination, length);
    }

    public Map<String, Double> edgesFrom(String node) {
        Map<String, Double> edges = graph.get(node);
        return Collections.unmodifiableMap(edges);
    }

    @Override
    public Iterator<String> iterator() {
        return graph.keySet().iterator();
    }

    public Map<String, Map<String, Double>> getGraph() {
        return graph;
    }
}
