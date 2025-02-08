package recursion;

public class fibo {
    public static void main(String[] args) {
        System.out.println(fibo_n(4));
    }
    static int fibo_n(int n){
        //base condition
        if(n<2){
            return n;
        }

        return fibo_n(n-1) + fibo_n(n-2);
    }
}
