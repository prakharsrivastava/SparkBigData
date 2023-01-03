package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class InsertingNode {
	static Node Head;

	 static  Node insertathead(Node node) {
		
		 if (node==null) {
			 System.out.println("Node cannot be null");
			 return null;
		}
		 node.next=Head;
		 Head=node;
		
		 return Head;
		
	}
	 static  Node insertattail(Node node) {
			
		 if (node==null) {
			 System.out.println("Node cannot be null");
			 return null;
		}
		 Node p=Head;
		 while (p.next!=null) {
			
			p=p.next;
		}
		 p.next=node;
		
		
		 return Head;
		
	}
	 
	 static  Node insertafter(Node node,String data) {
			
		 if (node==null) {
			 System.out.println("Node cannot be null");
			 return null;
		}
		 Node p=Head;
		 while (p.Data!=data) {
			
			p=p.next;
		}
		Node src= p.next;
		p.next=node;
		node.next=src;
		 return Head;
		
	}
	 
	 static  Node insertbefore(Node node,String data) {
			
		 if (node==null) {
			 System.out.println("Node cannot be null");
			 return null;
		}
		 Node p=Head;
		 while (p.next.Data!=data) {
			
			p=p.next;
		}
		Node src= p.next;
		p.next=node;
		node.next=src;
		 return Head;
		
	}
	  
	 
	 
	 
	 static void printNode(Node node) {
		// TODO Auto-generated method stub
		 while (node!=null) {
			System.out.println(node.Data);
			node=node.next;
		}
	}
	
	
}
