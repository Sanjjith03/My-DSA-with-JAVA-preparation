public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,8};
        int[] arr1 = {1,2,4,5,7,9,8,10,11};
        int index = 0;
        System.out.println(sorted(arr1,index));

    }
    static boolean sorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
