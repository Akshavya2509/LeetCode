package EASY.ClosestPrimeNumbersInRange;
import java.util.*;
class Solution {

    public static boolean isprime(int x)
    {
        if(x <= 1)
        {
            return false;
        }

        for(int i = 2; i*i <= x; i ++)
        {
            if(x % i == 0 || x <= 1)
            {
                return false;
            }
        }

        return true;        
    }
    public int[] closestPrimes(int left, int right) {

        int minimum = Integer.MAX_VALUE;

        int arr[] = new int[2];
        ArrayList <Integer> a = new ArrayList<>();

        if(right - left < 2)
        {
            arr[0] = -1;
            arr[1] = -1;

            return arr;
        }

        for(int i = left; i <= right; i ++)
        {
            if(isprime(i))
            {
                a.add(i);
            }
        }

        if(a.size() <= 1)
        {
            arr[0] = -1;
            arr[1] = -1;

            return arr;
        }

        for(int i = 0; i < a.size(); i ++)
        {
            if(i != a.size() - 1)
            if(a.get(i + 1) - a.get(i) < minimum)
            {
                minimum = a.get(i + 1) - a.get(i);
                arr[0] = a.get(i);
                arr[1] = a.get(i + 1);
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        
    }
}