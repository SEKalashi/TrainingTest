package TrainingTest;

public class ShapeCreation02 {

	public static void main(String[] args) {
		ShapeCreation02 t = new ShapeCreation02();
		t.test(5);
	}

	public void test(int size) {
		String sSum = "$";
		int count = size;
		for (int i = 0; i < size; i++) {
			String s = "";
			for (int t = 1; t < count; t++) {
				s += " ";
			}
			System.out.println(s + sSum);
			sSum += "$$";
			count--;
		}
		int sCount = size - 2;
		for (int i = 0; i < (size - 1); i++) {
			String s = "";
			sSum = "$";
			for (int t = 0; t <= count; t++) {
				s += " ";
			}
			for (int a = 0; a < sCount; a++) {
				sSum += "$$";
			}
			System.out.println(s + sSum);
			count++;
			sCount--;
		}
	}
}
