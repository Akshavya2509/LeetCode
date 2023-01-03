package EASY.DeleteColumnsToMakeSorted.DetectCapital;

class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for(int i = 0; i < word.length(); i ++)
        {
            if((int)word.charAt(i) >= 65 && (int)word.charAt(i) <= 90)
            {
                count ++;
            }
        }

        if(count == 1 && (word.charAt(0) >= 65 && word.charAt(0) <= 90))
        {
            return true;
        }

        else if(count == word.length())
        {
            return true;
        }

        else if(count == 0)
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}
