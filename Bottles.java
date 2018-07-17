
public class Bottles {
	
	public static void main(String[] args) {
		
		int beer = 0;
		String bottles = "bottles";
		String bottle = "bottle";
		
		for (int i = 99; i >= 0; i--) {
			beer = i;
			int nextBeer = beer - 1;
			if (beer == 1) {
				System.out.println(beer + " " + bottle + " of beer on the wall, " + beer + " " + bottle + " of beer!  Take it down, pass it around, " + nextBeer + " " + bottles + " of beer on the wall!");
			}
			else if (beer < 1) {
				System.out.println(beer + " " + bottles + " of beer on the wall, " + beer + " " + bottles + " of beer! Go to the store, buy some more! Put 99 bottles of beer on the wall!");
			}
			else if (beer == 2) {
				System.out.println(beer + " " + bottles + " of beer on the wall, " + beer + " " + bottles + " of beer!  Take one down, pass it around, " + nextBeer + " " + bottle + " of beer on the wall...");
			}
			else {
				System.out.println(beer + " " + bottles + " of beer on the wall, " + beer + " " + bottles + " of beer!  Take one down, pass it around, " + nextBeer + " " + bottles + " of beer on the wall...");
			}
		}
	}
}
