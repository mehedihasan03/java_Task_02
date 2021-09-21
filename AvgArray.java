public class AvgArray{
	public static void main(String[] args){

		double[] arr = {4,5,6,8,7,2,9,5,8,9,6,4,7,4,45,6,5.41,8};
		double sum = 0;
	
		for(int i = 0; i<arr.length; i++){
			sum += arr[i];
		}
		double avg = sum/arr.length;
		System.out.print(avg);
	
	}
}