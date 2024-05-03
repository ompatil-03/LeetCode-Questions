package String;

public class ScoreOfString {
    public static void main(String[] args) {
    String s= "hello";
    System.out.println(scoreOfString(s));
    }
    public static int scoreOfString(String s) {
        int j=1,sum=0,a,b;
        for(int i=0;i<s.length()&&j<s.length();i++){
            a=s.charAt(i);
            b=s.charAt(j);
            sum+=Math.abs(a-b);
            j++;
        }
        return sum;
    }
}
