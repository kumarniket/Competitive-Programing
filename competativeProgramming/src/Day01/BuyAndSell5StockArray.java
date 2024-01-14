package Day01;

public class BuyAndSell5StockArray {

	public static void main(String[] args) {
					    //0,1,2,3,4,5,6
		int prices[] = {7,8,1,5,3,9,4};
					  //0,1,2,3,4
		//int prices[] = {7,6,4,3,1};
		int buy_prices_index = 0;
		int sell_prices_index = 0;
		
		int prices_size = prices.length;
        
        int buy_min = prices[0];
        
        
        for(int i=0; i<prices_size; i++){
            if(prices[i]<buy_min){
                buy_min = prices[i];
                buy_prices_index = i;
                
            } 
        }
        if(buy_prices_index + 1 == prices_size) {
        	System.out.println("0");
        	System.out.println();
        }
        else {
        	
        System.out.println("Prices_buy: " + buy_min);
        System.out.println("Index_buy: " + buy_prices_index);
        System.out.println();
        
        int sell_max=buy_prices_index;
        
        
        for(int j=buy_prices_index; j<prices_size; j++) {
        	if(prices[j]>sell_max) {
        		sell_max = prices[j];
        		sell_prices_index = j;
        	}
        }
        System.out.println();
        System.out.println("Prices_sell: " + sell_max);
       System.out.println("Index_sell: " + sell_prices_index);
       int finalres = sell_max - buy_min;
        System.out.println("Sell - Buy: " + finalres);
    

	}
	}

}
