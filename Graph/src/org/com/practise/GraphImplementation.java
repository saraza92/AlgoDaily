package org.com.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphImplementation {

	static class Graph {
		HashMap<Object, ArrayList<Object>> adjacencyList;

		public Graph() {
			this.adjacencyList = new HashMap<Object, ArrayList<Object>>();
		}

		public void addVertex(Object nodeVal) {
			this.adjacencyList.put(nodeVal, null);
		}

		public void addEdge(Object src, Object dest) {
			ArrayList<Object> neighbours;

			if (this.adjacencyList.containsKey(src)) {
				if (this.adjacencyList.get(src) == null) {
					neighbours = new ArrayList<Object>();
					neighbours.add(dest);
					this.adjacencyList.put(src, neighbours);
				} else
					this.adjacencyList.get(src).add(dest);
			}
			if (this.adjacencyList.containsKey(dest)) {
				if (this.adjacencyList.get(dest) == null) {
					neighbours = new ArrayList<Object>();
					neighbours.add(src);
					this.adjacencyList.put(dest, neighbours);
				} else
					this.adjacencyList.get(dest).add(src);
			}

		}

		public void removeVertex(Object val) {
			ArrayList<Object> vertexNeighbours = this.adjacencyList.get(val);
			ArrayList<Object> neighbours;
			for (Object vertex : vertexNeighbours) {
				neighbours = this.adjacencyList.get(vertex);
				neighbours.remove(val);
				this.adjacencyList.replace(vertex, neighbours);
			}
			this.adjacencyList.remove(val);
		}

		public void removeEdge(Object src, Object dest) {
			ArrayList<Object> neighbours;
			neighbours = this.adjacencyList.get(src);
			neighbours.remove(dest);
			if (neighbours.isEmpty())
				this.adjacencyList.replace(src, null);
			else
				this.adjacencyList.replace(src, neighbours);

			neighbours = this.adjacencyList.get(dest);
			neighbours.remove(src);
			if (neighbours.isEmpty())
				this.adjacencyList.replace(dest, null);
			else
				this.adjacencyList.replace(dest, neighbours);
		}

		public List<String> printNeighbors() {
			List<String> result = new ArrayList<String>();

			StringBuffer buffer = new StringBuffer();

			for (Object vertex : this.adjacencyList.keySet()) {
				buffer.append(vertex.toString());
				buffer.append(':');

				for (Object neighbor : this.adjacencyList.get(vertex)) {
					buffer.append(' ');
					buffer.append(neighbor.toString());
				}

				result.add(buffer.toString());
				buffer.delete(0, buffer.length());
			}

			return result;
		}
	}

	// remove or comment if running tests (we run our own main)
	public static void main(String[] args) {
		Graph graph = new Graph();
		char[] vertices = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
		for (int i = 0; i < vertices.length; i++) {
			graph.addVertex(vertices[i]);
		}
		graph.addEdge('A', 'G');
		graph.addEdge('A', 'E');
		graph.addEdge('A', 'C');
		graph.addEdge('B', 'C');
		graph.addEdge('C', 'D');
		graph.addEdge('D', 'E');
		graph.addEdge('E', 'F');
		graph.addEdge('E', 'C');
		graph.addEdge('G', 'D');
		graph.removeVertex('A');

		System.out.println(graph.printNeighbors());

	}

}
