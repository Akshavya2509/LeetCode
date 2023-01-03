package EASY.DeleteColumnsToMakeSorted;

class Solution {
    public int minDeletionSize(String[] strs) {

        int a = strs.length;

        int b = strs[0].length();

        char c[][] = new char[a][b];

        int count = 0;

        for(int i = 0; i < a; i ++)
        {
            for(int j = 0; j < b; j ++)
            {
                c[i][j] = strs[i].charAt(j);
            }
        }

        for(int i = 0; i < b; i ++)
        {
            for(int j = 0; j < a; j ++)
            {
                if(j != a - 1 && (int)c[j][i] > (int) c[j + 1][i])
                {
                    count ++;
                    break;
                }
            }
        }

        return count;
    }
}
