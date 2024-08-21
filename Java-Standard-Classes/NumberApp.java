public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String numberStr = "100000";
        Integer number = Integer.valueOf(numberStr);
        System.out.println(number);
    }
}
