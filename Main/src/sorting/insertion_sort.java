package sorting;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
                else
                    break;
            }
        }
    }



    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first] = arr[last];
        arr[last]=temp;
    }
}
