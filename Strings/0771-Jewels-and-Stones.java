class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        String []a=jewels.split("");
        String []b=stones.split("");
        int c=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i].equals(b[j])){
                    c++;
                }
            }
        }
        return c;
       }
}
