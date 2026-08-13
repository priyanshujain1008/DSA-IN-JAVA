class Solution {
    public int countVowelSubstrings(String word) {
        int ans = 0;
        int left = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < word.length(); right++) {
            char ch = word.charAt(right);

            if ("aeiou".indexOf(ch) == -1) {
                map.clear();
                left = right + 1;
                continue;
            }

            map.put(ch, right);

            if (map.size() == 5) {
                int min = Integer.MAX_VALUE;

                for (int pos : map.values()) {
                    min = Math.min(min, pos);
                }

                ans += min - left + 1;
            }
        }

        return ans;
    }
}