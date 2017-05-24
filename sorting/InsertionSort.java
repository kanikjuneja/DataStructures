package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort obj = new InsertionSort();
		int[] inp = {5,4,3,2,1};
		int[] result = obj.sort(inp);
		System.out.println(Arrays.toString(result));

	}
	public int[] sort(int[] arr){
		if(arr == null || arr.length == 1){
			return arr;
		}
		else{
		for(int i=1; i<arr.length; i++){
			int temp = arr[i];
			int j = i-1;
			while( j > -1 && temp < arr[j] ){
				/*if(temp < arr[j]){
					int a = temp;
					temp = arr[j];
					arr[j] = a;
					j--;
				}*/
			arr[j+1] = arr[j];
			j--;
			
		}
			arr[j+1] = temp;
		}
		
		}	
		
	
		return arr;
		}
	}

