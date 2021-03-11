public class IndexOf2 {
    public static void main(String[] args){
        String s1="Good morning";

        int index1=s1.indexOf("morni");//2 черточки, если 1 буква, то 1 черточка
        int index2=s1.indexOf("Vertex");
        int index3=s1.indexOf("Good morning",-2);
        int index4=s1.indexOf("Good morning",2);
        int index5=s1.indexOf("Good morning",999);
        System.out.println("Мы ищем 'morni' в строке "+s1+". Индекс "+index1);
        System.out.println("Мы ищем 'Vertex' в строке "+s1+". Индекс "+index2);
        System.out.println("Мы ищем 'Good morning' в строке "+s1+". Начиная с индекса -2. Результат: "+index3);
        /*
        Метод indexOf интерпретирует его как ноль (т.е. "искать с начала строки").
        Поэтому, в консоли получаем индекс ноль - начало подстроки совпадает с началом основной строки.
         */
        System.out.println("Мы ищем 'Good morning' в строке "+s1+". Начиная с индекса 2. Результат: "+index4);
        /*
        Фактически, теперь метод проверяет, встречается ли в строке "od morning" подстрока"Good morning".
        Нет, не встречается. Получаем (-1) в консоли.
         */
        System.out.println("Мы ищем 'Good morning' в строке "+s1+". Начиная с индекса 999. Результат: "+index5);
        /*
        Это как если бы мы искали что-то в пустой строке. Получаем (-1).
         */
    }
}
