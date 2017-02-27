/**
 * Created by pakusruti on 2/27/2017.
 */
public class Stack {

    static int stackArray[] = new int[10];
    static int  top=-1;
    public static int Stackpop(){
        if(top ==-1){
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }else{
            top = top-1;
            return stackArray[top+1];
        }
    }
    public static void Stackpush(int x){
        if (top+1>=stackArray.length){
            System.out.println("Stack overflow");

        }else{

            top = top + 1;
            stackArray[top] = x;

        }

    }
    public  static void main(String args[]){
        Stack s = new Stack();
        s.Stackpush(2);
        s.Stackpush(3);
        s.Stackpush(4);

        System.out.println(s.Stackpop());
        System.out.println(s.Stackpop());
        System.out.println(s.Stackpop());
        System.out.println(s.Stackpop());
    }

}

