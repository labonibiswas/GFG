class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> factors = new ArrayList<>();
        
        // Loop from 2 up to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
                while (n % i == 0) n /= i; // Remove all occurrences of this factor
            }
        }
        
        // If n is still > 1, the remaining n must be prime
        if (n > 1) factors.add(n);
        
        return factors;
    }
}