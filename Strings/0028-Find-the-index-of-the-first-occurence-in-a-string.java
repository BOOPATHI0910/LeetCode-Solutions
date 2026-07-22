class Solution {
    public int strStr(String h, String n ) {
        int hs=h.length();
        int nd=n.length();
        for(int i=0;i<=hs-nd;i++){
            if(h.substring(i,i+nd).equals(n)){
                return i;
            }
            
        }
        return -1;
    } 
} 
