package LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class InsertingNodeTest {

	static InsertingNode InsertingNode=new InsertingNode();
	
	public static void main(String[] args) {
	
		Node A=InsertingNode.insertathead(null);
		Node B=InsertingNode.insertathead(new Node("B"));
		Node C=InsertingNode.insertathead(new Node("C"));
		Node D=InsertingNode.insertattail(null);
		Node E=InsertingNode.insertattail(new Node("E"));
		Node G=InsertingNode.insertafter(new Node("G"),"B");
		Node H=InsertingNode.insertbefore(new Node("H"),"B");
		InsertingNode.printNode(H);
	
	}

}
