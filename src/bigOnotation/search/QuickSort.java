package bigOnotation.search;

public class QuickSort {
	public static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
			
			quickSort(arr, low, pi-1);//pi-1 bcz we no need to include the partition
			// for dividing an array in to two quicksort we sd call twice
			// dividing will be done by low(starting point) and high(ending point of array)
			quickSort(arr, pi+1 , high);//pi+1 means we need to include the partition
		}
		
	}
	
	private static int partition(int[] arr, int low, int high) {
		// private bcz we are not going to use partition outside the class
		
		int pivot = arr[high];
		int i =low -1;
		
		for (int j=low ; j<high; j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = arr[i+1];
		
		return i+1;
		
		
	}

	public static void main(String[] args) {
		
		int arr[]= {5,6,2,3,1,8,4};
		
		quickSort(arr, 0,arr.length-1);		
		 for (int num:arr) {
			 System.out.println(num +" ");
		 }
		
		
		
		
		
		

	}

}
