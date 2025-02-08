package recursion;

public class bs {
    public static void main(String[] args) {
        int[] arr={11,23,32,45,56,77};
        int target=77;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    static int search(int[] arr,int target,int start,int end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr,target,start,end=mid-1);
        }
        return search(arr,target,start=mid+1,end);
    }
}
