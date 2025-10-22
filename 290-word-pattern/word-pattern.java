class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map1 = new HashMap<>();
        String arr[] = s.split(" ");
        if (pattern.length() != arr.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i)))
                map.put(pattern.charAt(i), arr[i]);
          else if (!map.get(pattern.charAt(i)).equals(arr[i]))
                return false;
        }
         for (int i = 0; i < pattern.length(); i++) {
            if (!map1.containsKey(arr[i]))
                map1.put(arr[i],pattern.charAt(i));
          else if (!map1.get(arr[i]).equals(pattern.charAt(i)))
                return false;
        }
        return true;

    }
}