package HashSets;
import java.util.*;
import java.util.stream.Collectors;

public class TwoStringAreClosed {
    public static void main(String[] args) {
        String s1="abcb";
        String s2="bcaa";
        System.out.println(closeStrings(s1,s2));
    }

        public static boolean closeStrings(String word1, String word2) {
            if (word1 == null || word2 == null || word1.length() != word2.length()) {
                return false;
            }

            // Frequency maps for both words
            Map<Character, Integer> freqMap1 = new HashMap<>();
            Map<Character, Integer> freqMap2 = new HashMap<>();

            // Populate frequency map for word1
            for (int j = 0; j < word1.length(); j++) {
                freqMap1.put(word1.charAt(j), freqMap1.getOrDefault(word1.charAt(j), 0) + 1);
            }

            // Populate frequency map for word2
            for (int j = 0; j < word2.length(); j++) {
                freqMap2.put(word2.charAt(j), freqMap2.getOrDefault(word2.charAt(j), 0) + 1);
            }

            // Check if the set of characters is the same in both strings
            if (!freqMap1.keySet().equals(freqMap2.keySet())) {
                return false;
            }

            // Check if the frequencies of characters are the same after sorting
            return freqMap1.values().stream().sorted().collect(Collectors.toList())
                    .equals(freqMap2.values().stream().sorted().collect(Collectors.toList()));
    }

}
