
/*Problem Statement

You are given an array of integers, prices, where each element represents the price of a stock on a specific day. Your task is to implement a method, maxProfit, to determine the maximum profit that can be achieved by making exactly one buy and one sell of the stock.

Constraints:

You must buy the stock before selling it.
If no profit can be made, the method should return 0.*/


package problems;

import java.util.Arrays;

public class maxProfit {

    public static int maxProfitCalculation(int[] stockPrice) {
        // Initialize `minPrice` to the maximum possible value to track the lowest price seen so far.
        int minPrice = Integer.MAX_VALUE;

        // Initialize `maxProfit` to 0, as no profit can be made initially.
        int maxProfit = 0;

        // Iterate through each stock price in the array.
        for (int price : stockPrice) {
            // Update `minPrice` to the smallest price seen so far.
            minPrice = Math.min(minPrice, price);

            // Calculate the potential profit by selling at the current price.
            int profit = price - minPrice;

            // Update `maxProfit` if the calculated profit is greater than the current maximum profit.
            maxProfit = Math.max(maxProfit, profit);
        }

        // Return the maximum profit that can be achieved.
        return maxProfit;
    }


    public static void main(String[] args) {
        int [] stockPrice = { 1, 6, 6, 6, 6, 4};
        int result = maxProfitCalculation(stockPrice);

        System.out.println("The maximum profit earned for this stock prices " + Arrays.toString(stockPrice));
        System.out.println("is " +result);

    }


}
