package HashSets;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        HashMap<Integer, Integer> map = new HashMap<>();
        /*  Normal For loop
      for (int i = 0; i < arr.length; i++) {
          map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
      }

       For-each loop   */
        for (int j : arr) {
            // Increment the count of the current number in the map
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        System.out.println(map);
        // Create a HashSet from the values of the map (the counts of occurrences)
        HashSet<Integer> set=new HashSet<>(map.values());
        // If the size of the HashSet matches the size of the map, it means all counts are unique
        // Return true if each number occurs a unique number of times, otherwise return false
        System.out.println(set.size()==map.size());
        System.out.println(map.values());
    }
}
