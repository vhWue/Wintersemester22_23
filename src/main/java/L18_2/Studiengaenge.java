package L18_2;

public enum Studiengaenge {
	WINF("Files/Studiengangssplitter/WInf.txt"),
	INF("Files/Studiengangssplitter/Inf.txt"),
	EC("Files/Studiengangssplitter/EC.txt");
	String studiengaenge;
	private Studiengaenge(String studiengaenge) {
		this.studiengaenge = studiengaenge;
	}

}
