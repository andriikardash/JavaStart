public class Main {
    public static void main(String[] args) {

        //create items

        int int_10 = 1;
        int int_2 = 0b1;
        int int_8 = 01;
        int int_16 = 0x1;

        byte byte_10 = 1;
        byte byte_2 = 0b1;
        byte byte_8 = 01;
        byte byte_16 = 0x1;

        double double_10 = 1.1;
        double double_16 = 0x12P2;
        double double_2 = 0b1;
        double double_8 = 01;

        long long_2 = 0b1L;
        long long_8 = 01L;
        long long_10 = 1L;
        long long_16 = 0x1L;

        short short_10 = 1;
        short short_2 = 0b1;
        short short_8 = 01;
        short short_16 = 0x1;

        float float_10 = 1.1f;
        float float_16 = 0x12P2f;
        float float_2 = 0b1;
        float float_8 = 01f;

        char char_10 = 'A';
        char char_2 = 0b1010;//not sure if we can do char like this
        char char_16 = 0xA;
        char char_8 = 01;


        //sum all values and make it int data type

        int sumInt = int_2 + int_8 + int_10 + int_16;
        int sumByte = byte_2 + byte_8 + byte_10 + byte_16;
        int sumDouble = (int)double_10 + (int)double_16 + (int)double_2 + (int)double_8;
        int sumLong = (int)long_2 + (int)long_8 + (int)long_10 + (int)long_16;
        int sumShort = short_2 + short_8 + short_10 + short_16;
        int sumFloat = (int)float_2 + (int)float_8 + (int)float_10 + (int)float_16;
        int sumChar = char_10 + char_2 + char_16 + char_8;

        //sum all values and print it

        long result = sumInt + sumByte + sumDouble + sumLong + sumShort + sumFloat + sumChar;
        System.out.println(result);
    }
}
