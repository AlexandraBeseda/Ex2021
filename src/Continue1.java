public class Continue1 {
    public static void main (String[] args){
        for(int i=1;i<=7;i++){
            System.out.println(i+" Даннаяя фраза будет выведена 7 раз благодаря циклу");
                    if(i>3)
                        continue;
                    /*
                    каждый раз когда i>3 (4,5,6,7) вторая строка не будет выведена в консоль.
                     Это будет происходить потому, что continue будет перенаправлять нас в начало цикла
                     */
                                System.out.println("   "+i+"   "+"Я выведусь 3 раза благодаря операции continue");
        }

    }
}
