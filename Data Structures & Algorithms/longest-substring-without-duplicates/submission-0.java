class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer>shan=new HashMap<>();

        int l=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if(shan.containsKey(ch) &&  shan.get(ch)>=l){
                l=shan.get(ch)+1;

            }
            maxlen=Math.max(maxlen,i-l+1);
            shan.put(ch,i);

        }
        return maxlen;
    }
}
