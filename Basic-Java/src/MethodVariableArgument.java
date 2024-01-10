public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 50, 50, 60, 50};
        sayCongrats("Bambang", values);

        int[] values2 = {80, 90, 90, 80, 90};
        sayCongrats("Peter", values2);
    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
