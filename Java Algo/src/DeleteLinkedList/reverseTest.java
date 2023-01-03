package DeleteLinkedList;


import java.util.Queue;

public class reverseTest {

	static InsertingNode InsertingNode=new InsertingNode();
	static DeleteNode delete=new DeleteNode();
	
	public static void main(String[] args) {
	
		Node A=InsertingNode.insertathead(null);
		Node B=InsertingNode.insertathead(new Node("B"));
		Node C=InsertingNode.insertathead(new Node("C"));
		InsertingNode.printNode(C);
		System.out.println("----");
	Node reerse=	InsertingNode.reverse2(C);
		InsertingNode.printNode(reerse);
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
