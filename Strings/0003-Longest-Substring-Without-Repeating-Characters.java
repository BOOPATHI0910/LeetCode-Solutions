class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[]=new int[128];
        int l=0,maxlen=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch]++;
            while(freq[ch]>1){
                freq[s.charAt(l)]--;
                l++;
            }
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}
