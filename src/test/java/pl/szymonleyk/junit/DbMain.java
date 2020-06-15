package pl.szymonleyk.junit;

public class DbMain {
	public static void main(String[] args) {

		// Lifecycle.PER_METHOD
		Db db = new Db();
		db.add("Jurek");

		Db db2 = new Db();
		db2.add("Marian");

		Db db3 = new Db();
		db3.add("Marian");

		// Lifecycle.PER_Class
		Db db5 = new Db();
		db5.add("Jurek");
		db5.add("Marian");
		db5.add("Marian");
	}
}
