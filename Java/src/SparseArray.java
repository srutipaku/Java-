/**
 * Created by pakusruti on 2/10/2017.
 * There are  strings. Each string's length is no more than  characters. There are also  queries. For each query, you are given a string, and you need to find out how many times this string occurred previously.

 Input Format

 The first line contains N, the number of strings.
 The next  N lines each contain a string.
 The nd line contains Q, the number of queries.
 The following  lines each contain a query string.
 */
import java.io.*;
import java.util.*;
public class SparseArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a[] = new String[n];
        for(int i=0;i<n;i++){
            a[i] = sc.next();
        }
        int q = sc.nextInt();

        for(int j=0;j<q;j++){
            String b = sc.next();
            int count =0;
            for(int k=0;k<n;k++){
                if(a[k].equals(b))
                {
                    count++;
                }

            }
            System.out.println(count);
        }
    }
}
