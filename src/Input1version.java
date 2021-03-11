import java.util.Scanner;// импорт бибилиотеки Scanner

public class Input1version {
    public static void main(String[] args){
        System.out.print("Введите любое целое число в диапазоне integrate:");
        Scanner myscan1=new Scanner(System.in);// мы вызвали класс Scanner из библиотеки util
        int mynumber=myscan1.nextInt();//применили метод nextInt в классе Scanner
        System.out.println("Вы ввели целое число "+mynumber);
    }
}
