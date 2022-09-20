import java.lang.reflect.Type;
import java.util.Scanner;

class Mobile1
{
    public void brand(int a)
    {
        System.out.println("Samsung");
    }
    public void brand(String a)
    {
        System.out.println("Apple");
    }
    public void brand(Double a)
    {
        System.out.println("MI");
    }
}
public class PolymorpismExample
{
    public static void main(String[] args)
    {
        Mobile1 mob=new Mobile1();
        mob.brand(1);
        mob.brand(1.1);
        mob.brand("One");
    }
}
