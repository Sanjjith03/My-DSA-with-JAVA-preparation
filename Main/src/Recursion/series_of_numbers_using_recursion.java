public class series_of_numbers_using_recursion {

    static void n_to_one(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        n_to_one(n-1);
    }

    static void one_to_n(int n){
        if(n==0){
            return;
        }
        one_to_n(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        one_to_n(5);
    }
}
