/*Write a program to find the type of array using functions. An array is said
        to be “Even” if all the elements in the array are even. An array is
        said to be “Odd” if all the elements in the array are odd. An array
        is said to be “Mixed” if it contains some odd elements and some even elements.
        The return value of the function should be 1 if the array is Even.
        The return value of the function should be 2 if the array is Odd. The return value
        of the function should be 3 if the array is Mixed.

        Input : The first integer corresponds to n and the next n integers correspond to the
        elements in the array.
        Output : Odd/Even/Mixed
        Case 1:

        Input
        5
        2
        4
        1
        3
        5

        Output
        Mixed
        */

import java.util.Scanner;
public class Array1D
{
    public static void arrayfunc(int n,int [] arr)
    {
        int oddcount=0;
        int evencount=0;//6
        int mixed=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]%2==0)
            {
                evencount++;

            }
            else if(arr[j]%2==1)
            {
                oddcount++;
            }
            else {
                mixed++;
            }
        }
        if(oddcount==arr.length)
        {
            System.out.println("odd");
        }
        else if (evencount==arr.length)
        {
            System.out.println("even");
        }
        else {
            System.out.println("mixed");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();

        }
        arrayfunc(n,arr);
    }
}
