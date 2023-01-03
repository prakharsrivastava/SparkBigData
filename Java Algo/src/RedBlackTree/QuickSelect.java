package RedBlackTree;

import java.util.Iterator;

public class QuickSelect {
    public static void main(String[] args) {
        int[] arr = new int[]{0,10,2};
        QuickSelect q = new QuickSelect();
     
       
    System.out.println( q.getKthSmallestElement(arr,2, 0, arr.length-1));
        
      
    }

    private int getKthSmallestElement(int[] arr, int k, int low, int high) {
   
    	if (low<high) {
		
    		
      	int  q = getPivotPoint(arr,low,high);
        
      	if(k==q-1) {
      			return arr[q];
      	}else  if(k<q-1){
      		return	getKthSmallestElement(arr,k,low,q-1);
      	}else {
      	  return	  getKthSmallestElement(arr,k,q+1,high);
      	}
     
    	}
    	return -5;

	
    }
    


    private int getPivotPoint(int[] arr, int low, int high) {
    
    	 int pivot = arr[high]; //5
        int i = low;		//0

        for(int j= low;j<=high;j++){
      
            if(arr[j] < pivot){
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                i++;
            }
            //4,5,10,11,1,3,19,8,7
            //4 5 1 11 10 3 19 8 7
            // 4 5 1 3 10 11 19 8 7
            //pivotPoint =5
            //i=5

        }
        
        int tmp = arr[i];
        arr[i] = arr[high];
        arr[high] = tmp;
      
        return i;
    }
}