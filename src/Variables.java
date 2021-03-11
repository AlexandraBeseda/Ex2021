public class Variables {
    public static void main (String[] args){
    int myInt = 557;//целочисленное значение от -2147483648 до 2147483647, 4 байта
    short myShort = 3266;// целочисленное значение от -32768 до 32767, 2 байта
    long myLong = 26246246;// целочисленное значение от -9223372036854775808 до ..07, 8 байт

    double myDouble = 235.35;// с плавающей точкой от -1.7Е+308 до 1.7Е+308, 8 байт
    float myFloat = 2362.4f;// с плавающей точкой от -3.4Е+38 до 3.3Е+38, 4 байт

    char c = 'a';// символы от 0 до 65536, 2 байта
    boolean b = true;// логический true или false , достаточно 1 байта

    byte myByte = 100;// целочисленное значение от -128 до 127, 1 байт

    System.out.println(myInt);
    System.out.println(myShort);
    System.out.println(myLong);
    System.out.println(myDouble);
    System.out.println(myFloat);
    System.out.println(c);
    System.out.println(b);
    System.out.println(myByte);
}
}
