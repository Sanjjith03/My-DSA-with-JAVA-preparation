import java.util.ArrayList;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,7,8};
        int target = 3;
//        System.out.println(search(arr,target,0));
//        ArrayList<Integer> res = findAllIndex(arr, target, 0, new ArrayList<>());
//        System.out.println(res);
          System.out.println(find(arr, target, 0));
    }
    static int search(int[] arr, int target, int index){
        if(arr[index]==target) {
            return index;
        }

        if(index==arr.length-1){
            return -1;
        }
        return search(arr, target, index+1);
    }
    //Return arraylist, multiple occurrences
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            if(list.isEmpty()){
                list.add(-1);
            }
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list );
    }
    //Using arraylist without passing it as a parameter
    static ArrayList<Integer> find(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> res = find(arr, target, index+1);
        list.addAll(res);
        return list;

    }

}
