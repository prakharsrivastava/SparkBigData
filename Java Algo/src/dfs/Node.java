package dfs;

public class Node {

	Node left;
	Node right;
	String Data;
	
	public Node(String Data) {
		// TODO Auto-generated constructor stub
		this.Data=Data;
	}

	public Node(String data,Node left, Node right) {
		super();
		this.left = left;
		this.right = right;
		Data = data;
	}
	
}
