public class Doberman extends Dog {
    //расширяет- доберман наследуется от класса дог, дог явл.родителем класса доберман
    public void bark(){
        System.out.println("Я лаю руф-руф-руф.");
    }

    public void showName(){
        System.out.println(name);
    }

    public void hvost(){
        System.out.println("Доберман виляет хвостом.");
    }

    //позднее связывание:
    @Override
    public void eat(){
        System.out.println("Я доберман, поэтому ем особенным способом.");
    }
}
