class Solution {
    public int characterReplacement(String s, int k) {
        
    HashMap<Character,Integer>shan=new HashMap<>();

    int l=0;
    int r=0;
    int n=s.length();
    int maxlen=-1;
    int len=0;

    while(r<n){

        char ch=s.charAt(r);
        shan.put(ch,shan.getOrDefault(ch,0)+1);

    maxlen=Math.max(maxlen,shan.get(ch));

    if((r-l+1)-maxlen>k){

        char c=s.charAt(l);

        shan.put(c,shan.get(c)-1);

        if(shan.get(c)==0) shan.remove(c);
        l++;
    }

    len=Math.max(len,r-l+1);
    r++;
    }
    return len;
    }
}
