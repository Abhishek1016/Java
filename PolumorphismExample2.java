class MobileAnd
{
    public void operatingsystem(int a)
    {
        System.out.println("This is Android");
    }
}
class MobileIOS extends MobileAnd
{
    public void operatingsystem(int a)
    {
        System.out.println("This is IOS");
    }
}


public class PolumorphismExample2
{
    public static void main(String[] args)
    {
        MobileAnd mob=new MobileIOS();
        mob.operatingsystem(1);//upcasting
        MobileAnd mob1=new MobileAnd();
        mob1.operatingsystem(2);
    }
}
