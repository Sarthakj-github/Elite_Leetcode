class Solution {
    public int consecutiveNumbersSum(int n) {
        int k=1,c=0;
        while(2*n>k*(k-1)){
            if((n-(k*(k-1))/2)%k ==0)
                c++;
            k++;
        }
        return c;
    }
}
