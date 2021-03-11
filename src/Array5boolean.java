public class Array5boolean {
    public static void main(String[] args){
        boolean[] array5=new boolean[1000];
        for(int i=0;i<array5.length;i=i+2){
            array5[i]=true;

        }

        for(int i=0;i<array5.length;i++){
            System.out.println(array5[i]);
        }


    }
}
