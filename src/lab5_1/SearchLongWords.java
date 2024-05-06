package lab5_1;

public class SearchLongWords {


    static String searchWord(String a) {
        String[] words = a.split(" ");
        String slovo = "";
        for (String word : words) {
            if (word.length() > slovo.length())
                slovo = word;

        }
        return (slovo);
    }


    public static void main(String[] args) {

        String text = "people was born in 0 A.D";
        String maxword = searchWord(text);
        System.out.println(maxword);
        System.out.println(maxword.length());
    }
}