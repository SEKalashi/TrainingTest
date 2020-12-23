package TrainingTest;

public class MethodTest01 {
	public static void main(String[] args) {
		MethodTest01 m = new MethodTest01();
		m.display(5);
		System.out.println(m.calc(3));
		System.out.println(m.comparison(3, 5));
		System.out.println(m.comparison(3, 5, 7));
		m.hello("太郎");
		System.out.println(m.link("合!", "体!"));
		System.out.println(m.comparison("aaa", "aaaaa", "aaaaaaa"));
		m.display("出力", 5);
		System.out.println(m.link("合体!", 3));
		System.out.println(m.cut("abcdefg", 3));
		System.out.println("文字数は" + m.leng("abcdefg") + "文字");
		m.display("あ", 3, 4);
		m.displayW("あ", 4, 5);
		System.out.println(m.comparisonB("abcdefg", "abcdefg"));
		System.out.println(m.comparisonB("abcdefg", "abcde", "abc"));
		System.out.println(m.comparisonB("abcdefg", 3));
		System.out.println(m.comparisonB("abcdefg", "abc", 5));
		System.out.println(m.comparisonB("真です", "偽です", true));
	}

	public void display(int h) {
		System.out.println(h * 100);
		for (int i = 0; i < h; i++) {
			System.out.println("こんにちは。");
		}
	}

	public void display(String s, int h) {
		for (int i = 0; i < h; i++) {
			System.out.println(s);
		}
	}

	public void display(String s, int h, int w) {
		for (int i = 0; i < h; i++) {
			for (int n = 0; n < w; n++) {
				System.out.print(s);
			}
			System.out.print("\n");
		}
	}

	public void displayW(String s, int w, int h) {
		String sSum = "";
		for (int n = 0; n < w; n++) {
			sSum += s;
		}
		for (int i = 0; i < h; i++) {
			System.out.println(sSum);
		}
	}

	public int calc(int d) {
		return d * 1000;
	}

	public int comparison(int a, int b, int c) {
		int max = Math.max(a, Math.max(b, c));
		return max;
	}

	public int comparison(int a, int b) {
		int max = Math.max(a, b);
		return max;
	}

	public String comparison(String a, String b, String c) {
		if (a.length() > b.length() && a.length() > c.length()) {
			return a;
		} else if (b.length() > a.length() && b.length() > c.length()) {
			return b;
		} else if (c.length() > a.length() && c.length() > b.length()) {
			return c;
		} else {
			return null;
		}
	}

	public boolean comparisonB(String a, String b) {
		return a.equals(b);
	}

	public boolean comparisonB(String a, String b, String c) {
		if (a.equals(b) || b.equals(c) || a.equals(c)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean comparisonB(String a, int b) {
		if (a.length() > b) {
			return true;
		} else {
			return false;
		}
	}
	public boolean comparisonB(String a, String b, int c) {
		if ((a.length() + b.length()) > c) {
			return true;
		} else {
			return false;
		}
	}
	public String comparisonB(String a, String b, boolean c) {
		if (c) {
			return a;
		} else {
			return b;
		}
	}

	public void hello(String s) {
		System.out.println("こんにちは" + s + "さん。");
	}

	public String link(String s, String t) {
		return s + t;
	}

	public String link(String s, int t) {
		String sSum = "";
		for (int i = 0; i < t; i++) {
			sSum += s;
		}
		return sSum;
	}

	public String cut(String s, int t) {
		String c =  String.valueOf(s.charAt(t - 1));
		return c;
	}

	public int leng(String s) {
		return s.length();
	}
}
