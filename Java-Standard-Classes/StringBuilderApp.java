public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Agent");
        builder.append(" ");
        builder.append("G");

        String name = builder.toString();
        System.out.println(name);

    }
}
