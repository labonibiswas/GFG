class Solution {
    int first(int[] arr, int n, int target){
        int first = -1;
        int l=0,r=n-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid] == target){
                first = mid;
                r = mid-1;
            }else if(arr[mid] < target) l = mid+1;
            else r = mid-1;
        }
        return first;
    }
    int last(int[] arr, int n, int target){
        int last = -1;
        int l=0,r=n-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid] == target){
                last = mid;
                l = mid+1;
            }else if(arr[mid] < target) l = mid+1;
            else r = mid-1;
        }
        return last;
    }
    int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length;
        int first = first(arr, n, target);
        if(first == -1) return 0;
        int last = last(arr, n, target);
        return (last - first)+1;
    }
}
