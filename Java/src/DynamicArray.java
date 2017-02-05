/*
Create a list, , of  empty sequences, where each sequence is indexed from  to . The elements within each of the  sequences also use -indexing.
Create an integer, , and initialize it to .
The  types of queries that can be performed on your list of sequences () are described below:
Query: 1 x y
Find the sequence, , at index  in .
Append integer  to sequence .
Query: 2 x y
Find the sequence, , at index  in .
Find the value of element  in  (where  is the size of ) and assign it to .
Print the new value of  on a new line
Sample Input

2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1
Sample Output
7
3
 */
import java.io.*;
import java.util.*;

public class DynamicArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();

        List<List<Integer>> seqList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            seqList.add(i, new ArrayList<Integer>());
        }
        int lastAns = 0;
        for(int i = 0; i < Q; i++){
            int oneOrTwo = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int res = (x ^ lastAns) % N;
            List<Integer> seq;
            if (oneOrTwo == 1) {
                seq = seqList.get(res);
                seq.add(y);

            } else {

                seq = seqList.get(res);
                int size = seq.size();
                lastAns =seq.get(y%size);
                System.out.println(lastAns);
            }
        }
    }
}