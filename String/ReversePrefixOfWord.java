package String;
/*
2000. Reverse Prefix of Word

Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and
ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive).
The resulting string will be "dcbaefd".
Return the resulting string.
 */
public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        if (word.indexOf(ch) != -1) { // Check if the character is present
            StringBuilder sb = new StringBuilder();
            int count = word.indexOf(ch); // Find the index of the character
            for (int i = count; i >= 0; i--) { // Reverse the prefix
                sb.append(word.charAt(i));
            }
            sb.append(word.substring(count + 1)); // Append the suffix
            return sb.toString();
        } else {
            return word; // If the character is not present, return the original word
        }


    }
}
