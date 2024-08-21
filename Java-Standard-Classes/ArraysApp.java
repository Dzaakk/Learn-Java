import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1, 4, 6, 7, 8, 4, 5, 783, 2, 256, 3, 16
        };

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 8));
        System.out.println(Arrays.binarySearch(numbers, 256));
        System.out.println(Arrays.binarySearch(numbers, 112));

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5, 9);
        System.out.println(Arrays.toString(result2));
    }
}
