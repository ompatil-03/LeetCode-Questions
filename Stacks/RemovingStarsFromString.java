package Stacks;

import java.util.Stack;

public class RemovingStarsFromString {
    public static void main(String[] args) {
        String  s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

        public static String removeStars(String s) {
            Stack<Character> stack = new Stack<>();
            StringBuilder sb=new StringBuilder();
            int n=s.length();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='*'){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            return sb.reverse().toString();

    }
}
