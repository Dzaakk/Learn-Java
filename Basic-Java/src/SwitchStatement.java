public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Anda Lulus Dengan Baik");
                break;
            case "B":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "C":
                System.out.println("Nilai Anda Cukup");
                break;
            default:
                System.out.println("Anda tidak lulus");
                break;
        }

        var nilai2 = "B";
        // Switch Lambda
        switch (nilai2) {
            case "A" -> System.out.println("Nilai Anda Sangat Bagus");
            case "B" -> System.out.println("Nilai Anda Bagus");
            case "C", "D" -> System.out.println("Nilai Anda Cukup");
            default -> {
                System.out.println("Anda Tidak Lulus");
            }
        }

        //yield *gunakan yield untuk mengembalikan nilai pada switch statement

        var nilai3 = "D";
        String ucapan;

        ucapan = switch (nilai) {
        case "A":
        yield "Nilai Anda Sangat Bagus";
        case "B":
        yield "Nilai Anda Bagus";
        case "C", "D":
        yield "Nilai Anda Cukup";
        default:
        yield "Anda Tidak Lulus";
    };
        System.out.println(ucapan);
    }
}
