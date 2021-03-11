public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1=new Person();

        person1.setNameAndAge("Варвара",30);

        person1.speak();
        int year1=person1.calculateYearsToRetirement();

        Person person2=new Person();
        String s1="Кастусь";

        person2.setNameAndAge(s1,40);
        person2.speak();
        int year2=person2.calculateYearsToRetirement();

/*
        int year3=person1.speak();//данный метод void ничего не возвращает и показывает ошибку!
*/
    }
}
class Person{
    String name;
    int age;

    void setNameAndAge(String username, int userage){
        name=username;
        age=userage;
    }

    int calculateYearsToRetirement(){//возвращаемы тип метода
        int years=65-age;//ип возвращаемой переменной и тип методы ДОЛЖНЫ совпадать
        return years;//сразу выходит из метода после return
    }

    void speak(){
        for(int i=0;i<3;i++){
        System.out.println("Меня зовут "+name+", мне "+age+" лет");}
    }
    void sayHello(){//тип метода невозвращаемый-void
        System.out.println("Привет!");
    }
}
