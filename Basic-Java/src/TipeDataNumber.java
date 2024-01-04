public class TipeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long inLong = 1000000000;
        long inLong2 = 10000000L;

        float iniFloat = 10.10F;
        double iniDouble = 10.10;

        //Literals
        int decimalInt = 25;
        int hexaDecimal= 0xA123B;
        int binaryDecimal = 0b10101010;

        //Underscore
        long balance = 1_000_000_000;

        //Conversion
        /*
            Widening Casting (Otomatis)
            byte -> short -> int -> long -> float -> double

            Narrowing Casting (Manual)
            double -> float -> long -> int -> short -> byte
         */

        //Widening Casting
        byte newByte = 10;
        short newShort = newByte;
        int newInt = newShort;
        long newLong = newInt;
        float newFloat = newLong;
        double newDouble = newFloat;

        //Narrowing Casting
       float Float2 = (float) newDouble;
       long Long2 = (long) Float2;
       int Int2 = (int) Long2;
       short Short2 = (short) Int2;
       byte Byte2 = (byte) Short2;
    }
}
