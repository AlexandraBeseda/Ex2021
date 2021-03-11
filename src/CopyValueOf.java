/*
Пример метода CopyValueOf без параметров
 */

public class CopyValueOf {
    public static void main(String[] args){
        char[] char1={'S','A','S','H','A',' ','B','E','S','E','D','A'};
        String sent1="String";//в любом случае необходимо инициализировать переменную
        System.out.println("String sent1 before copyValueOf "+sent1);

        sent1=sent1.copyValueOf(char1);
        System.out.println("String sent1 after copyValueOf: "+sent1);
    }
}
