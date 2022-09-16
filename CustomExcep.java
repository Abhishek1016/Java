 class CustomExceps extends Exception
{
    public CustomExceps(String str)
    {
        super(str);//Exception class Constructor Exception(String message)
    }
}
public class CustomExcep
{
    public static void verify(int MobNum) throws CustomExceps
    {
        int length = String.valueOf(MobNum).length();
        if(length==10)
        {
            System.out.println("Mobile number is Valid");
        }
        else {
            throw new CustomExceps("Mobile number is not Valid ");
        }
    }

    public static void main(String[] args)
    {
        try
        {
            verify(123);
        }
        catch(CustomExceps CE)
        {
            System.out.println("Not Valid mobile number");
        }
        finally
        {
            System.out.println("Code Ends");
        }
    }
}

