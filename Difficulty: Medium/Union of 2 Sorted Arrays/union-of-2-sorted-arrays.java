class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int n1 = a.length;
        int n2 = b.length;
        int i=0;
        TreeSet<Integer> res = new TreeSet<>();
        while(i < n1 || i<n2){
            if(i<n1){
                res.add(a[i]);
            }
            if(i<n2){
                res.add(b[i]);
            }
            i++;
        }
        return new ArrayList<>(res);
    }
}
