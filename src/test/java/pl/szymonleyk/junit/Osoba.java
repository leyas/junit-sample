package pl.szymonleyk.junit;

public class Osoba {
	private String imie;
	private String nazwisko;

	public Osoba(String imie, String nazwisko) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public String przywitaj() throws NullPointerException {
		if(imie == null) {
			throw new NullPointerException();
		}
		return "Cześć "+imie+".";
	}
}
