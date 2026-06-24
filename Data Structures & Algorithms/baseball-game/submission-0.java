class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        int[] ans=new int[operations.length];
        int size = 0;
        for(int i=0;i<operations.length;i++){
            String op = operations[i];
            if(op.equals("+")){
                ans[size] = ans[size - 1] + ans[size - 2];
                sum += ans[size];
                size++;
            } else if(op.equals("C")){
                sum -= ans[size - 1];
                size--;
            } else if(op.equals("D")){
                ans[size] = 2 * ans[size - 1];
                sum += ans[size];
                size++;
            } else {
                ans[size] = Integer.parseInt(op);
                sum += ans[size];
                size++;
            }
        }
        return sum;
    }
}