class Solution {
    public String decodeMessage(String key, String message) {
    Map<Character,Character> map = new LinkedHashMap<>();
        char[] arr = key.replace(" ", "").toCharArray();
        char[] marr=message.toCharArray();
        char value='a';
        for(var c:arr)
        {
          if(!map.containsKey(c))
            {
              map.put(c,value);
              value++;
            }
        }
        
        StringBuilder ans = new StringBuilder();
        for(char c:message.toCharArray())
        {
            if(c==' ') ans.append(' ');
            else ans.append(map.get(c));
        }
        return ans.toString();

    }
}