package EASY.TimeNeededToBuyTickets;

public class Solution3 {
    public int timeRequiredToBuy(int[] tickets, int k) 
    {
        int seconds = 0;
        for (int i = 0; i < tickets.length; i++) 
        {
            if (tickets[i] < tickets[k])
                seconds += tickets[i];

            else 
            {
                if (i <= k)
                    seconds += tickets[k];

                else
                    seconds += tickets[k] - 1;
            }
        }

        return seconds;
    }
    
}
