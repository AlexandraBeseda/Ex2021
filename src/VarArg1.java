public class VarArg1 {
    public int addAll(int ... numbers)
    {
        int sum=0;
        for(int i=0;i<numbers.length;i++)//работаем как с массивом, обращаемся к length
        {
            sum=sum+numbers[i];
            System.out.println("Adding"+numbers[i]+": get"+sum);
        }
        return sum;
    }
}
