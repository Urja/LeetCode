package Easy;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StockProfit {

    @Test
    public void input1(){
        int[] input ={2, 4, 1};
        Assert.assertTrue(maxProfit(input) == 2);
    }

    @Test
    public void input2(){
        int[] input ={7,1,5,3,6,4};
        Assert.assertTrue(maxProfit(input) == 5);
    }

    @Test
    public void input3(){
        int[] input ={};
        Assert.assertTrue(maxProfit(input) == 0);
    }

    @Test
    public void input4(){
        int[] input ={7,6,4,3,1};
        Assert.assertTrue(maxProfit(input) == 0);
    }

    @Test
    public void input5(){
        int[] input ={1, 2};
        Assert.assertTrue(maxProfit(input) == 1);
    }

    private int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int minValue = prices[0];
        int profit = 0;

        for(int i = 1 ; i < prices.length ; i++) {
            if (minValue > prices[i]) {
                minValue = prices[i];
            }
            else if (profit < prices[i] - minValue) {
                profit = prices[i] - minValue;
            }
        }
        return  profit;

    }
}
