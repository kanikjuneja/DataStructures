package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args){
		int[] inp = {5,4,3,2,1};
		System.out.println("Unsorted list" +Arrays.toString(inp));
		
		sort(inp);
		System.out.println("Sorted list" +Arrays.toString(inp));
		
		
	}
	
	public static void sort(int[] arr){
		for(int i = 0; i < arr.length-1; i++){
			
			int min  = i;
			
			for(int j = i+1; j < arr.length; j++){ 
			
			if(arr[min] > arr[j]){
				min = j;
				
				
			}
				
			}
			int smallerNumber = arr[min];
			arr[min] = arr[i];
			arr[i] = smallerNumber;
			
		}
		
		
	}
	

}
