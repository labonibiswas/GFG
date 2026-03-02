class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length-1;
        Arrays.sort(arr);
        int largest = arr[n], second = -1;
        for(int i=n; i>=0; i--){
            if(arr[i] != largest && arr[i] > second){
                second = arr[i];
            }
        }
        return second;
    }
}