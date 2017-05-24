package sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args){
		int[] inp = {5,6,7,2,34,23,99999999};
		MergeSort obj = new MergeSort();
		int[] res = obj.merge(inp);
		System.out.println(Arrays.toString(res));
	}
	
	public int[] merge(int[] arr){
		if(arr.length<=1){
			return arr;
		}
		
		else{
		int[] left = new int[arr.length/2];
		
		int[] right = new int[arr.length - left.length];
		
		
		for(int i=0; i<left.length; i++){
			left[i] = arr[i];
		}	
		for(int i = right.length - 1, j = arr.length - 1; i>=0; i--, j-- ){
			right[i] = arr[j];	
		}
		
		return mergeSort(merge(left), merge(right));
		}
	}
	public int[] mergeSort(int[] a1, int[] a2){
		
		int[] result = new int[a1.length + a2.length];
		int c1=0, c2=0;
		for(int i=0; i<result.length; i++){
			if(c1<a1.length && c2<a2.length){
				if(a1[c1]<a2[c2]){
					result[i] = a1[c1];
					c1++;
				}
				else{
					result[i] = a2[c2];
					c2++;
				}
			}
			else if(c1<a1.length){
				result[i] = a1[c1];
				c1++;
			}
			else if(c2<a2.length){
				result[i] = a2[c2];
				c2++;
			}
		}
		return result;
		
	}

}
