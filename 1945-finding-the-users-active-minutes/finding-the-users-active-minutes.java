class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int[] log:logs){
            int u=log[0];
            int m=log[1];
            map.putIfAbsent(u,new HashSet<>());
            map.get(u).add(m);
        }
        
        int res[]=new int[k];
        for(var val:map.values()){
            int uam=val.size();
            res[uam-1]++;
        }

        return res;
    }
}