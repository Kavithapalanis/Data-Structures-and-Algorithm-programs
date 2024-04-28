package bigOnotation.search;
// it compares the first value with the nxt array element and finds the least minimum value and if yes it swaps
// first compares the least minimum value here minimum only or also maximum can be performed
// compares it with the first index value and swaps so tat to first index we got the least value 
public class SelectionSort {

	public static void main(String[] args) {
		
		int nums[] = {6,4,1,3,7,2};
		int size=nums.length;
		int temp=0;
		int minindex=-1;
		
		System.out.println("Before Sort");
		for(int num:nums) {
			System.out.print(num+" ");
		}
		
		for(int i=0 ;i<size-1 ;i++ )          //index i= 0
		{
			minindex = i;                     //0
			for(int j=i+1 ; j<size ; j++)     //index j = 1
			{
				if(nums[minindex] > nums[j])  //6>4 yes,6>1 
					minindex = j;             //1
			// minindex changes to j	       
			}
			
			temp=nums[minindex];             //temp=4
			nums[minindex]=nums[i];          //num[minindex]=6
			nums[i]=temp;                    //num[i]=4
			
			System.out.println();
			
			for(int num : nums) {            
				System.out.print(num+" ");   //{4,6,1,...}
			}
			
			
			
		}
		
		System.out.println(); 
		
		System.out.println("After Sorting");
		for(int num : nums) {
			System.out.print(num+" ");
		}
		
		
		
		
		

	}

}
