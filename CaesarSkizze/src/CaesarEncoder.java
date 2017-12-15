
public class CaesarEncoder {
	
	private char shift(char c) {
		return shift(c, 1);
	}

	private char shift(char c, int n) {
		int shift = ((c + n) - 'A') % 26;
		return (char) ('A' + shift);
	}

	public String encode(String s, int shift) {
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++)
			c[i] = shift(c[i], shift);
		return String.valueOf(c);
	}
}