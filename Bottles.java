
public class Bottles {
	
	public static void main(String[] args) {
		
		int bottles = 0;
		String beers = "bottles";
		String beer = "bottle";
		
		for (int i = 99; i >= 0; i--) {
			bottles = i;
			int nextBottle = bottles - 1;
			if (bottles == 1) {
				System.out.println(bottles + " " + beer + " of beer on the wall, " + bottles + " " + beer + " of beer!  Take it down, pass it around, " + nextBottle + " " + beers + " of beer on the wall!");
			}
			else if (bottles < 1) {
				System.out.println(bottles + " " + beers + " of beer on the wall, " + bottles + " " + beers + " of beer! Go to the store, buy some more! Put 99 bottles of beer on the wall!");
			}
			else if (bottles == 2) {
				System.out.println(bottles + " " + beers + " of beer on the wall, " + bottles + " " + beers + " of beer!  Take one down, pass it around, " + nextBottle + " " + beer + " of beer on the wall...");
			}
			else {
				System.out.println(bottles + " " + beers + " of beer on the wall, " + bottles + " " + beers + " of beer!  Take one down, pass it around, " + nextBottle + " " + beers + " of beer on the wall...");
			}
			
		}
	}
}
