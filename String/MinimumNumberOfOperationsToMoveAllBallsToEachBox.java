package String;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public static void main(String[] args) {
     String s="001011";
        System.out.println(Arrays.toString(minOperations(s)));
    }
    public static int[] minOperations(String boxes) {

        int s=boxes.length();
        int count=0;
        int [] ans =new int[s];

        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(boxes.charAt(j)=='1'){
                    count+=Math.abs(i-j);
                }
            }
            ans[i]=count;
            count=0;
        }
        return ans;
    }
}
