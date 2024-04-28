package bigOnotation.search;

public class binarySearch {

	public static void main(String[] args) {
		
		int nums[]= {1,2,3,4,5,6,7,8,9};// this is an sorted array
		int target=6;
		int result = BinarySearch(nums,target);
		
		if(result!=0) {
			System.out.println("The target value "+ target +" is present in the Array nums at index "+ result);
		}
		else 
			System.out.println("The target not found");
		
		

	}
	
	public static int BinarySearch(int[] nums, int target) {
		//1,2,3,4,5,6,7,8,9
		
		int left=0;
		int right=nums.length-1;
		
		while(left <= right) {// this checks is firstpoint value is less then lastpoint if yes gets into loop
			int middle = (left + right)/2;
			
			if(nums[middle]==target) {
				return middle;
				
			}
			else if(nums[middle] < target) {//my target value is 7 here condition true middle value is 5
				left = middle + 1;
				
				
				
			}
			
			else
				right = middle - 1;
			 }
		
		return 0;
									
	}

}
