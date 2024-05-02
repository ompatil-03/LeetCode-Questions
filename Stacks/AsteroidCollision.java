package Stacks;
import java.util.*;
public class AsteroidCollision {
    public static void main(String[] args) {
        int[] ans={5,10,-5};
       int [] add=asteroidCollision(ans);
        System.out.println(Arrays.toString(add));
    }

        public static int[] asteroidCollision(int[] nums) {
            Stack<Integer> stack = new Stack<>();
            Stack<Integer> stack2 = new Stack<>();
            int n=nums.length;
            stack.push(nums[0]);
            for(int i=1;i<n;i++){
                if(stack.peek()>0 && nums[i]>0  &&   stack.peek()!=Math.abs(nums[i])){
                    stack.push(nums[i]);
                }else if(stack.peek()<0 && nums[i]<0  && stack.peek()!=Math.abs(nums[i])){
                    stack.push(nums[i]);
                }else if(stack.peek()<0 && nums[i]>0  && stack.peek()==Math.abs(nums[i])){
                    stack.pop();
                }else if(stack.peek()>0 && nums[i]<0 && stack.peek()==Math.abs(nums[i])){
                    stack.pop();
                }
            }
            int[] result = new int[stack.size()];
            for (int i = result.length - 1; i >= 0; i--) {
                result[i] = stack.pop();
            }

           return result;

    }
}
