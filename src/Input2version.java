import java.util.Scanner;

public class Input2version {
    public static void main(String[] args){
        Scanner myscanner2= new Scanner(System.in);// мы вызвали класс Scanner из библиотеки util
        System.out.println("Введите любые 2 целых числа: ");
        int mynumber1=myscanner2.nextInt();//считывается введенное число в консоль и присваивается mynumber1
        int mynumber2=myscanner2.nextInt();//считывается введенное число в консоль и присваивается mynumber2
        System.out.println(mynumber1+mynumber2);//выводит сумму
        System.out.println(mynumber1*mynumber2);//выводит проихведение
        System.out.println(mynumber1/mynumber2);//выводит частное
        System.out.println(mynumber1-mynumber2);//выводит разницу
    }
}
