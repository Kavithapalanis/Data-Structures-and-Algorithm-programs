/*Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor. */
package leetproblems;
//dividend=  10,divisor= 3
//3+3+3 = gives approximate solution to the dividend with out using mult,mod,div adding the divisor to get dividend --> approach 1 to solve(time complexity exceeds O(devidend))
//to optimize this-->[bit manipulation to simulate division, leveraging left shifts for efficient subtraction of multiples.]

import leetproblems.DivideTwoIntegers;

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; 
        }

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        long quotient = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            long multiple = 1;
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            quotient += multiple;
        }

        int result = (int) (sign * quotient);
        return result;
    }


	public static void main(String[] args) {
		DivideTwoIntegers solution = new DivideTwoIntegers();
        
        // Test cases
        System.out.println("Divide 10 by 2: " + solution.divide(10, 2)); // Output: 5
        System.out.println("Divide 7 by -3: " + solution.divide(7, -3)); // Output: -2
        System.out.println("Divide -10 by 2: " + solution.divide(-10, 2)); // Output: -5
        System.out.println("Divide -10 by -2: " + solution.divide(-10, -2)); // Output: 5
        System.out.println("Divide Integer.MIN_VALUE by -1: " + solution.divide(Integer.MIN_VALUE, -1)); // Output: 2147483647
        System.out.println("Divide Integer.MIN_VALUE by 1: " + solution.divide(Integer.MIN_VALUE, 1)); // Output: -2147483648
    }

}
