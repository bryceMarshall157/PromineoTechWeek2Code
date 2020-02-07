
public class Loops {

	boolean isHotOutside = true;
	boolean isWeekday = false;
	boolean hasMoneyInPocket = true;

	double costOfMilk = 3.50;
	int moneyInWallet = 87;
	int thirstLevel = 8;

	boolean shouldByIceCream = (isHotOutside && hasMoneyInPocket);
	boolean willGoSwimming = (isHotOutside && !isWeekday);
	boolean isAGoodDay = (isHotOutside && hasMoneyInPocket && !isWeekday);
	boolean willBuyMilk = (isHotOutside && thirstLevel >= 3 && moneyInWallet >= (2 * moneyInWallet));

	public static void main(String[] args) {

		int zeroToOneHundred = 0;

		// while loop that prints 0 to 100
		while (zeroToOneHundred <= 100) {
			if(zeroToOneHundred == 53) {
				System.out.print("\n");
			}
			System.out.print(zeroToOneHundred);
			zeroToOneHundred++;

		}
		
		System.out.print("\n\n");

		int everyThirdBackwards = 100;

		// while loop printing every third number
		while (everyThirdBackwards >= 0) {

			System.out.print(everyThirdBackwards + " ");
			everyThirdBackwards -= 3;
		}
		System.out.print("\n\n");
		
		//for loop printing every other number from 1 t0 100
		for(int i=0;i<=100;i++) {
			if(i % 2 == 0) {
				System.out.print(i);
			}
		}
		System.out.print("\n\n");
		
		//for loop FizzBuzz variation
		for(int i=0;i<=100;i++) {
			if(i%15==0) {
				System.out.println("Hello World" + " " + i);
			}else if(i%3==0) {
				System.out.println("Hello" + " " + i);
			}else if(i%5==0) {
				System.out.println("World" + " " + i);
			}
		}
	}

}
