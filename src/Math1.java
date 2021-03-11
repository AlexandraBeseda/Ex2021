public class Math1 {
    public static void main (String[] args) {
        /*
         Генерация случайных чисел. Библиотека java.lang класс Math метод random
         */
        double a=(Math.random()*200-100);//[-100;+100)
        int b =3+ (int) (Math.random()*2);//[3;4)
        /*
         Округление чисел. Библиотека java.lang класс Math метод round,floor,ceil
         */
        float c= 2.55f;

        int d=15;

        System.out.println(a);
        System.out.println(b);
        System.out.println(Math.round(c));// тип целочисленное значение
        System.out.println(Math.floor(c));// тип double
        System.out.println(Math.ceil(c));// тип double
        /*
        Вывод минимального и максимального значений. Библиотека java.lang
        класс Math метод max,min
         */
        System.out.println("Меньшее число из двух "+Math.min(c,d));// тип double
        System.out.println("Большее число из двух "+Math.max(c,d));// тип double
    }
}
