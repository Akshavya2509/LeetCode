package EASY.DeleteColumnsToMakeSorted;

class Solution {

    public char[][] delete(char c[][], int a, int b, int idx)
    {
        char ne[][] = new char[a][b - 1];
        for(int i = 0; i < a; i ++)
        {
            for(int j = 0; j < b; j ++)
            {
                if(j >= idx && j < b - 1)
                {
                    char temp = c[i][j];
                    c[i][j] = c[i][j + 1];
                    c[i][j + 1] = temp;
                }
                if(j < b - 1)
                ne[i][j] = c[i][j];
            }
        }

        return ne;
    }
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
                    c = delete(c, a, b, i);
                    b --;
                    i--;
                    count ++;
                    break;
                }
            }
        }

        return count;
    }
}
