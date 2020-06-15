package pl.szymonleyk.junit;

import java.util.ArrayList;
import java.util.List;

public class Db {
	private static List<String> imiona = new ArrayList<>();

	public static void add(String imie) {
		imiona.add(imie);
		System.out.println("dodał:"+imiona);
	}
	
	public static void delete(String imie) {
		imiona.remove(imie);
		System.out.println("usunął: "+imiona);
	}
	
	public static boolean exists(String imie) {
		boolean exists = imiona.contains(imie);
		System.out.println(imiona);
		System.out.println("Czy istnieje "+imie+"? "+exists);
		return exists;
	}
}
