//best time to buy and shell 
public class buy{
    public static int maxProfit(int[] prices) {
    int minPrice = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {

        minPrice = Math.min(minPrice, prices[i]);

        int profit = prices[i] - minPrice;

        maxProfit = Math.max(maxProfit, profit);
    }

    return maxProfit;
}
    public static void main(String[] arg){
        int[] price = {7,1,4,6,5};
        int ans =  maxProfit(price);
        System.out.print(ans);
    }
}