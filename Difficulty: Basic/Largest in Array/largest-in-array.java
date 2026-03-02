class Solution {
    public static int largest(int[] arr) {
        int n=arr.length-1;
        // code here
        Arrays.sort(arr);
        return arr[n];
    }
}
