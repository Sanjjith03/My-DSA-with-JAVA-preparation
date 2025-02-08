package bitwise;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println((num & 1) == 0 ? "Even" : "Odd");
    }
}
