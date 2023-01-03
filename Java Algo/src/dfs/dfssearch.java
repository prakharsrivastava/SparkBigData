package dfs;

import java.util.LinkedList;
import java.util.Queue;

public class dfssearch {

	 static  void traversal(Node node) {
		 if(node==null) {
			 return;
		 }
		 System.out.println(node.Data);
		
		  traversal(node.left);
		  traversal(node.right);
	}
	
	
}
