package dsa;

public class selectionsort {
public static void main (String args[]){
	int a[]={3,7,8,9,1,4};
	int i,j,min,temp;
	for (i=0 ; i<6; i++){
		System.out.println(a[i]);
	}
	long startTime = System.nanoTime(); 
	for (i=0; i<5;i++){
		min = i;
		for (j= i+1; j<6; j++){
			if(a[j]<a[min]){
				min = j;
			}
			
			
			}
		if(min  != i){
			temp= a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		}
	long stopTime = System.nanoTime(); 
	long elapsedTime = stopTime - startTime;
	System.out.println(elapsedTime);
	for (i=0 ; i<6; i++){
		System.out.println(a[i]);
	}
	}
}

