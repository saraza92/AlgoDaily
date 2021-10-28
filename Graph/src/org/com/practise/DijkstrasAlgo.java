package org.com.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.com.practise.GraphImplementation.Edge;
import org.com.practise.GraphImplementation.Graph;

public class DijkstrasAlgo {

	public static int shortestPath(Graph graph, Object start, Object end) {

		Map<Object, Integer> distance = new HashMap<>();

		for (Object c : graph.adjacencyList.keySet()) {
			distance.put(c, Integer.MAX_VALUE);
		}

		distance.replace(start, 0);

		ArrayList<Object> visited = new ArrayList<Object>();

		Object current = start;
		
		int newDistance;
		
		while (!visited.contains(end)) {
			visited.add(current);
			for (Edge edge : graph.adjacencyList.get(current)) {
				newDistance = distance.get(current) + edge.getWeight();
				if (distance.get(edge.getDest()) > newDistance)
					distance.replace(edge.getDest(), newDistance);
			}
			current = getShortestDistantNeighbour(visited, distance);
		}
		
		return distance.get(end);
	
	}

	public static Object getShortestDistantNeighbour(ArrayList<Object> visited, Map<Object, Integer> distance) {
		int min = Integer.MAX_VALUE;
		Object minimum = 0;
		for (Object node : distance.keySet())
			if (!visited.contains(node) && distance.get(node) < min) {
				minimum = node;
				min = distance.get(node);
			}

		return minimum;

	}
}
