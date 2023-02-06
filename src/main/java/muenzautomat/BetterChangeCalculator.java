package muenzautomat;

public class BetterChangeCalculator implements ChangeCalculator{

	@Override
	public int[] getChange(int euros, int cent) {
	if(euros<0) {
		throw new RuntimeException("Negativer Euro Betrag");
	}
	if(cent<0) {
		throw new RuntimeException("Negativer Cent Betrag");
	}
	if(cent>99) {
		throw new RuntimeException("Cent Betrag groeßer als 99");
	}
		
	int betrag = euros*100+cent;
	Coin[] coinEnum = Coin.values();
	int[] coinCounter= new int[coinEnum.length];
	int position=7;
			while(betrag>0) {
				if(betrag-coinEnum[position].value>=0) {
					betrag-=coinEnum[position].value;
					coinCounter[position]++;
				}
				else {
					position--;
				}
			}
		
		return coinCounter;
	}
	public static void ausgabe(int[] arr, Coin[] coins) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Anzahl "+coins[i].value+" Münzen: "+arr[i]);
		}
	}
}
