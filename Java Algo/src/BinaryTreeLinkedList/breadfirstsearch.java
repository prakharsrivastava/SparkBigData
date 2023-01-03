package BinaryTreeLinkedList;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTreeLinkedList.TreeNode;

public class breadfirstsearch {

	 static  void traversal(TreeNode node) {
		
		 LinkedListNode Previous = null ; 
		 LinkedListNode Head=null;
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(node);
		while(!q.isEmpty() && node !=null) {
			
			
			TreeNode nodes=q.remove();
			
			LinkedListNode	llNode	=LinkedListNode.createNode(node);
			if(Previous==null) {
				Head=llNode;
			}else {
			llNode.previous=Previous;
			Previous.next=llNode;
			}
			
			Previous=llNode;
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
