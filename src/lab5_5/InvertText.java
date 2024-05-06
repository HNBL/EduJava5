package lab5_5;

public class InvertText {

    static void textInvert(String a) {


        String[] words = new StringBuilder(a).reverse().toString().split(" ");
        StringBuilder newStr = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) newStr.append(words[i]).append(" ");
        System.out.println(newStr);
    }


    public static void main(String[] args) {
        textInvert("Sample Output The\n given string is: This is a test \nstring " +
                "The string reversed word by word \nis:" +
                " shiT si tset gnirts");


    }
}