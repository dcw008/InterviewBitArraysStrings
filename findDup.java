public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    
	    HashSet<Integer> s = new HashSet<Integer>();
	    
	    for(int num : a){
	        if(s.contains(num)){
	            return num;
	        } else{
	            s.add(num);
	        }
	    }
	    
	    return -1;
	}
}
