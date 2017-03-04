package ja_11_syntax.lesson_02;

/**
 * Created by Aleksey on 22.02.2017.
 */
public class IntegerHexBinDec {
    public static void main(String[] args) {
        int i10 = 12;//decimile
        int i16 = 0xA; // 0,1,....9,A,B,C,D,E,F, hexadecimal
        System.out.println(i16);
        System.out.println(Integer.toHexString(i16));

        int i8 = 012; // octall 0, .....,7
        System.out.println(i8);

        int i2 = 0b111; //binary
        System.out.println(i2);


    }
}
