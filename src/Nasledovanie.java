public class Nasledovanie {
    public static void main(String[] args){
        Dog dog1= new Dog();
        dog1.sleep();
        dog1.eat();

        Doberman doberman1=new Doberman();
        doberman1.eat();
        doberman1.sleep();
        doberman1.bark();
        doberman1.showName();

        Dog dog2=new Doberman();//к объекту класса доберман мы можем обращаться через родительский класс,//
        // но с опредленными ограничениями
        dog2.sleep();//метод для класса дог
        /*
        dog2.hvost();//метод для класса доберман
        */
        dog2.eat();


        Doberman doberman2=new Doberman();
        doberman2.hvost();
        doberman2.sleep();
    }
}
/*
помним про ключевое слово super, если хотим чуть чуть изменить родительский метод
 */