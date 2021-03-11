/*
Метод indexOf() ищет в строке заданный символ или строку,
и их возвращает индекс (т.е. порядковый номер).
Метод:
возвращает индекс, под которым символ или строка первый раз появляется в строке;
возвращает (-1) если символ или строка не найдены
 */

public class IndexOf {
    public static void main(String[] args){
        String s1="Hello";

        int index1=s1.indexOf('H');
        int index2=s1.indexOf('o');
        int index3=s1.indexOf('W');
        System.out.println("Мы ищем букву 'H' в строке "+s1+".Индекс данной буквы "+index1);
        System.out.println("Мы ищем букву 'o' в строке "+s1+".Индекс данной буквы "+index2);
        System.out.println("Мы ищем букву 'W' в строке "+s1+".Индекс данной буквы "+index3);

    }
}
