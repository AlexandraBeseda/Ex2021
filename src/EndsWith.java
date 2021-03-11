/*
Метод endsWith() определяет, кончается ли строка заданным значением.
 */
public class EndsWith {
    public static void main(String[] args){
        String line="Good afternoon";
        boolean b1=line.endsWith("evening");
        boolean b2=line.endsWith("afternoon");
        System.out.println("String: "+line+" ends with 'evening?'"+b1);
        System.out.println("String: "+line+" ends with 'afternoon?'"+b2);
    }
}
/*
если мы добавим хотя бы один символ после "morning"
(например, восклицательный знак), тогда уже получим в консоли false
 */
