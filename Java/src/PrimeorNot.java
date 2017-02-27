import java.util.Scanner;

/**
 * Created by pakusruti on 2/17/2017.
 * Prime or Not with better time completixy of O(sqrt{n))}
 */
public class PrimeorNot {


        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            int[] a = new int[t];
            for(int i=0;i<t;i++){
                a[i]=sc.nextInt();
                boolean isPrime =true;
                if(a[i]==1){
                    isPrime=false;
                }else{
                    for(int j=2;j<Math.sqrt(a[i]);j++){
                        if(a[i]%j==0){
                            isPrime=false;
                        }
                    }
                }
                System.out.println(isPrime ? "Prime" : "Not prime");
            }

        }


}
