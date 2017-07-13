public class Solution {
	public int isPalindrome(String a) {
	    
	    a = a.replaceAll("\\W", "").toLowerCase();
	    
	    
	    int j = a.length() - 1;
	    for(int i = 0; i < a.length()/2; i++){
	        if(a.charAt(i) != a.charAt(j)) return 0;
	        else j--;
	    }
	    
	    
	    return 1;
	}
}

