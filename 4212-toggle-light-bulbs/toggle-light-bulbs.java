class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Set<Integer> set = new HashSet<>();
        for(int i:bulbs){
           if(!set.contains(i)) set.add(i);
           else set.remove(i);
        }
        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
    }
}