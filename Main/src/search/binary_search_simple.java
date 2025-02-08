package search;

public class binary_search_simple {
    public static void main(String[] args) {
        int[] arr={1,3,4,11,12,23,45,54,65,78,123};
        int sol = binary_search(arr,98);
        System.out.println(sol);
    }
    static int binary_search(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
