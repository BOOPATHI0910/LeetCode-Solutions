class Solution {
    public int compress(char[] chars) {
        String str="";
        int i=0;
        int n=chars.length;
        while(i<n){
            char ch=chars[i];
            int c=0;
            while(i<n&&chars[i]==ch){
                i++;
                c++;
            }
            str+=ch;
            if(c>1){
                str+=c;
            }
        }
        for(int j=0;j<str.length();j++){
            chars[j]=str.charAt(j);
        }
        return str.length();
    }
}
