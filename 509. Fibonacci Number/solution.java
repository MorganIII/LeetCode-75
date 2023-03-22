class Solution {
    public int fib(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        return fib(n, map);
    }
    public int fib(int n, Map<Integer,Integer> map){
        if(n == 0) {
            return 0;
        } else if (n == 1){
            return 1;
        }
        else if(map.containsKey(n)) {
            return map.get(n);
        } 
       int result = fib(n-1, map)+ fib(n-2, map);
       map.put(n, result);
       return result;
        
    }
}