vector<int> Solution::wave(vector<int> &A) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    
    sort(A.begin(), A.end());
    vector<int> v;
    
    for(int i = 0; i < A.size(); i += 2){
        
        if((i+1) <= (A.size() - 1)){
           v.push_back(A[i+1]); 
        }
        
        v.push_back(A[i]);
    }
    
    return v;
}

