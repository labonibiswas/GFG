class Solution {
    public int lcm(int a, int b) {
        // code here
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        for(int i=1; ; i++){
            int mul = max*i;
            if(mul%min == 0){
                return mul;
            }
        }
    
    }
}