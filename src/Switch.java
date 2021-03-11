import java.util.Scanner;

public class Switch {
    public static void main(String [] args){
        System.out.println("Введите число 1, 2, 3 или 4");
        Scanner myscan01= new Scanner(System.in);
        int number11=myscan01.nextInt();

        switch(number11){
            case 1: System.out.println("Вы ввели 1");break;
            case 2: System.out.println("Вы ввели 2");break;
            case 3: System.out.println("Вы ввели 3");break;
            case 4: System.out.println("Вы ввели 4");break;
            default: System.out.println("Вы ввели неправильное число");
        }
    }
}
