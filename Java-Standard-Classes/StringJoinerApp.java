import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Agent A");
        joiner.add("Agent B");
        joiner.add("Agent C");

        String value = joiner.toString();
        System.out.println(value);
    }
}
