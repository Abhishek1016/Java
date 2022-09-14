/*
The rules for generating Collatz Sequence are: If n is even: n = n / 2 If n is odd: n = 3n + 1
For example, if the starting number is 5 the sequence is: 5 -> 16 -> 8 -> 4 -> 2 -> 1
It has been proved for almost all integers, the repeated application of the above rule
will result in a sequence that ends at 1.

The input containing an integer 'n' which denotes the given number.
 Print the numbers in the sequence as output
 Case 1:

Input
5

Output
5 16 8 4 2 1

*/
import java.util.Scanner;
public class Collatz
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.println("1");
            System.out.println("0");
        }
        else {
            while(n!=1)
            {
                if(n%2==0)
                {
                    n=n/2;
                }
                else
                {
                    n=(3*n)+1;

                }
                System.out.println(n);
            }
        }
    }
}
