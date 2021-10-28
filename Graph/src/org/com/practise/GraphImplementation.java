package org.com.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphImplementation {

	static class Edge {
		Object dest;
		int weight;

		public Object getDest() {
			return dest;
		}

		public void setDest(Object dest) {
			this.dest = dest;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public Edge(Object dest, int weight) {
			super();
			this.dest = dest;
			this.weight = weight;
		}

	}

	static class Graph {
		HashMap<Object, ArrayList<Edge>> adjacencyList;

		public Graph() {
			this.adjacencyList = new HashMap<Object, ArrayList<Edge>>();
		}

		public void addVertex(Object nodeVal) {
			this.adjacencyList.put(nodeVal, null);
		}

		public void addEdge(Object src, Edge edge) {
			ArrayList<Edge> neighbours;
			Object dest = edge.getDest();

			if (this.adjacencyList.containsKey(src)) {
				if (this.adjacencyList.get(src) == null) {
					neighbours = new ArrayList<Edge>();
					neighbours.add(edge);
					this.adjacencyList.put(src, neighbours);
				} else
					this.adjacencyList.get(src).add(edge);
			}
			if (this.adjacencyList.containsKey(dest)) {
				if (this.adjacencyList.get(dest) == null) {
					neighbours = new ArrayList<Edge>();
					neighbours.add(new Edge(src, edge.getWeight()));
					this.adjacencyList.put(dest, neighbours);
				} else
					this.adjacencyList.get(dest).add(new Edge(src, edge.getWeight()));
			}

		}

		public void removeVertex(Object val) {
			ArrayList<Edge> vertexNeighbours = this.adjacencyList.get(val);
			ArrayList<Edge> neighbours;
			for (Edge edge : vertexNeighbours) {
				neighbours = this.adjacencyList.get(edge.getDest());
				for (Edge e : neighbours) {
					if (e.getDest().equals(val)) {
						neighbours.remove(e);
						break;
					}
				}
				this.adjacencyList.replace(edge.getDest(), neighbours);
			}
			this.adjacencyList.remove(val);
		}

		public void removeEdge(Object src, Edge edge) {
			ArrayList<Edge> neighbours;
			Object dest = edge.getDest();
			neighbours = this.adjacencyList.get(src);
			neighbours.remove(edge);
			if (neighbours.isEmpty())
				this.adjacencyList.replace(src, null);
			else
				this.adjacencyList.replace(src, neighbours);

			neighbours = this.adjacencyList.get(dest);
			neighbours.remove(new Edge(src, edge.getWeight()));
			if (neighbours.isEmpty())
				this.adjacencyList.replace(dest, null);
			else
				this.adjacencyList.replace(dest, neighbours);
		}

		public List<String> printNeighbors() {
			List<String> result = new ArrayList<String>();

			StringBuffer buffer = new StringBuffer();

			for (Object vertex : this.adjacencyList.keySet()) {
				buffer.append('\n' + vertex.toString());
				buffer.append(':');

				for (Edge edge : this.adjacencyList.get(vertex)) {
					buffer.append(' ' + edge.getDest().toString() + " weight: " + edge.getWeight() + ", ");
				}

				result.add(buffer.toString());
				buffer.delete(0, buffer.length());
			}

			return result;
		}

	}
}
