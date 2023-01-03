package EASY.DeleteColumnsToMakeSorted;

class Solution {
    public int minDeletionSize(String[] strs) {

        int a = strs.length;

        int b = strs[0].length();

        int count = 0;

        for(int i = 0; i < b; i ++)
        {
            for(int j = 0; j < a; j ++)
            {
                if(j != a - 1 && (int)strs[j].charAt(i) > (int)strs[j + 1].charAt(i))
                {
                    count ++;
                    break;
                }
            }
        }

        return count;
    }
}
