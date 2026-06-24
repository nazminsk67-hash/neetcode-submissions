class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> cnts=new HashMap<>();
        HashMap<Character,Integer> cntt=new HashMap<>();
        for(int i=0;i<s.length();i++){
            cnts.put(s.charAt(i),cnts.getOrDefault(s.charAt(i),0)+1);
            cntt.put(t.charAt(i),cntt.getOrDefault(t.charAt(i),0)+1);
        }
        return cnts.equals(cntt);
    }
}
