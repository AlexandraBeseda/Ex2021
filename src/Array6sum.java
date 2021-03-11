
//Посчитать сумму элементов массива//

public class Array6sum {
    public static void main(String[] args){
        int[] array6=new int[3];

        array6[0]=5;
        array6[1]=17;
        array6[2]=350;

        int sum=0;

        for(int i=0;i<array6.length;i++){
            sum=sum+array6[i];
        }
        for(int i=0;i<array6.length;i++){
            System.out.println(array6[i]);
        }
        System.out.println("Сумма -"+sum);
    }
}
