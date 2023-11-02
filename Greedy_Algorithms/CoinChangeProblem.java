package Greedy_Algorithms;

import java.util.*;
//Coin change practice problem for greedy algorithms
  
public class CoinChangeProblem {

    static int GreedyCoinChange(int[] coins, int amount){
        Arrays.sort(coins);
        int coinCount = 0;
        int remainingAmount = amount;

        //for each coin in coins
        for(int i = coins.length - 1; i >= 0; i--){
            while(coins[i] <= remainingAmount){
                remainingAmount -= coins[i];
                coinCount++;
            }

        }
        //return the minimum number of coins needed to make change.
        return coinCount;
    }
   
    public static void main(String[] args) {
    
     Scanner scan = new Scanner(System.in);
     int[] coins = {1, 5, 10, 25};
     System.out.print("Enter amount of change: ");
     int amount = scan.nextInt();

     int minCoins = GreedyCoinChange(coins, amount);
     System.out.println("Minimum number of coin(s) needed are: "+ minCoins);

    }
}