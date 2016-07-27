package dsa;

public class bubblesort {
	
	public static void main (String args[]){
	
	int intArray[]={7,6,5,2,1,9};
	
	System.out.print("Unsorted Array :");
	for(int i = 0 ; i < intArray.length ; i ++){ 
			System.out.println(intArray[i] + " ");
			}
	
	bubbleSort(intArray);
	System.out.print("Sorted Array :");
	for(int i = 0 ; i < intArray.length ; i ++){ 
	System.out.println(intArray[i] + " ");
	}
	
	}
	
	private static void bubbleSort(int[] intArray){
		int a,b,temp;
		
		int n = intArray.length;
		for(a=0;a < n;a++){
			int flag = 0;
			for(b =1; b < n-a-1; b++){
			      if(intArray[b]>intArray[b+1]){
			    	  temp = intArray[b];
			    	  intArray[b] = intArray[b+1];
			    	  intArray[b+1] = temp;
			    	  flag = 1;
			      }
			}
			if(flag != 1){
				break;
			}
		}
		
	}
}
