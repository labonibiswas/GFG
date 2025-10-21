// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp = 0, sum = 0;
        int num = n;
        while(num != 0){
            temp = num%10;
            sum += temp*temp*temp; 
            num = num/10;
        }
        
        return sum == n;
    }
}