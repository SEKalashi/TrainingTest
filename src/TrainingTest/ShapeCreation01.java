package TrainingTest;

public class ShapeCreation01 {
	String s = "$";

	public static void main(String[] args) {
		ShapeCreation01 t = new ShapeCreation01();
		t.creation(10);
	}

	public void creation(int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(s);
			s += "$";

		}
	}

}
