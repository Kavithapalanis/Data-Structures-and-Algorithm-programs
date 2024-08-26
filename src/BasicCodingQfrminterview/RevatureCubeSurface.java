// find cube surface[6*(a*a)
// testcase:- input = 2
//          output = 24
//method 1:to aproach the problem with creating class and
//Oops concept based on method and return statements 
package BasicCodingQfrminterview;
class Cubesurface{
	public int cubesurfacearea(int a) {
		int surfacearea = 6*(a*a);
		System.out.println("The surface area for the given cube side is : " +surfacearea);
		return surfacearea;
		
	}
	
}


public class RevatureCubeSurface {

	public static void main(String[] args) {
		
		Cubesurface object = new Cubesurface();
		object.cubesurfacearea(2);
		

	}

}
