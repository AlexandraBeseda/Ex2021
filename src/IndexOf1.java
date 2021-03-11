public class IndexOf1 {
    public static void main(String[] args){
        String s1="Hello";

        int index1=s1.indexOf('H',2);
        int index2=s1.indexOf('o',2);
        int index3=s1.indexOf('W',2);
        System.out.println("Мы ищем букву 'H' в строке "+s1+".Начиная с индекса 2. Индекс: "+index1);
        System.out.println("Мы ищем букву 'o' в строке "+s1+".Начиная с индекса 2. Индекс: "+index2);
        System.out.println("Мы ищем букву 'W' в строке "+s1+".Начиная с индекса 2. Индекс: "+index3);
    }
}
