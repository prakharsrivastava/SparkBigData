package BinaryTreeLinkedList;

public class LinkedListNode {

	LinkedListNode next;
	LinkedListNode previous;
	String Data;
	

	public LinkedListNode(String data) {
		// TODO Auto-generated constructor stub
		this.Data=data;
	}


	static LinkedListNode createNode(TreeNode Data) {
		// TODO Auto-generated constructor stub
		return new LinkedListNode(Data.Data);
	}

	
	
}
