class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>shan=new HashMap<>();

        for(int i=0;i<t.length();i++){
            shan.put(t.charAt(i),shan.getOrDefault(t.charAt(i),0)+1);
        }

        int l=0,r=0;
        int n=s.length();
        int m=t.length();
        int cnt=0;
        int st=-1;
        int end=Integer.MAX_VALUE;
         
        while(r<n){

            char ch=s.charAt(r);

            if(shan.containsKey(ch) ){
                   if(shan.get(ch)>0) cnt++;
                shan.put(ch,shan.get(ch)-1);
            }

            while(cnt==m){

                if((r-l+1)<end){
                   st=l;
                    end=r-l+1;
                }

                

                char c=s.charAt(l);

                if(shan.containsKey(c)){
                    shan.put(c,shan.get(c)+1);
                    if(shan.get(c)>0)cnt--;
                }
                l++;


            }
            r++;
        }
        return st==-1?"":s.substring(st,st+end);
    }
}
