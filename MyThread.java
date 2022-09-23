class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getId()+"is running");
    }
}
public class MyThread
{
    public static void main(String[] args)
    {
        for(int i=1;i<=7;i++)
        {
            MyThread2 th=new MyThread2();
            th.start();
        }
    }
}
