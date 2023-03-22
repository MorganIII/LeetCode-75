class Solution {
    public int climbStairs(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        return test(n,map);    
    }
    
    public int test(int n,  Map<Integer,Integer> map){
          if(n==1 || n==2){
            return n==1? 1:2;
           }
        if(map.containsKey(n)){
            return map.get(n);
        }
        else{
            int value = test(n-1,map) + test(n-2,map);
            map.put(n,value);
        }
        return map.get(n);

    }
}