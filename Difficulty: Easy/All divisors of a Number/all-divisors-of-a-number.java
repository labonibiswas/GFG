class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> D = new ArrayList<>();
        for(int i = 1; i*i <=n; i++){
            if(n%i == 0){
                D.add(i);
                
                if(i != n/i){
                    D.add(n/i);
                }
            }
        }
        
        Collections.sort(D);
        
        for(int d:D){
                System.out.print(d + " ");
            }
        
    }
}
