package math_for_dsa;

import java.util.ArrayList;

public class factors_optimized {
    public static void main(String[] args) {
        int num=36;
        factors2(num);
    }
    static void factors1(int num){
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0) {
                if (num / i == i) {
                    System.out.print(i+" ");
                } else {
                    System.out.print(i + " " + num / i + " ");
                }
            }
        }
    }
    static void factors2(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0) {
                if (num / i == i) {
                    System.out.print(i+" ");
                } else {
                    System.out.print(i+" ");
                    list.add(num/i);
                }
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}