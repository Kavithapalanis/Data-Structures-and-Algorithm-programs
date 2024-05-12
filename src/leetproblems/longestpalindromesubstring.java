package leetproblems;

public class longestpalindromesubstring {
	public String longestPalindrome(String s) {
	        if (s == null || s.length() == 0) {
	            return "";
	        }
	        
	        int n = s.length();
	        boolean[][] dp = new boolean[n][n];
	        int start = 0;
	        int maxLength = 1;
	        
	        // Initialize dp array for single characters
	        for (int i = 0; i < n; i++) {
	            dp[i][i] = true;
	        }
	        
	        // Check for substrings of length 2
	        for (int i = 0; i < n - 1; i++) {
	            if (s.charAt(i) == s.charAt(i + 1)) {
	                dp[i][i + 1] = true;
	                start = i;
	                maxLength = 2;
	            }
	        }
	        
	        // Check for substrings of length greater than 2
	        for (int len = 3; len <= n; len++) {
	            for (int i = 0; i <= n - len; i++) {
	                int j = i + len - 1;
	                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
	                    dp[i][j] = true;
	                    if (len > maxLength) {
	                        start = i;
	                        maxLength = len;
	                    }
	                }
	            }
	        }
	        
	        return s.substring(start, start + maxLength);
	    }

	


	public static void main(String[] args) {
		longestpalindromesubstring object = new longestpalindromesubstring();
		String s1="babad";
		String s2="bb";
		
		System.out.println("Longest palindromic substring of '" + s1 + "': " + object.longestPalindrome(s1));
        System.out.println("Longest palindromic substring of '" + s2 + "': " + object.longestPalindrome(s2));
		

	}

}
