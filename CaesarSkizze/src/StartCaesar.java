
public class StartCaesar {

	public static void main(String[] args) {
		CaesarEncoder en = new CaesarEncoder();
		CaesarDecoder de = new CaesarDecoder();
		System.out.println(en.encode("ABCD", 4));
		System.out.println(de.decode("XYZ", 3));
	}
}