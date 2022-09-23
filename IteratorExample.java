/*
PeekingIterator(Iterator<int> nums) Initializes the object with the given integer iterator iterator.
        int next() Returns the next element in the array and moves the pointer to the next element.
        boolean hasNext() Returns true if there are still elements in the array.
        int peek() Returns the next element in the array without moving the pointer.
        Note: Each language may have a different implementation of the constructor and Iterator, but they all
        support the int next() and boolean hasNext() functions.
        Example 1:

        Input
        ["PeekingIterator", "next", "peek", "next", "next", "hasNext"]
        [[[1, 2, 3]], [], [], [], [], []]
        Output
        [null, 1, 2, 2, 3, false]

        */
public class IteratorExample
{
    public int [] arr;
    int pointer;
    public IteratorExample(int [] arr)
    {
        this.arr=arr;
        pointer=arr.length-arr.length;
    }
    public int next()
    {
        pointer++;
        return arr[pointer];
    }
    public boolean hasnext()
    {
        boolean bol=false;
        if(arr.length-pointer==0)
        {
            bol=true;
        }
        return bol;
    }
    public int peek()
    {
        int pointer1=pointer+1;
        int pointer2=arr[pointer1];
        return pointer2;
    }

    public static void main(String[] args)
    {
        int[] arr1={1,2,3,4};
        IteratorExample it=new IteratorExample(arr1);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]);
        }
        System.out.println();
        System.out.println(it.next());
        System.out.println(it.peek());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasnext());


    }
}

