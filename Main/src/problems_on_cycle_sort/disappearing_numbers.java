package problems_on_cycle_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class disappearing_numbers {
   public List<Integer> disappearing(int[]arr){
        int i=0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else
                i++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int index=0;index<arr.length;index++) {
            if (arr[index]!=index+1) {
                ans.add(index+1);
            }
        }

        return ans;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
