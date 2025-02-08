package strings;

import java.sql.SQLOutput;
import java.util.Arrays;

public class methods_string {
    public static void main(String[] args) {
        String name = "Sanjjith S";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println("   SANJJITH   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
