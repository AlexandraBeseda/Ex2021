import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<String> deliveryCities= new ArrayList<>();
        deliveryCities.add("Chicago");
        deliveryCities.add("New York");
        deliveryCities.add("Toronto");
        deliveryCities.add("Paris");

        deliveryCities.add(1,"Paris");

        deliveryCities.set(2,"Berlin");

        deliveryCities.remove("Paris");
        deliveryCities.remove(2);
/*
        deliveryCities.clear();
        метод clear. - используется для удаления всех элементов из списка
*/
        System.out.println(deliveryCities.size());
        System.out.println(deliveryCities.get(0));
        System.out.println(deliveryCities.indexOf("Amsterdam"));
        System.out.println(deliveryCities.indexOf("Toronto"));
        System.out.println(deliveryCities.contains("Toronto"));
        System.out.println(deliveryCities.get(2));
    }
}
