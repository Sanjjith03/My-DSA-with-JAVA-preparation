package search;

public class linear_search_simple {
    public static void main(String[] args) {
        int nums[]={2,4,1,8,9};
        int target = 11;
       int ans = linear_search(nums,target);
        System.out.println(ans);
    }
    static int linear_search(int[] arr, int target){
        int index,element;
        if(arr.length==0){
            return -1;
        }
        for(index=0;index<arr.length;index++){
            element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
