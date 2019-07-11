package Easy;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 *
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 */
public class SellBuyStockII {
    public static void main(String[] args) {
        int[] prices = new int[]{ 1, 2, 3, 4, 5};
        int profit = 0;
        for(int i = 1 ; i < prices.length ; i++){
            if( prices[i] > prices[i-1] ){
                profit += prices[i] - prices[i-1];
            }
        }
        System.out.println(profit);
    }
}
