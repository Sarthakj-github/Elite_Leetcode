class Solution {
    public boolean isValidSerialization(String preorder) {
        int n=preorder.length();
        int c=1;
        for(int i=0;i<n;i++){
            if((i+1)==n || preorder.charAt(i+1)==','){
                if(c==0){
                    return false;
                }
                if(preorder.charAt(i)!='#'){
                    c+=2;
                }
                c-=1;
            }
        }
        if(c){
            return false;
        }
        return true;
    }
}
