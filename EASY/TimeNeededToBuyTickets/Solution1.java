package EASY.TimeNeededToBuyTickets;
import java.util.*;
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sum = 0;
        int add = 0;
       for(int i = 0; i < tickets.length; i ++)
        sum = sum + tickets[i];
       Queue <Integer> q = new LinkedList<>();
       for(int i = 0; i < tickets.length; i ++)
           q.add(i);
       for(int i = 0; i < sum ; i ++)
       {
           if(q.peek() == k)
           {
               if(tickets[q.peek()] == 1)
               {
                   add += 1;
                   return add;
               }
               else
               {
                   add += 1;
                   tickets[q.peek()] --;
                   q.add(q.peek());
                   q.remove();
               }
           }
           else
           {
               if(tickets[q.peek()] == 1)
               {
                   add += 1;
                   q.remove();
               }
               else
               {
                   add += 1;
                   tickets[q.peek()] --;
                   q.add(q.peek());
                   q.remove();
               }
           }
       }
       return add;
    }
}