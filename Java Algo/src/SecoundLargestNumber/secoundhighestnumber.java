package SecoundLargestNumber;

import java.util.ArrayList;

public class secoundhighestnumber {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(-2);
	list.add(-2);
	list.add(-1);
	list.add(-3);
	
	secoundlargestNumber(list);

}

private static void secoundlargestNumber_(ArrayList<Integer> list) {
	// TODO Auto-generated method stub

	int secondLargest = (int) list.get(0);
	int largest = list.get(0);
	for (int i = 1; i < list.size(); i++) {
		if (list.get(i)>largest) {
			
			secondLargest=largest;
			largest=list.get(i);
		}
		else if(list.get(i)>secondLargest  && secondLargest!=largest) {
		secondLargest=list.get(i);
		}
	}
	System.out.print("Second biggest number "+secondLargest);
	System.out.print(" biggest number "+largest);
}
private static void secoundlargestNumber(ArrayList<Integer> list) {
	// TODO Auto-generated method stub

	int secondLargest = (int) list.get(0);
	int largest = list.get(0);
	for (int i = 1; i < list.size(); i++) {
	  if(list.get(i) > largest) {
	    secondLargest = largest;
	    largest = list.get(i);
	  }
	  if(list.get(i) > secondLargest && list.get(i) != largest) {
	    secondLargest = list.get(i);
	  }
	}
	System.out.print("Second biggest number "+secondLargest);
}
}
