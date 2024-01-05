public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

    Integer iniInteger = 100;
    Long iniLong = 10000L;
    Byte iniByte = null;

    System.out.println(iniByte);

    iniByte = 100;
    System.out.println(iniByte);

    //konversi dari primitif ke non primitif
    int newInt = 20;
    Integer newInt2 = newInt;

    short newShort = newInt2.shortValue();
    long newLong = newInt2.longValue();
    float newFloat = newInt2.floatValue();
    }
}
