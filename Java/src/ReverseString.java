/**
 * Created by pakusruti on 2/11/2017.
 * Write a function that takes a string as input and returns the string reversed.
 */
public class ReverseString {

        public String reverseString(String s) {
            char arr[]= s.toCharArray();
            char temp;

            for(int i= 0,j=arr.length-1;i<(arr.length/2);i++,j--){

                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            return new String(arr);
        }

}
