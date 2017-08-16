import java.io.*;
import java.util.*;
import java.text.*;

public class Node{
	String name;	
	ArrayList<Node> edges;

	public addEdge(Node n){
		this.edges.add(edge);
		n.edges.add(this)
	}
	
	}


public class Edge{
	Node n1;
	Node n2; 

	public Edge(Node n1, Node n2){
		this.n1 = n1; 
		this.n2 = n2;
	}

	public Edge(String name1, String n2){
		this.n1 = new Node(name1); 
		this.n2 = new Node(name2);
	}

}

public class Node{
	String name; 

	public Node(String name){
		this.name = name;
	}
}

public class Graph{

	ArrayList<Edge> edges; 

	public Graph(){
		this.edges = new ArrayList<Edge>();
	}

	public void addEdge(Node n1, Node n2){
		Edge edge = new Edge(n1,n2);
		edges.add(edge);
	}
}







