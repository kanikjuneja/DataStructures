package linearSearch;

public class LinearSearch {

	public static void main(String[] args) {
		LinearSearch obj = new LinearSearch();
		int []src = {1,2,3,4,5};
		int no = 2;
		int result = obj.linearSrch(2, src);
		System.out.println(result);
		
		
		

	}
	public int linearSrch(int n, int []arr){
		for(int i=0; i<arr.length; i++){
		if(arr[i] == n){
			return i;
		}	
		}
		return -1;
	}

}
