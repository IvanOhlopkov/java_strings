package practice.regex;

public class SplitText {

    public static void main(String[] args) {

    }

    public static String splitTextIntoWords(String text) {
        //TODO реализуйте метод
        String[] words = text.replaceAll("[.,0-9;`]", "").split(" +");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                result.append(words[i]);
                break;
            }
            result.append(words[i]).append("\n");
        }
        return result.toString();
    }

}