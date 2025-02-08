package search;

import java.util.Scanner;
public class SearchInStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        System.out.print("Enter the Charcter to search : ");
        char target = input.next().charAt(0);
        System.out.println(string_search(str,target));
    }

    static boolean string_search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
