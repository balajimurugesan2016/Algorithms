package functionalInterface;

import java.util.Arrays;

public class MergeSort {
	
	public void  sort(int[] arr, int start, int end) {
		
		if(start >= end) {
			
			return;
			
		}
		
		int mid = (start + end) / 2;
		
		sort(arr, start,mid);
		sort(arr,mid+1,end);
		
		merge(arr,start ,mid  ,end );
		
	
	}
	
	public void merge(int[] arr, int start, int mid, int end) {
		
		
		
		int  l1 = mid-start+1;
        int l2 = end-mid;
	    int [] n1 =  new int[l1];
        int [] n2 = new int[l2];
		
		for(int i = 0  ;i< l1   ;i++) {
			
			 n1[i] = arr[start + i];
			
		}
		
		for(int j = 0  ;j< l2  ;j++) {
			
			 n2[j] = arr[mid  + 1 + j];
			 
			 
			 
		}
		
		 /* Merge the temp arrays back into arr[l..r]*/
	   int  i = 0; // Initial index of first subarray 
	   int  j = 0; // Initial index of second subarray 
	  int   k = start; // Initial index of merged subarray 
	    while (i <  l1 && j < l2) 
	    { 
	        if (n1[i] <= n2[j]) 
	        { 
	            arr[k] = n1[i];
	            i++; 
	        } 
	        else
	        { 
	            arr[k] = n2[j];
	            j++; 
	        } 
	        k++; 
	    } 
	  
	    /* Copy the remaining elements of L[], if there 
	       are any */
	    while (i < l1) 
	    { 
	        arr[k] = n1[i]; 
	        i++; 
	        k++; 
	    } 
	  
	    /* Copy the remaining elements of R[], if there 
	       are any */
	    while (j < l2) 
	    { 
	        arr[k] =n2[j]; 
	        j++; 
	        k++; 
	    }
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
	   
		int arr[] = { 44, 56, 72, 98, 77, 66, 55 };
		MergeSort bsr = new MergeSort();
		bsr.sort(arr, 0, arr.length -1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	
	
		
		
		

	}

}
