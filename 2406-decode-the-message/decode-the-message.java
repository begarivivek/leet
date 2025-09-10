class Solution {
    public String decodeMessage(String key, String message) {
    Map<Character,Character> map = new LinkedHashMap<>();
    String ans="";
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
        
        for(int i=0;i<marr.length;i++)
        {
            if(marr[i]==' ') ans+=marr[i];
            else ans+=map.get(marr[i]);
            
        }
        return ans;

    }
}