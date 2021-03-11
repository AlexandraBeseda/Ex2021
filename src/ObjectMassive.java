public class ObjectMassive {
    static Cat[] obj1=new Cat[3];//почему массив объектов мы создаем в классе,а не методе?

    public static void main(String[] args){
        obj1[0]=new Cat("Baby");
        obj1[1]=new Cat("Sweet");
        obj1[2]=new Cat("Kiko");

        for(int i=0;i<3;i++){
            System.out.println(obj1[i].name);
        }
    }
}
class Cat{
    String name;
    public Cat(String name){
        this.name=name;
    }
}
