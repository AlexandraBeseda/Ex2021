package SortPuz;

public class Test2 {
    public static void main(String[] args) {
        Counter c = new Counter();
        for(int i=1;i<4;i++){
            c.add(i);
        }
        System.out.println(c.count);
    }

    public static class Counter {
        public int count=4;
        private int temp = 1;
        public void add(int val){
            temp += val;
            /*
            1+1=2 - 1 итерация
            2+2=4 - 2 терация
            4+3=7- 3 итерация
             */
            count += temp;
            /*
            4+2=6
            6+4=10
            10+7=17
             */
        }


    }
}
