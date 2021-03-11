public class ToCharArray1 {
    public static void main(String[] args){
        String sent1="ABC";
        char [] sent2=sent1.toCharArray();

        System.out.println("Char array: ");

        for(int i=0; i<sent2.length ; i++)
            System.out.println("Element[" +i+ "]: "+sent2[i]);
    }
}
