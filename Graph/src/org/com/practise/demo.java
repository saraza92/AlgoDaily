package org.com.practise;

import java.util.List;
import java.util.ArrayList;

import org.com.practise.GraphImplementation.Edge;
import org.com.practise.GraphImplementation.Graph;

public class demo {

	public static void main(String[] args) {
		Graph graph = new Graph();
		char[] vertices = new char[] { 'A', 'B', 'C', 'D', 'E', 'F' };
		for (int i = 0; i < vertices.length; i++) {
			graph.addVertex(vertices[i]);
		}
		graph.addEdge('A', new Edge('C', 2));
		graph.addEdge('A', new Edge('B', 5));
		graph.addEdge('B', new Edge('D', 8));
		graph.addEdge('B', new Edge('C', 7));
		graph.addEdge('C', new Edge('D', 4));
		graph.addEdge('C', new Edge('E', 8));
		graph.addEdge('D', new Edge('E', 6));
		graph.addEdge('D', new Edge('F', 4));
		graph.addEdge('E', new Edge('F', 3));
		// graph.removeVertex('A');

		//System.out.println("The Graph is \n" + graph.printNeighbors());
		for (int i = 0; i < vertices.length; i++)
			for (int j = 0; j < vertices.length; j++)
				System.out.println("The minimum distance from " + vertices[i] + " to " + vertices[j] + " is "
						+ DijkstrasAlgo.shortestPath(graph, vertices[i],vertices[j]));
		
		
		List<List<String>> suggestions = new ArrayList<>();
		for(int i=0;i<4;i++)
			suggestions.add(new ArrayList<String>());
		
		
		

	}

}
