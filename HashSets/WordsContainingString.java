package HashSets;

import java.util.*;
class WordsContainingString {

    public static void main(String args[]){
     String[] ans={"leet","code","hom","e"};
     char ch='e';
     System.out.println(findWordsContaining(ans,ch));
     
     }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        String hello="";
        for(int i=0;i<words.length;i++){
             hello=words[i];
             if(hello.indexOf(x)!=-1){
                ans.add(i);
             }
        }
        return ans;
    }
}