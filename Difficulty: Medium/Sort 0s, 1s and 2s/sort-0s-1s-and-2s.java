class Solution {
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        a++; b--;
    }
    public void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int s=0, m=0, e=n-1;
        while(m<=e){
            switch(arr[m]){
                case 0:
                    swap(arr,s,m);
                    s++; m++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    swap(arr, m, e);
                    e--;
                    break;
            }
        }
    }
}