import java.util.Scanner;

/**
 * Created by pakusruti on 2/18/2017.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayRotation {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            int q = in.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }

            int alt = k % n;
            System.arraycopy(a, 0, b, alt, n-alt);
            System.arraycopy(a, n-alt, b, 0, alt);


            for(int a0 = 0; a0 < q; a0++){
                int m = in.nextInt();
                System.out.println(b[m]);
            }

        }


}
