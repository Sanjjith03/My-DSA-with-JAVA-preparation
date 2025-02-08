package strings;
import java.util.*;
public class test {
    public static void main(String[] args) {
        String s = "The hello worl    ";
        s = s.trim();
        int count = 0;
        int i= s.length()-1;
        while(s.charAt(i)!=' '){
            count++;
            i--;
        }
        System.out.println(count);
    }
}
