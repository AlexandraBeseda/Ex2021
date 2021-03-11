import java.util.Scanner;

public class Input5version {
    public static void main (String[] args){
        System.out.println("Введите любое число с точкой: ");
        Scanner myscanner5=new Scanner(System.in);
        double mynumber=myscanner5.nextDouble();//дробное число в консоль должно быть введно через запятую, а не точку
        System.out.println("Вы ввели дробное число: "+mynumber);
    }
}
