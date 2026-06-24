class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int sum=target-numbers[i];
            if(m.containsKey(sum)){
                return new int[]{m.get(sum),i+1};
            }
            m.put(numbers[i],i+1);
        }
        return new int[0];
    }
}
