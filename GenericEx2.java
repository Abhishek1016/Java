public class GenericEx2 <data,U>
{
    data t;
    U u;
    public GenericEx2(data t,U u)
    {
        this.t=t;
        this.u=u;
    }
    public data get()
    {
        return t;
    }
    public U getU()
    {
        return u;
    }

    public static void main(String[] args)
    {
        GenericEx2<Integer,String> Ex1=new GenericEx2<Integer,String>(10,"Hello");
        //GenericEx2<Double> Ex2= new GenericEx2<Double>(10.1);
        //GenericEx2<String> Ex3=new GenericEx2<String>("Hi");
        System.out.println(Ex1.get());
        System.out.println(Ex1.getU());
        //System.out.println(Ex2.get());
        //System.out.println(Ex3.get());
    }
}

