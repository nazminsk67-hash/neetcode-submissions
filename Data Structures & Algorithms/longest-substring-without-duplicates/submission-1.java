class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> m=new HashMap<>();
        int l=0;
        int res=0;
        int r=0;
        for(;r<s.length();r++){
            if(m.containsKey(s.charAt(r))){
                l=Math.max(m.get(s.charAt(r))+1,l);
            }
            m.put(s.charAt(r),r);
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
