package bigOnotation.search;


public class linearsearchdemo {

	public static void main(String[] args) {
		//int nums[]= {5,6,7,8,9,10};// small values of Array
		int nums[] = new int[1000];// 1000 values but the value inside it will be 0
		int target=888;
		
		int result1=linearSearch(nums,target);
		int result2= binarySearch(nums,target);
		if(result1 != 0) {
			System.out.println(" Linear search : The target "+ target +" is found in the Array nums at index :"+result1);
		}
		else
			System.out.println("The target is not found in Array nums");
		
		if(result2 != 0) {
			System.out.println("Binary search : The target "+ target +" is found in the Array nums at index :"+result2);
			}
		else
			System.out.println ("The target is not found in Array nums");
		}
	
	public static int linearSearch(int[] nums, int target) {// here the method should be declared with static
		//bcz outside the main and and with in the class when we want to access we should put static so that main method can access
		int steps=0;
		for(int i=0;i<nums.length;i++) {
			steps++;
			if (nums[i]==target) {
				System.out.println("Steps taken by linear search "+steps);
				return i;
			}
		}
		
		return 0;
	}
	
	public static int binarySearch(int[] nums,int target) {
		//1,2,3,4,5,6,7,8,9
		int steps =0;
		int left=0;
		int right=nums.length-1;
		
		while(left<=right) {// this checks is firstpoint value is less then lastpoint if yes gets into loop
			steps++;
			int middle = (left + right)/2;
			
			if(nums[middle] == target) {
				System.out.println("Steps taken by binary search is "+steps);
				return middle;
				
			}
			else if(nums[middle] < target) {//my target value is 7 here condition true middle value is 5
				left = middle + 1;
	        }
			
			else
				right = middle - 1;
			 }
		System.out.println("Steps taken by binary search is "+steps);
		
		return 0;
	
}
}



