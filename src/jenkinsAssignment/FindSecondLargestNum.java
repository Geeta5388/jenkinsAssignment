package jenkinsAssignment;

public class FindSecondLargestNum {
	
	public static void main(String[] args) {
		
		
		int arr[] = {33,4,6,7,8,9,2,34,5,6};
		
		int high = Integer.MIN_VALUE;
		int sechigh = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
	
			if(arr[i]>high) {
				
				sechigh = high;
				high = arr[i];
					
			} else if(arr[i]>sechigh && arr[i]!=high) {
				sechigh = arr[i];
			}
			
			
		}
		
		System.out.print(sechigh);
			
	}

}
