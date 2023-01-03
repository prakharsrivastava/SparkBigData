package DeleteLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class InsertingNode {
	static Node Head;

	 static  Node Deleteathead() {
			
		 if (Head==null) {
			 System.out.println("Node cannot be null");
			 return null;
		}
		Node p= Head.next;
		 Head=p;
		
		 return Head;
		
	}
	 static  Node deleteattail() {
			
		
		Node p=Head;
		 while (p.next.next!=null) {
			
			p=p.next.next;
		}
		 p.next=null;
		
		
		 return Head;
		
	}
	 
	 static  Node deleteafter(Node node,String data) {
			
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
	 
	 static  Node deletebefore(Node node,String data) {
			
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
	 
	 static Node reverse(Node node) {
			
		 
			Node p =node;
			Node q=p.next;
			if(q == null) {
			
				return node;
			}
		
			
			if(p.next == null)
			return q;
			
			q = reverse(q);
			
			q.next = p;
			p.next = null;
			return q;
}

	  Node reverse2(Node q) {
		// TODO Auto-generated method stub
		  if(q== null) {
	            return q;
	        }
	 
	        // last node or only one node
	        if(q.next == null) {
	            return q;
	        }
	 
	        Node newHeadNode = reverse2(q.next);
	        // change references for middle chain
	        q.next.next = q;
	        q.next = null;
	 
	        // send back new head node in every recursion
	        return newHeadNode;
	}

	
	
}
