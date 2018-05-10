package dijkstra.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dijkstra.model.Edge;
import dijkstra.model.Graph;
import dijkstra.model.Node;

public class DijkstraAlgorithm {

    private final List<Node> nodes;
    private final List<Edge> edges;
    private Set<Node> noeudsParcourus;
    private Set<Node> noeudsNonParcourus;
    private Map<Node, Node> predecessors;
    private Map<Node, Integer> distance;

    public DijkstraAlgorithm(Graph graph) {
        // créer une copie du tableau pour pouvoir travailler avec
        this.nodes = new ArrayList<Node>(graph.getNodes());
        this.edges = new ArrayList<Edge>(graph.getEdges());
    }

    public void execute(Node source) {
    	noeudsParcourus = new HashSet<Node>();
    	noeudsNonParcourus = new HashSet<Node>();
        distance = new HashMap<Node, Integer>();
        predecessors = new HashMap<Node, Node>();
        distance.put(source, 0);
        noeudsNonParcourus.add(source);
        while (noeudsNonParcourus.size() > 0) {
            Node node = getMinimum(noeudsNonParcourus);
            noeudsParcourus.add(node);
            noeudsNonParcourus.remove(node);
            findMinimalDistances(node);
        }
    }

    private void findMinimalDistances(Node node) {
        List<Node> adjacentNodes = getNeighbors(node);
        for (Node target : adjacentNodes) {
            if (getShortestDistance(target) > getShortestDistance(node) + getDistance(node, target)) {
                distance.put(target, getShortestDistance(node) + getDistance(node, target));
                predecessors.put(target, node);
                noeudsNonParcourus.add(target);
            }
        }

    }

    private int getDistance(Node node, Node target) {
        for (Edge edge : edges) {
            if (edge.getSource().equals(node) && edge.getDestination().equals(target)) {
                return edge.getWeight();
            }
        }
        throw new RuntimeException("Erreur");
    }

    private List<Node> getNeighbors(Node node) {
        List<Node> neighbors = new ArrayList<Node>();
        for (Edge edge : edges) {
            if (edge.getSource().equals(node) && !estParcouru(edge.getDestination())) {
                neighbors.add(edge.getDestination());
            }
        }
        return neighbors;
    }

    private Node getMinimum(Set<Node> noeuds) {
        Node minimum = null;
        for (Node noeud : noeuds) {
            if (minimum == null) {
                minimum = noeud;
            } else {
                if (getShortestDistance(noeud) < getShortestDistance(minimum)) {
                    minimum = noeud;
                }
            }
        }
        return minimum;
    }

    private boolean estParcouru(Node noeud) {
        return noeudsParcourus.contains(noeud);
    }

    public int getShortestDistance(Node destination) {
        Integer d = distance.get(destination);
        if (d == null) {
            return Integer.MAX_VALUE;
        } else {
            return d;
        }
    }

    /*
     * Cette methode retourne le chemin à partir de la source vers la destination sélectionnée et NULL si aucun chemin n'existe
     */
    public LinkedList<Node> getPath(Node target) {
        LinkedList<Node> path = new LinkedList<Node>();
        Node step = target;
        // Vérifier si le chemin existe
        if (predecessors.get(step) == null) {
            return null;
        }
        path.add(step);
        while (predecessors.get(step) != null) {
            step = predecessors.get(step);
            path.add(step);
        }
        // Mettre dans le bon ordre
        Collections.reverse(path);
        return path;
    }
    
}
