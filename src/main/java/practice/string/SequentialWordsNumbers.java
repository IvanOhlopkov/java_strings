package practice.string;

public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text) {
        int start = 0;
        int wordNumber = 1;
        StringBuilder result = new StringBuilder();
        while (start < text.length()) {
            int end = text.indexOf(' ', start);
            if (end < 0) {
                end = text.length();
            }
            String test = text.substring(start, end);
            result.append(" (").append(wordNumber).append(") ").append(test);
            start = end + 1;
            wordNumber++;
        }

        return result.toString().strip();
    }
}
