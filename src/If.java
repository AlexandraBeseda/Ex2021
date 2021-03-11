import java.util.Scanner;

public class If {
    public static void main(String[] args){
        Scanner myscan0= new Scanner(System.in);
        System.out.println("ВВедите любое целое число: ");
        int myInt=myscan0.nextInt();
        if(myInt>10){
            System.out.println("да, myInt больше 10");
        }else if(myInt<10){
            System.out.println("да, myInt меньше 10");
        }else{
            System.out.println("ни одно из предыдущих условий не являетсяя верным");
        }
    }
}
