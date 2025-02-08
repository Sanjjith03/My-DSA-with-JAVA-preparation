package strings;

public class performance {
    public static void main(String[] args) {
        //This is not optimized approach it takes o(n^2) complexity, because ecery time it creates as new object
        String series="";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            series = series + ch;
        }
        System.out.println(series);

    }
}
