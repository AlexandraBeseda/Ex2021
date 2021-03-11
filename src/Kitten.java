/*
Здесь расположено сразу ряд задач. Варианты для геттеров и сеттеров
 */

public class Kitten {
    private int age;//метод getYear
    private String breed;
    private String colour="рыжий";//т.к. полностью закрыли доступа без сеттера, только геттер
    int weight;//данный параметр откроем, посмотрим разницу
    String character;//данный параметр откроем, посмотрим разницу

    public void setYear(int age){
        if(age<0){
            System.out.println("Вы ввели неверное значение возраста кота.");
        }else{
            this.age=age;//смотрим на слово this, как используем
        }
    }
    public int getYear(){
        return age;}// я обращаюсь к методу, а возвращаю переменную age!

        public void setBreed(String a1){//смотрим на переменную а1, она только для сеттера и существует только внутри него
        if(a1.isEmpty()){//true-строка пустая,false-строка не пустая
            System.out.println("Вы забыли ввести породу кота.");
        }else{
            breed=a1;
        }
        }
    public String getBreed(){
        return breed;}


    public String getColour(){
        return colour; }

        void Mau(){//void метод ничего не возвращает! печать идет при вызове данного метода
        System.out.println("Котик, которому "+age+" лет,мяукает мяу-мяу-мяу. Это печать из метода Mau:"+breed);
        }




}
