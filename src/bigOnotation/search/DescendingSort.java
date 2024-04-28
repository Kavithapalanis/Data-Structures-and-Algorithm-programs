package bigOnotation.search;
import java.util.Arrays;
import java.util.Scanner;
// program to find the  Ascending and Descending order of the given array 
public class DescendingSort {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int arr[]= {2,4,1,3,70,60,32,40,8,80,100,90};
		//int temp;
		System.out.println("Before Sorting array in to descending arder");
		for(int arrs:arr) {
			System.out.print(arrs+" ");
		}
		
		System.out.println("\n--------------------");
		Arrays.sort(arr);// ascending is performed by builtin method Arrays.sort(arr);
		System.out.println("After sort for ascending order");
		for(int arrs:arr) {
			System.out.print(arrs+" ");
		}
		// descending also can be performed with builtin method like Arrays.sor(arr,Collection.reverseOrder();
		// but my eclipse is not supporting to perforem builtin descending function
		System.out.println("\n---------------------");
		descendingorder(arr);
		System.out.println("After sort for descending order");
		for(int arrs:arr) {
			System.out.print(arrs+" ");
			
		}
		
		System.out.println("\n------------------------------");
		System.out.println("Enter the element to search");
		int element=in.nextInt();//this takes as elment or a integer number from user
		// Built in method to perform binary search is
		int res = Arrays.binarySearch(arr , element);
		if(res < 0) {
			System.out.println("element not found");
		}
		
		else {
			System.out.println("Element found at index " + res);
		}
		
		
	}
	// this is the logic we are writting to perform descending operation manually
	public static void descendingorder(int arr[]) { // to access any method out side the main methor with 
		//in the class the method should be used with static keyword
		for(int i=0 ; i<arr.length-1 ; i++) {
			for(int j=0; j<arr.length-i-1 ; j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
		}
	}

}
