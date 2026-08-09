class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        HashSet<String> s = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String rev = reverse(words[i]);
            if (s.contains(rev)) {
                count++;
            } else
                s.add(words[i]);

        }
        return count++;
    }

    public String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
