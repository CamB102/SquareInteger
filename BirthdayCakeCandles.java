package algorithmday1;

public class BirthdayCakeCandles {

	    public static void main(String[] args) {
	        int[] candles = {4, 4, 1, 3};

	        System.out.println("Count: " + birthdayCakeCandles(candles));
	    }

	    public static int birthdayCakeCandles(int[] candles) {
	        int highestCandle = candles[0];
	        int count = 0;

	        for (int height : candles) {
	            if (height > highestCandle) {
	            	highestCandle = height;
	                count = 1;
	            } else if (height == highestCandle) {
	                count++;
	            }
	            
	        }
	        System.out.println("The highest candle: " + highestCandle);
	        return count;
	    }
	}


