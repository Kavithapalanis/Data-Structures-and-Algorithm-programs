package linkedlist;
// this class LinkedList manually we created the class 

public class LinkedList {
	          // by default we consider first node as Head Node
	Node head;// first node starts is headnode so we the instance variable Node we are initializing 
	          //with head
	
	public void insert(int data){
		// this data i need to assign to a node
		Node node = new Node();// creating object of node
		node.data=data;// 1st object Node
		node.next=null;// by default if there is no data it is null
		
		if (head == null) {// here head is null
			head = node;
		}
		else {// if some data present in list
			Node n = head;// 1st n will refer the to the head node 
			// and then checks if head is not null 
			while (n.next != null) {// traverse the loop untill it findsnull at last if there is a list
				n=n.next;// jumps to the next node
			}// this loop will stop when it finds null 
			n.next = node;// to insert an data at end of list  when null is found while loop gets braek amd 
			
		}
		
		
	}
	// to insert a value at start of a list
	public void insertAtStart(int data) {
		
		Node node = new Node();
		node.data = data;// takes data which we give to insert 
		// at start
		node.next = null;// initially assigned noe.next is null
		
		node.next = head;// head contains the actual linkedlist head value and a reference pointer actual reference  
		head =node;      // now node contains the value which we need to insert at start 
		
	}
	
	public void insertAtanyLocation(int index,int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		// for zero index inbetweet the data can not be added as this method adds data in any location
		// so for 0 index we are calling the insertAtStart method by passing data and executing it 
		if(index == 0) {
			insertAtStart(data);
		}
		
		else {
		Node n = head;
		for(int i=0; i<index-1 ; i++) {
			n = n.next;
			}
		node.next = n.next;
		n.next = node; //node value is 55 tat address is added to n.next
		}
	}
	
	//to delete the node or value in a linked list
	public void delete(int index) {
		if (index == 0){
			head = head.next;
			
		}
		else
		{
			Node n = head;
			Node n1=null;
				n=n.next;
			
			n1 = n.next;
			n.next = n1.next;
			//System.out.println("n1 : "+ n1.data);// while printing the deleted 
			// object is still there 
			//n1=null;// so to delete n1 permanantly we assign null to n1
			
			
		}
		
		
	}
	
	
	
	public void show() {
		Node node=head;
		
		while(node.next != null) {
			System.out.println(node.data);
			// to print everytime we need to shift the node
			node = node.next;
			 
			
		}
		System.out.println(node.data);
	}
	

}
