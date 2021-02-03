import java.util.Scanner;
public class BubbleSort {
	
	  static void bubbleSort(int[] a) {  
	        int N = a.length;  
	        int temp = 0;  
	         for(int i=0; i < N; i++){  
	                 for(int j=1; j < (N-i); j++){  
	                          if(a[j-1] > a[j]){    
	                                 temp = a[j-1];  
	                                 a[j-1] = a[j];  
	                                 a[j] = temp;  
	                         }  
	                          
	                 }  
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
         
         System.out.println("Array Before Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  
         System.out.println();  
           
         bubbleSort(arr);
          
         System.out.println("Array After Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  

	}

}
