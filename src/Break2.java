public class Break2 {
    public static void main (String[] args){
        for(int i=1;i<=3;i++){
            System.out.println("Это первый цикл. Я выполняюсь "+i+"раз");
            for(int a=1;a<=10;a++){
                System.out.println("Это второй цикл. Я выполнюсь "+a+"раз");
                if(a==4)
                    break;
            }
        }
    }
}
