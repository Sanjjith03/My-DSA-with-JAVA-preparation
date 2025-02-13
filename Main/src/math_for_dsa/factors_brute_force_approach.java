package math_for_dsa;

public class factors_brute_force_approach {
    public static void main(String[] args) {
        int num=20;
        factors(num);
    }
    static void factors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
