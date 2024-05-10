package stack;
public class mainstack {

	public static void main(String[] args) {
		stack nums = new stack();
		nums.push(15);
		nums.push(8);
		System.out.println(nums.peek()+" ");
		nums.push(10);
		
		System.out.println(nums.pop()+" ");
		
		nums.show();
		
		
		
		

	}

}
