package linkedlist;



public class Runner {

	public static void main(String[] args) {
		
		
		/* LinkedList list = new LinkedList();// provided by java also imported
		
		list.add(5);
		list.add(3,12); */ // this the built in class given is an internal implementation
		
		//--------------------------------------------
		// to perform linkedlist by own
		LinkedList list = new LinkedList();// this LinkedList is from LimkedList class name which we created
		                                   // we are creating an object to the LinkedList class
		list.insert(5);// insert method is available or beed created in LinkedList java class by creating object we are calling the method
		list.insert(18);
		list.insert(45);
		list.insert(12);
		
		list.insertAtStart(25);
		
		//list.insertAtanyLocation(0,55);
		list.insertAtanyLocation(2,55);
		
		list.delete(1);
		
		list.show();//see what all there in linkedlist
		
		
		
		
		

	}

}
