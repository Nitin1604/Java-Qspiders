package allPrograms;

public class program25 {
    public static void main(String[] args) {
        program25 checker = new program25();
        System.out.println(checker.isAnagram("Listen", "Silent"));  // true
        System.out.println(checker.isAnagram("Hello", "Olelh"));   // true
        System.out.println(checker.isAnagram("Test", "Best"));     // false
    }

    public boolean isAnagram(String s, String t) {
        // Check for null or unequal lengths
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        // Get frequency arrays for both strings
        int[] freq1 = getFreqArray(s);
        int[] freq2 = getFreqArray(t);

        // Compare the frequency arrays
        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] getFreqArray(String s) {
        int[] freq = new int[26]; // Frequency array for a-z
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i)); // Convert to lowercase
            if (c >= 'a' && c <= 'z') { // Check if the character is alphabetic
                freq[c - 'a']++;
            }
        }
        return freq;
    }


}
