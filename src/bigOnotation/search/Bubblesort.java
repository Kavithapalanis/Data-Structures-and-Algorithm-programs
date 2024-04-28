package bigOnotation.search;

public class Bubblesort {

	public static void main(String[] args) {
		int nums[]= {10,6,2,12,3};
		int size=nums.length;
		int temp=0;
		
		System.out.println("Before Sort");
		for(int num : nums) {
			System.out.print(num+" ");
		}
		
		for(int i=0; i<size; i++) {        // 0           1
			for (int j=0; j<size-i-1;j++) {// j=10,j+1=6
				if(nums[j] > nums[j+1]) { //  yes 10>6
				//swap	
				temp = nums[j];           //  10
				nums[j] = nums[j+1];      //  6
				nums[j+1] = temp;         //  10
			    }
				
			}
			System.out.println();
			for(int num:nums) {
				System.out.print(num+" ");
			}
		}
		
		System.out.println();
		System.out.println("After Sort");
		for (int num:nums) {
			System.out.print(num+" ");
		}
		

	}

}
