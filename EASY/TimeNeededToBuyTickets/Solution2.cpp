#include<iostream>
#include<vector>
using namespace std;
class Solution {
public:
    int timeRequiredToBuy(vector<int>& tickets, int k) 
    {
        int ticketsToBuy = tickets[k];
        int len = tickets.size();
        int seconds = 0;
        for(int i = k; i >= 0; i--)
        {
            tickets[i] -= 1;
            seconds++;
        }
        ticketsToBuy--; 
        for(int i = 0; i < len; i++)
            seconds += min(ticketsToBuy, tickets[i]); 
        return seconds; 
    }
};