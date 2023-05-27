class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(char c: ransomNote.toCharArray())
        {
            int tmp=magazine.indexOf(c);
        if(tmp==-1)
            return false;
            magazine=magazine.substring(0,tmp)+magazine.substring(tmp+1);
        }
        return true;
    }
}