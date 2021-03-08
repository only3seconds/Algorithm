package array;

/**
 * @author thinking-ppp 2020/8/9
 */
public class MaxProfit {
  public int maxProfit(int[] prices) {
    int result = 0;
    int buy = -1;
    for (int i = 0; i < prices.length-1; i++) {
      if (prices[i] > prices[i+1]) {
        if (buy == -1) {

        } else {
          result += prices[i] - prices[buy];
          buy = -1;
        }

      } else {
        if (buy == -1) {
          buy = i;
        } else {

        }

      }

    }

    if (buy != -1) {
      result += prices[prices.length-1] - prices[buy];
    }


    return result;


  }

}
