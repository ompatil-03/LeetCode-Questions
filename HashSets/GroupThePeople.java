package HashSets;

import java.util.*;
class GroupThePeople {

    public static void main(String args[]){
        int[] ans={3,3,3,3,3,1,3};
        System.out.println(groupThePeople(ans));

    }

        public static List<List<Integer>> groupThePeople(int[] groupSizes) {
            List<List<Integer>> res = new ArrayList<>();
            HashMap<Integer, List<Integer>> hm = new HashMap<>();
            for(int i = 0; i<groupSizes.length; i++) {
                List<Integer> curr = hm.getOrDefault(groupSizes[i], new ArrayList<>());
                curr.add(i);
                if(curr.size() == groupSizes[i]){
                    res.add(curr);
                    curr = new ArrayList<>();
                }
                hm.put(groupSizes[i], curr);
            }
            return res;
        }
}