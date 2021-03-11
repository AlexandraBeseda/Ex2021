public class Animal {
    public static void main(String[] args){
        Kitten kitty1=new Kitten();
        kitty1.setYear(10);
        kitty1.setBreed("Сибирский");
        kitty1.Mau();

        kitty1.character="подлец";
        kitty1.weight=10;
        System.out.println("Вес кота составляет: "+kitty1.weight+" кг. Его окрас: "+ kitty1.getColour()+".");


        if(kitty1.getYear()>0){
            System.out.println("Котику "+kitty1.getYear()+" лет. Порода: "+kitty1.getBreed()+". Его характер: "+kitty1.character+". Его вес: "+kitty1.weight+" кг.");
        }else{System.out.println("Коту должно быть больше 0 лет.");
        }
    }

}
