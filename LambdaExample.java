interface Name
{
    String GiveName(String str);
}
public class LambdaExample
{
    public static void main(String[] args)
    {
           Name n1=(str) -> {return str;};
        System.out.println(n1.GiveName("Abhishek"));
    }

}
