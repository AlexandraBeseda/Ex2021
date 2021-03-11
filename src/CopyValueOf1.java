/*
Пример метода CopyValueOf с параматерами
 */
public class CopyValueOf1 {
    public static void main(String [] args){
        char[] char1={'S','A','S','H','A',' ','B','E','S','E','D','A'};
        String sent1="String";//в любом случае необходимо инициализировать переменную
        String sent2=sent1.copyValueOf(char1);
        String sent3=sent1.copyValueOf(char1,2,7);
        /*
        Мы задали смещение 2 и длину строки 7.
        В итоге, мы получили строку, которая начинается не с первого,
        а с третьего символа, и имеет длину 7
         */

        System.out.println("String without offset:          "+sent2);
        System.out.println("String with offset 2 and length 7:     "+sent3);
    }
}
