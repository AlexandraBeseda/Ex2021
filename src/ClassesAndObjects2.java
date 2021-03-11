public class ClassesAndObjects2 {
    public static void main(String[] args){
        Per person1=new Per();
        person1.setName("Робин");
        person1.setAge(100);

        System.out.println("Осталось до пенсии"+person1.calculateYearsToRetirement());
        System.out.println("Выводим значение в main методе:"+person1.getName());
        System.out.println("Выводим значение в main методе:"+person1.getAge());

        person1.speak();
    }
}
class Per{
    private String name;
    private int age;

    public void setName(String userName){
       if(userName.isEmpty()){//true-строка пустая,false-строка не пустая
            System.out.println("Ты ввел пустое имя");}
            else{
                name=userName;}
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        if(userAge<0){
            System.out.println("Вы ввели некорректное число меньше 0");
        }else{age=userAge;
        }
            }

    public int getAge(){
        return age;
    }

    int calculateYearsToRetirement(){//возвращаемы тип метода
        int years=65-getAge();//ип возвращаемой переменной и тип методы ДОЛЖНЫ совпадать
        return years;//сразу выходит из метода после return
    }

    void speak(){
        for(int i=0;i<3;i++){
            System.out.println("Меня зовут "+getName()+", мне "+getAge()+" лет");}
    }
    void sayHello(){//тип метода невозвращаемый-void
        System.out.println("Привет!");
    }
}

