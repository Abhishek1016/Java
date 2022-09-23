import java.util.*;

import static java.util.Collections.sort;

/*
Conditions:  return triplets
             i!=j;i!=k;j!=k and nums[i] + nums[j]+nums[k]==0
             must not have duplicate triplets

             Input: nums = [-1,0,1,2,-1,-4]//(-1+-1+2=0)
             Output: [[-1,-1,2],[-1,0,1]]

*/
public class Triplets
{
    public void triplets(int [] arr) {
        List<List<Integer>> array = new ArrayList<List<Integer>>(2);//might have to remove
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length - 2; i++)//first number in array
        {
            for (int j = i + 1; j < arr.length - 1; j++)//second number in array
            {
                for (int k = j + 1; k < arr.length; k++)//third number in array
                {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> newarr = new ArrayList<>();
                        newarr.add(arr[i]);
                        newarr.add(arr[j]);
                        newarr.add(arr[k]);
                        sort(newarr);//Suggested by intellij
                        set.add(newarr);
                    }
                }
            }

        }
        array.addAll(set);
        for (List<Integer> A : array) {
            System.out.println(A);
        }
    }

    public static void main(String[] args)
    {
        Triplets trip=new Triplets();
        int[] a1={0,0,0};
        trip.triplets(a1);
//        int[] a2={};
//        trip.
    }
}
