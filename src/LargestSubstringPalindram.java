
public class LargestSubstringPalindram {
	
	public static void main(String[] args) {
		
		String value = "122243323341";
		
		String substring = longestPalindrome(value);
		//System.out.println(substring);
		
		Long l = Long.parseLong(substring);
		boolean isPrime = isPrime(l);
		if(isPrime){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		/*for(int i = 0; i<=100; i++){
			boolean isPrime2 = isPrime(i);
			if(isPrime2){
				System.out.println(i+"YES");
			}else{
				//System.out.println(i+"NO");
			}
		}*/
		
	}

	public static String longestPalindrome(String s) {
		if (s.isEmpty()) {
			return null;
		}
	 
		if (s.length() == 1) {
			return s;
		}
	 
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			// get longest palindrome with center of i
			String tmp = helper(s, i, i);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
	 
			// get longest palindrome with center of i, i+1
			tmp = helper(s, i, i + 1);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}
	 
		return longest;
	}
	 
	// Given a center, either one letter or two letter, 
	// Find longest palindrome
	public static String helper(String s, int begin, int end) {
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}
	
	public static boolean isPrime(long number){
		if(number<2) return false;
		
		for(long i=2; i<=number/2; i++){
			long rem = number%i;
			if(rem == 0) return false;
		}
		return true;
	}
}
