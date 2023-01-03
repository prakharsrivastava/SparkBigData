package dfs;

import java.util.LinkedList;
import java.util.Queue;

public class dfsearchTest {


	
	public static void main(String[] args) {
		
	new dfssearch().traversal(new Node("A",
			new Node("B",new Node("D"),new Node("E"))
			,new Node("C")));
	}
}
