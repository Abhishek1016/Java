import java.util.ArrayList;
import java.util.List;

public class Upperbound
{
    public static void main(String[] args)
    {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        List<Double> arr1=new ArrayList<>();
        arr1.add(10.1);
        arr1.add(20.1);
        print(arr);
        print(arr1);
    }
    public static void print(List<? extends Number> list)
    {
        System.out.println(list);
    }

}
