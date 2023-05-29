class Solution {
    Set<Integer> s = new HashSet<>();
    public boolean canReach(int[] arr, int start) {
        return solve(arr,start,arr.length);
    }

    public boolean solve(int[] arr,int i,int n){
        if(0<=i && i<n && !s.contains(i)){
            if(arr[i]==0)   return true;
            s.add(i);                  
            boolean a = solve(arr,i-arr[i],n);
            if(a)   return a;
            return solve(arr,i+arr[i],n);
        }
        return false;
    }
}
