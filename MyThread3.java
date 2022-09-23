class MyThread4 implements Runnable
{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getId()+"is running");
    }
}
public class MyThread3
{
    public static void main(String[] args)
    {
        for(int i=1;i<=7;i++)
        {

            MyThread2 th1=new MyThread2();
            Thread th =new Thread(th1);
            th.start();
        }
    }
}
