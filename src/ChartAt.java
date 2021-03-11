public class ChartAt {
    public static void main(String[] args) {
        String sentence ="Бася ест только кальмары и красную рыбу";
    char lit1=sentence.charAt(0);
    char lit2=sentence.charAt(4);
    char lit3=sentence.charAt(9);
    System.out.println("Буква 0 индекса соотвествует:"+lit1);
    System.out.println("Буква 4 индекса соотвествует:"+lit2);
        /*
    Обращаю внимание, что отсчет начинается с нулевой позиции
    Пробел является символом тоже
     */
    System.out.println("Буква 9 индекса соотвествует:"+lit3);
    }
}
