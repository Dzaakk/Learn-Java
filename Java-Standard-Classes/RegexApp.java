
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String word = "Ibu memasak di dapur menggunakan kompor listrik";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");

        Matcher matcher = pattern.matcher(word);

        while (matcher.find()) {
            String result = matcher.group();
            System.out.println(result);
        }
    }
}
