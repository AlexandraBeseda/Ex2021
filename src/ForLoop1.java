import java.util.Scanner;

public class ForLoop1 {
    public static void main(String [] args){
        System.out.println("Введите любое положительное целое число:  ");
        Scanner myscaner12= new Scanner(System.in);
        int n=myscaner12.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.print(sum);
    }
}
