package lab5_2;

import javax.annotation.processing.SupportedSourceVersion;

public class Polindrom {

    public static void   SearchPolindrom(String a) {
        StringBuilder strBuilder = new StringBuilder(a);
        strBuilder.reverse();
        String invertText = strBuilder.toString();

        if (a.equalsIgnoreCase(invertText)==true)
        {
            System.out.print("Это слово полидром");
        }
        else
            System.out.print("Это слово не полидром");
    }

    public static void main(String[] args) {

        SearchPolindrom("Rotor");
    }

}