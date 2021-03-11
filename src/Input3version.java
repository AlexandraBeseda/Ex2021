import java.util.Scanner;

public class Input3version {
    public static void main(String []args){
        Scanner myscaner3= new Scanner(System.in);
        System.out.println("Введите 2 любых слова или фразы: ");
        String myphrase1=myscaner3.nextLine();
        String myphrase2=myscaner3.nextLine();
        System.out.println(myphrase1+" "+myphrase2);
    }

}
