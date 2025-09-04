package strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//      subseq("","abc");
//      System.out.println(subseqRet("","abc"));
//      subseqWithAscii("","abc");
        System.out.println(subseqRetAscii("","abc"));
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+"  ");
            return;
        }

        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p+ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    static void subseqWithAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseqWithAscii(p+ch, up.substring(1));
        subseqWithAscii(p, up.substring(1));
        subseqWithAscii(p+ (ch+0), up.substring(1));

    }
    static ArrayList<String> subseqRetAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqRetAscii(p+ch, up.substring(1));
        ArrayList<String> right = subseqRetAscii(p, up.substring(1));
        ArrayList<String> ascii = subseqRetAscii(p + (ch+0), up.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
