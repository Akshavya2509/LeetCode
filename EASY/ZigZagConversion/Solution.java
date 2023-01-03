package EASY.ZigZagConversion;

class Solution {
    public String convert(String s, int numRows) 
    {
        int k;
        String ans = "";
        
        if(numRows == 1 || numRows >= s.length())
            return s;

        for(int i = 0; i < numRows; i ++)
        {

            int j = i;
            ans += s.charAt(j);
            while(j < s.length())
            {
                k = 2*(numRows-i-1);
                j += k;

                if(j < s.length() && k != 0)
                ans += s.charAt(j);

                k = 2*i;
                j += k;
                if(j < s.length() && k != 0)
                ans += s.charAt(j);
            }
        }

        return ans;
    }
}