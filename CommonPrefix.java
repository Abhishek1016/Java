import java.util.Arrays;

public class CommonPrefix
{
    public static void main(String[] args)
    {
        String []arr1={"flight","flow","flower"};
        System.out.println(print(arr1));
        String []arr2={"dog","racer","car"};
        System.out.println((print(arr2)));
    }
    public static String print(String [] arr)
    {
        StringBuilder res=new StringBuilder();
        Arrays.sort(arr);
        char [] FirstString=arr[0].toCharArray();
        char [] LastString=arr[arr.length-1].toCharArray();

        for(int i=0;i<FirstString.length;i++)
        {
            if(FirstString[i]!=LastString[i])
            {
                break;
            }
            else {
                res.append(FirstString[i]);
            }
        }
        return res.toString();


    }
}
