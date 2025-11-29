class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int i=1;
        while(i<arr.length){
            if(arr[i] >= arr[i-1]){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
}