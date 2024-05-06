package lab5_4;

public class PodStroka {

    static public void countOccurrences(String str, String sub) {
        int count = 0;
        for (int idx = 0; (idx = str.indexOf(sub, idx)) != -1; idx += sub.length()) {
            count++;
        }
        System.out.printf("Колличество вхождений строки %s", count);
    }

    public static void main(String[] args) {
        countOccurrences("New York of the Capital of great world","world");


    }
}