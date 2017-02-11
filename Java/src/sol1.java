
public class sol1 {
    public static int round(double d){
        double dabs=Math.abs(d);
        int i=(int) dabs;
        double result=dabs-(double)i;
        if(result<0.4){
            return i;
        }else{
            return i+1;
        }
    }

    public static void main(String[] args) {
        Integer x=(Integer) 623315;
        String arr=x.toString();
        int max=0;

        for(int i=0;i<arr.length()-1;i++){
            String before=arr.substring(0,i);
            String after=arr.substring(i+2);
            Character _1= arr.charAt(i);
            double one=Integer.parseInt(_1.toString());
            Character _2=arr.charAt(i+1);
            double two=Integer.parseInt(_2.toString());
            Integer average= round((one+two)/2);
            String avg=average.toString();
            Integer res=Integer.parseInt((before+avg+after));
            System.out.println(res);
            if(res>max){
                max=res;
            }
        }
        System.out.println("max is"+max);
    }


}
