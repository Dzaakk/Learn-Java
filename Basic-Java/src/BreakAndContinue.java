public class BreakAndContinue {
    public static void main(String[] args) {

        var counter = 1;
        while (true) {
            System.out.println("Perulangan " + counter);
            counter++;

            if (counter > 5) {
                break;
            }
        }
        System.out.println("Perulangan Pertama Berhenti");

        for (int counter2 = 1; counter2 <= 10; counter2++) {
            if (counter2 % 2 == 0 ) {
                continue;
            }

            System.out.println("Perulangan Ganjil ");
        }
    }
}
