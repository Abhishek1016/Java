import java.util.Scanner;

 class Wrapper
{
    int IntVar;
    public Wrapper(int IntegerNum)
    {
        this.IntVar=IntegerNum;
    }
    public int getInt()
    {
        return IntVar;
    }
    @Override
    public String toString()
    {
        return Integer.toString(IntVar);
    }

}
public class Wrapper2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int input=sc.nextInt();
        Wrapper IntObj=new Wrapper(input);
        System.out.println(IntObj.getInt());
        System.out.println(IntObj.toString());

    }
}
/*
1.
You are given a table, in which every key is a stringified number, and each corresponding value is an
array of characters, e.g.

{
  "1": ["A", "B", "C"],
  "2": ["A", "B", "D", "A"],
}
Create a function that returns a table with the same keys, but each character should appear only once among
the value-arrays, e.g.

{
  "1": ["C"],
  "2": ["A", "B", "D"],
}
2.
You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.

Implement the BrowserHistory class:

BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
void visit(string url) Visits url from the current page. It clears up all the forward history.
string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps

Input:
["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
[["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
Output:
[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com"]

3.
Design a class that acts as a library for the following kinds of media: book, video, and newspaper.
Provide one version of the class that uses generics and one that does not
4.
Design an iterator that supports the peek operation on an existing iterator in addition to the hasNext and the next operations.

Implement the PeekingIterator class:

PeekingIterator(Iterator<int> nums) Initializes the object with the given integer iterator iterator.
int next() Returns the next element in the array and moves the pointer to the next element.
boolean hasNext() Returns true if there are still elements in the array.
int peek() Returns the next element in the array without moving the pointer.
Note: Each language may have a different implementation of the constructor and Iterator, but they all support the int next() and boolean hasNext() functions.



Example 1:

Input
["PeekingIterator", "next", "peek", "next", "next", "hasNext"]
[[[1, 2, 3]], [], [], [], [], []]
Output
[null, 1, 2, 2, 3, false]

*/
