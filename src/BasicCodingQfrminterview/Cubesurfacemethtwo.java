// approaching the problem with static method so that we can access the method with out creating the 
// object instance
// using 1. double datatype = gives greater precision compare to int handles decimal values
//       2. flexibility = using double give more flexible ,handles int and floating points also
//       3. standard practice = its standard practie to use double to avoid unintended truncating
//or rounded errorstat can occur with 'int' 
package BasicCodingQfrminterview;

public class Cubesurfacemethtwo {
	public static void cubesurfacearea(double A) {
		double result = 6 *Math.pow(A, 2);// it means a square or(A*A) 
		System.out.println("The surface area of cube is : " +result);
	
	}
	

	public static void main(String[] args) {
		cubesurfacearea(2);// directly calling the method with out creating an object with the static method
		

	}

}
