import java.util.*;

public class GenericmethodEx
{
    public static void print(ArrayList<?> list)
    {
        System.out.println(list);
    }

    public static void main(String[] args)
    {
        ArrayList<String> arr= new ArrayList<>(2);
        arr.add("hi");
        arr.add("hello");
        ArrayList<Integer> arr1= new ArrayList<>(2);
        arr1.add(10);
        arr1.add(11);
        print(arr);
        print(arr1);
    }
}