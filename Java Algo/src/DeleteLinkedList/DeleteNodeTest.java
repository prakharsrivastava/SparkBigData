package DeleteLinkedList;


import java.util.Queue;

public class DeleteNodeTest {

	static InsertingNode InsertingNode=new InsertingNode();
	static DeleteNode delete=new DeleteNode();
	
	public static void main(String[] args) {
	
		Node A=InsertingNode.insertathead(null);
		Node B=InsertingNode.insertathead(new Node("B"));
		Node C=InsertingNode.insertathead(new Node("C"));
		Node D=InsertingNode.insertattail(null);
		Node E=InsertingNode.insertattail(new Node("E"));
		InsertingNode.printNode(E);
		Node A_=InsertingNode.Deleteathead();
		Node B_=InsertingNode.deleteattail();
		System.out.println("----");
		InsertingNode.printNode(B_);
	//	Node G=InsertingNode.insertafter(new Node("G"),"B");
	//	Node H=InsertingNode.insertbefore(new Node("H"),"B");
	
		//C
		//H
		//B
		//G
		//E
		
	//	Node A_=delete.Deleteathead();
	//	Node B_=delete.deleteattail(new Node("B"));
	//	Node C_=delete.deleteafter(new Node("C"),"G");
	//	Node D_=delete.deletebefore(null,"");
	//	delete.printNode(B);
		
	
	}

}
