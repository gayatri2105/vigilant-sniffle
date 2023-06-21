class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int n=candies.length;
        Boolean flag=true;
        List<Boolean> candylist= new ArrayList<Boolean>(n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                flag=true;
                System.out.println(i+" "+j);
                if(candies[i]+extraCandies<candies[j])
                {
                    flag=false;
                    break;
                }
            }
            candylist.add(flag);
        }
        return candylist;
    }
}