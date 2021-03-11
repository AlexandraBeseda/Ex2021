public class Constructor {
    public static void main(String[] args){
        Flower flower1= new Flower();
        flower1.name="Ромашка";
        flower1.colour="белая";

        Flower flower2=new Flower("Роза","красная");
        Flower flower3=new Flower("Тюльпан","белый", 10);
        System.out.println(flower1.name+" "+flower1.colour);
        System.out.println(flower2.name+" "+flower2.colour);
        System.out.println(flower3.name+" "+flower3.colour+" "+flower3.age);

    }
}
