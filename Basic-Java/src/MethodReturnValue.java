public class MethodReturnValue {
    public static void main(String[] args) {

        var result = sum(100, 400);
        System.out.println(result);

        System.out.println(sum(300, 500));
        System.out.println(hitung(20, "+", 90));
        System.out.println(hitung(20, "-", 9));
    }

    static int sum(int val1, int val2){
        var total = val1 + val2;
        return total;
    }

    static int hitung(int val1, String operasi, int val2){
        switch (operasi){
            case "+" :
                return val1 + val2;
            case "-" :
                return val1 - val2;
            default:
                return 0;
        }
    }
}
