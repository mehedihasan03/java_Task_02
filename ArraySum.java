public class ArraySum{
	public static void main(String[] args){

		int[] arr = {4,5,6,8,7,2,9};
		int sum = 0;
	
		for(int i = 0; i<arr.length; i++){
			sum += arr[i];
		}
		System.out.print(sum);
	
	}
}