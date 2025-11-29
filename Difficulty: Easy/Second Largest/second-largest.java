class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = arr[0], slargest = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }else if(arr[i] != largest && arr[i] > slargest){
                slargest = arr[i];
                }
            
        }
        
        /*for(int i=0; i< arr.length; i++){
            if(arr[i] != largest && arr[i] > second){
                second = arr[i];
            }
        }*/
        return slargest;
    }
}