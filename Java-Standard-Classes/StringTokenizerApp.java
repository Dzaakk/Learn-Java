import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String value = "Ibu|sedang|memasak";
        StringTokenizer tokenizer = new StringTokenizer(value, "|");

        // it will cut the string base on the delimiter but u can control it using loop
        while (tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
