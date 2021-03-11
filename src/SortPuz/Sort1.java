package SortPuz;


import java.util.Arrays;

public class Sort1 {
    public static void main(String[] args){

        int[] mas={44,55,11,1,2,3,10,0};
        boolean isSorted=false;
        int buf;

        while(!isSorted){//выполнять пока isSorted не станет не истина
            isSorted=true;
            for(int i=0;i <mas.length-1;i++){
                if(mas[i]>mas[i+1]){

                    isSorted=false;//0

                    buf=mas[i];
                    mas[i]=mas[i+1];
                    mas[i+1]=buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));

    }
}
