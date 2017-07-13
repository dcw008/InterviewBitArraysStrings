public class Solution {
	public int lengthOfLastWord(final String a) {
	    
	    StringBuffer buffer = new StringBuffer();
	    boolean isWord = false;
	    
	    for(int i = a.length()-1; i >= 0; i--){
	        if(isWord == false){
	            if(a.charAt(i) == ' ') continue;
	            else{
	                isWord = true;
	                buffer.append(a.charAt(i));
	            }
	        }
	        else{
	            if(a.charAt(i) != ' '){
	                buffer.append(a.charAt(i));
	            } else{
	                break;
	            }
	            
	        }
	    }
	    
	    return buffer.length();
	}
}

