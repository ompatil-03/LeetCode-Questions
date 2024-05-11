package Arrays;

public class MinimumNumberOfOperationsToMakeArrayXOREqualToK {
    public int minOperations(int[] nums, int k) {
        int xor=0;
        int count=0;
        for(int n:nums){
            xor^=n;
        }
        while(k>0||xor>0){
            if((k%2!=xor%2)){
                count++;
            }
            k/=2;
            xor/=2;
        }
        return count;
    }
}
