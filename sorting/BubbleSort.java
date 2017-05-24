package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] inp = {5,7,3,2,1};
		bubble(inp);
		System.out.println("Sorted list" +Arrays.toString(inp));
		

	}
	
	public static void bubble(int[] arr){
		for(int i = 0; i<arr.length; i++){
			for (int j = 1; j < arr.length-i; j++){
                if (arr[j-1] > arr[j])
                {
                    
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
			}
			
		}
		
	}

}
