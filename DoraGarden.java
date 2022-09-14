import java.util.Scanner;

public class DoraGarden
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  row , column, treenumber :");
        int row =sc.nextInt();
        int col =sc.nextInt();
        int treenumber =sc.nextInt();

        if(treenumber<=row || treenumber%col==0 || treenumber%col==1)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}
