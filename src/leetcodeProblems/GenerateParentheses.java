/*Given n pairs of parentheses, generate all combinations of well-formed parentheses.

Testcase 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

 2:
Input: n = 1
Output: ["()"]

Constraints:

    1 <= n <= 8 */ //input n is give as a integer varies b/w n= 1 t0 8 

// using backtracking method = uses bruteforce and recursion function
package leetcodeProblems;
import java.util.List;
import java.util.ArrayList;
class Genparentheses{
	public static List<String> GeneratePar(int n){// creating a method with static and List of Sting dtattype
		List<String> result = new ArrayList<>();
		//Use List<Integer> numbers = new ArrayList<>();: This is typically the preferred and more efficient practice in terms of code flexibility and maintainability.
		//It allows you to change the list implementation easily without affecting the rest of your code.
		//Use ArrayList<Integer> numbers = new ArrayList<>();:
		//This can be used when you are certain about using ArrayList and don't need the flexibility of switching to another list implementation.
		backtrack(result, "",0,0,n);
		
		return result;
		
	}
	
	private static void backtrack(List<String> result, String current, int open, int close, int max) {
		// if current string is valid combination add it to the result
		if(current.length() == max*2 ) {
			result.add(current);
			return;
		}
		
		// if we can add still an open parentheses
		if(open <max) {
			backtrack(result, current +"(",open+1, close, max);
		}
		// if we can still add a close parentheses
		if(close < open) {
			backtrack(result ,current +")", open, close+1,max);
		}
	}
	
	
}

public class GenerateParentheses {
	public static void main (String[] args) {
		int n = 3;
		List<String> combination = Genparentheses.GeneratePar(n);
		// Print all combinations
        for (String comb : combination) {
            System.out.println(comb);
        }
		
		
	}

		

}
