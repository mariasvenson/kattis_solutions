import java.io.*;
import java.util.*;
import java.text.*;


public class VirtualFriends{

	public static class Node{
	String name;	
	ArrayList<Node> neighbours;

		public Node(String name){
			this.name = name;
			this.neighbours = new ArrayList<Node>();
		}

		public void addNeighbour(Node neighbour){
			this.neighbours.add(neighbour);
			//neighbour.neighbours.add(this);
		}
	}

	public static void main(String[] args) {  

	String input = "1\n3\nFred Barney\nBarney Betty\nBetty Wilma\n"; 
    Scanner sc = new Scanner(input);
	//Scanner sc = new Scanner(System.in);
	int numCases = Integer.parseInt(sc.nextLine());
	for(int i = 0; i < numCases; i++){
		int numPeople = Integer.parseInt(sc.nextLine());
		
		for(int j = 0; j < numPeople; j++){
			String[] names = sc.nextLine().split(" ");
			ArrayList<Node> network = new ArrayList<Node>();
			String name1 = names[0];
			String name2 = names[1];
			Node node1;
			Node node2;

			if(nodeExist(name1,network) == false){
				node1 = new Node(name1);
				network.add(node1);
			}else{
				node1 = getNode(name1, network);

			}
			if(nodeExist(name2,network) == false){
				node2 = new Node(name2);
				network.add(node2);
			}else{
				node2 = getNode(name2, network);
			}

			node1.addNeighbour(node2);
			node2.addNeighbour(node1);

			int count = 0; 
			ArrayList<Node> queue = new ArrayList<Node>();
			ArrayList<String> visited = new ArrayList<String>();
			queue.add(node1);
			
			System.out.println("-------------");
			System.out.println(node1.name);
			for(Node u : node1.neighbours){
				System.out.println(u.name);
			}
			while(queue.isEmpty() == false){
				Node currentNode = queue.remove(0);
				//System.out.println(currentNode.name);
				if(visited.contains(currentNode.name)){
					continue; 
				}
				count++;
				visited.add(currentNode.name);
				for(Node n : currentNode.neighbours){
					if(visited.contains(n)){
					}else{
						queue.add(n);
					}
				}	
			}

		System.out.println(count);

		}

	}
}


	public static boolean nodeExist(String name, ArrayList<Node> network){
		for(Node n : network){
			if(n.name.equals(name)){
				return true;
			}
		}
		return false; 
	}

	public static Node getNode(String name, ArrayList<Node> network){
		for(Node node : network){
			if(node.name.equals(name)){
				return node; 
			}
		}
		return null;
	}
}

