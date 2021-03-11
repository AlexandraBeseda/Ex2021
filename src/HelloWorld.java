import java.util.Arrays;
import java.util.Scanner;

/**
*Java, my first lesson.
*@author Sasha Beseda
 * @version dated Oct 22, 2020
 *
*/

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Табуляция:"+'\t'+".Новая строка:"+'\n'+"Получилось?");
        System.out.println("HelloWorld");//output


        System.out.printf("%1$+020.10f%n",Math.PI);//выводится с запятой из-за версии java а русском
        //+0-недостающие(до 20-ти) символы будут заполнены нулями, перед числом будет указан знак(+)
        System.out.printf("%-5s%-12s%-25s%-10s%n","Код","За единицу","Валюты","Бел.рубль");
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-5s%-12s%-25s%-10s%n","EUR","1","Евро","3,124442");
        for (int i = 0; i < 16; i++) {
            final String bin=String
                    .format("%4s",Integer.toBinaryString(i))//это строка, потом мы её форматируем в необх.систему
            .replace(' ','0');
            System.out.printf("DEC:%1$03d OCT:%1$03o HEX:%1$03x BIN:%2$2s %n",i,bin);

//            в конце буквы:d,o,x,s-
//            d-перевод в бинарное целочисленное число DEC
//            о- перевод в восьмиричное чисдо OCT
//            x- перевод результатом форматирования будет символ под данным номером в таблице ASCII
//            s- любой тип будет приведен к строке

        }
        String s=null;
        System.out.println(s);

        Scanner scanner =new Scanner(System.in);
//        int[] array=new int[5];
//        for (int k = 0; k < array.length; k++) {
//            array[k]= scanner.nextInt();
//        }
//            for (int j = 0; j < array.length; j++) {
//                System.out.printf("[% -3d]=%-10d", i, array[i]);}
//            System.out.println(Arrays.toString(array));

//новое здесь---посмотриии на меня
    }
}


