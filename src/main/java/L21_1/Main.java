package L21_1;

public class Main {
	
	public static void main(String[] args) {
		Naehrstoffangaben nudeln = new Naehrstoffangaben.AngabenBuilder(3.0, 5)
				.withEiweiß(8.3)
				.withFett(4.2)
				.withCarbs(30.6)
				.withNatrium(1.1)
				.build();
		
		
		
	}

}
