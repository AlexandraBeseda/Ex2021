public class FinalPi {
    public static void main(String [] args){
        final double Pi=3.1415926536;// мы создали константу Pi с плавающей точкой
        double length1=2*Pi*10;//ессли попробывать переприсвоить значение Pi компиляор выдаст ошибку
        double length2=2*Pi*25;
        System.out.println("Периметр круга при радиусе 10 равен "+ length1+".");
        System.out.println("Периметр круга при радиусе 25 равен "+ length2+".");
    }
}
