/*
Write a program to find the range of the elements in the array. The range of an array is
the difference between the maximum and minimum element in an array.

Input : The first integer corresponds to n and the next n integers correspond to the
elements in the array.
Output : Range value
Case 1:

Input
5
2
4
1
3
5

Output
4

Case 2:

Input
3
5
6
4

Output
3


*/
public class RangeArray {
    public static void main(String[] args) {
        int []Arr = new int [] {5,2,4,1,3,5};
        int low = Arr[0];
        int high = Arr[0];

        for(int i : Arr){
            if(i <= low){
                low = i;
            }
            if(i >= high){
                high = i;
            }
        }
        int range = high - low;
        System.out.println("Range is: " + range);
    }
}
