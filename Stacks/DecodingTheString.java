package Stacks;

import java.util.Stack;

public class DecodingTheString {
    public static void main(String[] args) {
        String s="3[a2[c]]";
        System.out.println(decodeString(s));
    }

        public static String decodeString(String s) {
            Stack<Integer> nums = new Stack<>();
            Stack<StringBuilder> chars = new Stack<>();
            StringBuilder curr = new StringBuilder();
            int k = 0;
            for(char ch : s.toCharArray()) {
                if(Character.isDigit(ch)) {
                    k = k * 10 + (int)(ch-'0');
                } else if(ch == '[') {
                    nums.push(k);
                    chars.push(curr);
                    k = 0;
                    curr = new StringBuilder();
                } else if(ch == ']') {
                    StringBuilder lastStr = chars.pop();
                    int lastK = nums.pop();
                    while(lastK-- > 0) {
                        lastStr.append(curr);
                    }
                    curr = lastStr;
                } else {
                    curr.append(ch);
                }
            }
            return curr.toString();
        }

}
