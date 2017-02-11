
public class sol2 {

    public static int solution(String S) {
        String lines[]=S.split("\n");
        int path = 0, sp =0;
        for(int i=lines.length-1;i>0;i--){
            String line=lines[i];
            if(line.contains(".gif")|| line.contains(".jpeg") || line.contains(".png")){
                sp=line.length()-line.trim().length();
            }
            if(sp> line.length()- line.trim().length()){
                path+=line.trim().length()+1;
                sp--;
            }
        }
        return path;
    }
    public static void main(String args[]){


    }
}
