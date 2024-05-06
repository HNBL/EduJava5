package lab5_3;

public class Сensor {

    static void chageCensor(String text) {

        System.out.println(text);

        String repText = text.replace("бяка", "[вырезано цензурой]");

        System.out.println(repText);

    }


    public static void main(String[] args) {

        chageCensor("Меня зовут бяка, и фамилия моя бякава");

    }
}