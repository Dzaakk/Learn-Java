public class TipeDataArray {
    public static void main(String[] args) {

        //declare type 1
        String[] nameList;
        nameList = new String[3];

        nameList[0] = "agent A";
        nameList[1] = "agent B";
        nameList[2] = "agent C";

        System.out.println(nameList[0]);
        System.out.println(nameList[1]);
        System.out.println(nameList[2]);

        nameList[0] = null;
        System.out.println(nameList[0]);

        //declare type 2
        String[] stringArray = new String[3];

        //declare type 3
        int[] arrayInt = new int[]{
                1,2,3,4,5
        };
        //declare type 4
        long[] arrayLong = {
                10L, 29L, 30L
        };
        System.out.println(arrayLong.length);

        String[][] members = {
                {"Agent", "A"},
                {"Agent", "B"},
                {"Agent", "C"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[2][1]);
    }
}
