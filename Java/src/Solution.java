/*
A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. For example, if left rotations are performed on array , then the array would become .

Given an array of  integers and a number, , perform  left rotations on the array. Then print the updated array as a single line of space-separated integers.

Input Format

The first line contains two space-separated integers denoting the respective values of  (the number of integers) and  (the number of left rotations you must perform).
The second line contains  space-separated integers describing the respective elements of the array's initial state.
 */

import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int i,j,x;
        int n = in.nextInt();
        j=in.nextInt();
        int ar[]=new int[n];
        for(i=0;i<n;i++)
        {
            ar[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            x=i+j;
            if(x>=n)
                x=x-n;
            System.out.print(ar[x]+" ");
        }
    }
}