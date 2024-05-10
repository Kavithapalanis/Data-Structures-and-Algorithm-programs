package stack;
// this stack class is a custom stack implementation


public class stack {
	
	// here size is 5 also it can be made dynamic or / size can be incresed on the go 
	int stack[] = new int [5];// creating an array with name stack which stores the element of stack
	
	// we need another variable to count the elemens push,pop,peek
	int top=0;
	public void push(int data) {// to push any data in to array first the must exist an arra
	//by telling push we are going to push the data into nums 15
		stack[top] = data;
		top++;
	}
	
	public int pop() {//from top it pops or removed
		int data;
		top--;
		data = stack[top];
		stack[top]=0; // after pop or removing we are making 0 or negative also can be done
		return data;
		
	}
	
	public int peek() { // it finds and show ,will not delete the element
		int data;
		data = stack[top-1];
		return data;
		
	}
	
	public void show() {
		for(int n : stack) {
			System.out.print(n+ " ");
		}
	}
	
	
}
