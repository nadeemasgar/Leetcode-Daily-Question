class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = -1;
        int j = -1;
        int maxLen = 0;

        while(j < s.length() - 1) {
        // Aquire till you become invalid
            while(j < s.length() - 1) {
                j++;
                char ch = s.charAt(j);

                if(map.containsKey(ch) == false) {
                    map.put(ch, 1);
                    int len = j - i;
                    maxLen = Math.max(maxLen, len);
                }
                else {
                    int freq = map.get(ch);
                    map.put(ch, freq + 1);
                    break;
                }
            }

                 // Release till you become valid
            while(i < j) {
                i++;
                char ch = s.charAt(i);

                if(map.get(ch) == 2) {
                    map.put(ch, 1);
                    break;
                }
                else {
                    map.remove(ch);
                }
            }
        }

        return maxLen;
    }
}