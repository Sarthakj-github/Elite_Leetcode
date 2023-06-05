class Solution {
    public int uniquePaths(int m, int n) {
        double ans=1;
        for(int i=1;i<Math.min(m,n);i++)
            ans=ans*(Math.max(m,n)-1+i)/i;
        return (int)ans;
    }
}
