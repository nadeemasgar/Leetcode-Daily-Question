class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : arr) {
            int freq = 0;
            if(map.containsKey(s)) {
                freq = map.get(s);
            }

            map.put(s, freq + 1);
        }

        int K = 0;
        for(String s : arr) {
            if(map.get(s) == 1) {
                K++;
            }

            if(k == K) return s;
        }

        return "";
    }
}