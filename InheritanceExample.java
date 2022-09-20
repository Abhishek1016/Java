class B1
{
    int b1=8;
}
class A1
{
    int a1=9;
}
class A extends A1
{
    int a=10;
    public static void print1()
    {
        System.out.println(new A1().a1);
    }
}
class B extends A
{
    int b=11;
    public static void print2()
    {
        System.out.println(new B().a);
    }
    public static void print3()
    {
        System.out.println(new B().a1);
    }
}
class B2 extends B1
{
    public static void print4()
    {
        System.out.println(new B2().b1);
    }
}
class B3 extends B1
{
    public static void print5()
    {
        System.out.println(new B3().b1);
    }
}
interface C
{
    int c=12;
}
interface D
{
    int d=13;
}
public class InheritanceExample extends B implements C,D
{
    public static void main(String[] args)
    {
        InheritanceExample Ex= new InheritanceExample();
        System.out.println(Ex.b);
        Ex.print1();
        Ex.print2();
        Ex.print3();
        System.out.println(Ex.c);
        System.out.println(Ex.d);
    }
}
