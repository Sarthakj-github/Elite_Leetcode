class Solution {
    public int minMoves(int[] nums, int k) {
        if(k==1)    return 0;
        int n=nums.length;
        int[] ones = new int[n];
        int m=0;
        for(int i=0;i<n;i++)
            if(nums[i]==1){
                ones[m]=i;
                m++;
            }
        long[] presum = new long[m];
        presum[0]=ones[0];
        for(int i=1;i<m;i++)
            presum[i]=presum[i-1]+ones[i];
        long mx=2*presum[m-1],x,y;
        for(int i=0;i<=(m-k);i++){
            x=help(ones,presum,i,k,0);
            if(k%2==0){
                y=help(ones,presum,i,k,1);
                x-=ones[i+(int)k/2-1];
                y+=ones[i+(int)k/2];
                x=Math.min(x,y);
            }
            mx=Math.min(mx,x);
        }
        return (int)mx;
    }
    public long help(int[] ones,long[] presum,int i,int k,int b){
        int j=i+k-1;
        b+=(int)((i+j)/2);
        long lr=b-i,rr=j-b;
        lr=(long)((lr*lr+lr)/2);
        rr=(long)((rr*rr+rr)/2);
        long tot=presum[j]- presum[b]*2+ones[b];
        if(i!=0)    tot+=presum[i-1];
        return tot-lr-rr;
    }
}
