package dijkstra.engine;

import java.util.*;

import dijkstra.model.Edge;
import dijkstra.model.Graph;
import dijkstra.model.Node;

public class TestDijkstra {

	private static List<Node> nodes;
    private static List<Edge> edges;
	
	public static void main(String[] args) {
		nodes = new ArrayList<Node>();
        edges = new ArrayList<Edge>();
                
        Node bordeaux = new Node("bordeaux", "Bordeaux");
        Node brest = new Node("brest", "Brest");
        Node nantes = new Node("nantes", "Nantes");
        Node arras = new Node("arras", "Arras");
        Node paris = new Node("paris", "Paris");
        Node poitiers = new Node("poitiers", "Poitiers");
        Node lyon = new Node("lyon", "Lyon");
        Node montpellier = new Node("montpellier", "Montpellier");
        Node strasbourg = new Node("strasbourg", "Strasbourg");
        Node marseille = new Node("marseille", "Marseille");
                
        nodes.add(bordeaux);
        nodes.add(brest);
        nodes.add(nantes);
        nodes.add(arras);
        nodes.add(paris);
        nodes.add(poitiers);
        nodes.add(lyon);
        nodes.add(montpellier);
        nodes.add(strasbourg);
        nodes.add(marseille);
        
        edges.add(new Edge("Edge_0", bordeaux, nantes, 334));
        edges.add(new Edge("Edge_1", bordeaux, poitiers, 237));
        edges.add(new Edge("Edge_2", brest, nantes, 298));
        edges.add(new Edge("Edge_3", brest, paris, 593));
        edges.add(new Edge("Edge_4", nantes, arras, 561));
        edges.add(new Edge("Edge_5", nantes, paris, 386));
        edges.add(new Edge("Edge_6", paris, arras, 185));
        edges.add(new Edge("Edge_7", poitiers, paris, 338));
        edges.add(new Edge("Edge_8", paris, lyon, 465));
        edges.add(new Edge("Edge_9", poitiers, montpellier, 557));
        edges.add(new Edge("Edge_10", montpellier, lyon, 303));
        edges.add(new Edge("Edge_11", montpellier, strasbourg, 797));
        edges.add(new Edge("Edge_12", montpellier, marseille, 171));
        edges.add(new Edge("Edge_13", arras, strasbourg, 522));
        edges.add(new Edge("Edge_14", lyon, strasbourg, 494));
        edges.add(new Edge("Edge_15", lyon, marseille, 315));
        edges.add(new Edge("Edge_16", strasbourg, marseille, 809));
        
        Graph graph = new Graph(nodes, edges);
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        dijkstra.execute(bordeaux);
        LinkedList<Node> path = dijkstra.getPath(strasbourg);
        
        for (Node node : path) {
            System.out.println(node + " : " + dijkstra.getShortestDistance(node));
        }
	}
	
}
