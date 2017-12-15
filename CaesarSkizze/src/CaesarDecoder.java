
public class CaesarDecoder {
	public String decode(String s, int shift) {
		CaesarEncoder ce = new CaesarEncoder();
		return ce.encode(s, -shift);
	}
}