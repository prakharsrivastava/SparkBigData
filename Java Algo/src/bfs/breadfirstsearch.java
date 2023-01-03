package bfs;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTreeLinkedList.TreeNode;

public class breadfirstsearch {

	 static  void traversal(Node node) {
		
		Queue<Node> q=new LinkedList<Node>();
		q.add(node);
		while(!q.isEmpty() && node !=null) {
			
			
			Node nodes=q.remove();
			
			
			System.out.println(nodes.Data);
			if(nodes.left!=null) {
				q.add(nodes.left);
			}
			if (nodes.right!=null) {
				q.add(nodes.right);
			}
			
		}
	}
	
	
}
