import java.util.Scanner;

public class NewSort {
	
	public static void insertionSort(int arr[]) {  
        int n = arr.length;  
        for (int j = 1; j < n; j++) {  
            int key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr [i] > key ) ) {  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
    }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
          
	    System.out.println("Before Insertion Sort");    
	      for(int i:arr)
	        {    
	            System.out.print(i+" ");    
	        }    
	        System.out.println();    
	            
	        insertionSort(arr);  
	           
	        System.out.println("After Insertion Sort");    
	        for(int i:arr)
	        {    
	            System.out.print(i+" ");    
	        }
	}

}
