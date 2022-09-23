class MessageSender
{
    public void send(String msg)
    {
        System.out.println("Sending the message"+" "+msg);
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("Exception Caugth");
        }
    }
}
class Threadsender extends Thread
{
    final private String message;
    MessageSender messagesender;
    Threadsender(String message,MessageSender messagesender)
    {
        this.message=message;
        this.messagesender=messagesender;
    }
    @Override
    public void run()
    {
        synchronized (messagesender)
        {
            messagesender.send(message);
        }
    }
}
public class Synchronizationex
{
    public static void main(String[] args)
    {
        MessageSender m1=new MessageSender();
        Threadsender s1=new Threadsender("Hi",m1);
        Threadsender s2= new Threadsender("Hello",m1);
        s1.start();
        s2.start();
        try
        {
            s1.join();
            s2.join();
        }
        catch(Exception e)
        {
            System.out.println("Caught Exception");
        }
    }
}
