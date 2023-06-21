class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        String word="";
        while(i<word1.length() || j<word2.length())
        {
            if(i<word1.length())
            {
                word=word+word1.charAt(i);
                i++;
            }
            if(j<word2.length())
            {
                word=word+word2.charAt(j);
                j++;
            }

        }
        return word;
    }
}