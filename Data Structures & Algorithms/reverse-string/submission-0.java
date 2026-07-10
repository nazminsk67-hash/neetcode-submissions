class Solution {
    public void reverseString(char[] s) {
        char[] temp=new char[s.length];
        for(int i=0,j=s.length-1;i<s.length;i++,j--){
            temp[i]=s[j];
        }
        for(int i=0;i<s.length;i++){
            s[i]=temp[i];
        }
    }
}