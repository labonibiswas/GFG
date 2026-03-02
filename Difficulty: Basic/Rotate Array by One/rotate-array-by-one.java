// // User function Template for Java

class Solution {
    public void reverse(int arr[], int l, int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;r--;
        }
    }
    public void rotate(int[] arr) {
        // code here
        int n = arr.length-1;
        reverse(arr, 0, n);
        reverse(arr, 1, n);
    }
}