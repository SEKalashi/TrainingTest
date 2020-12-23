package TrainingTest;

public class Sugoroku {
	public static void main(String[] args) {
		int game = 1;
		while (game != 0) {
			int goal = 30;
			int position = 0;
			int diceCount = 0;
			int diceSum = 0;
			int count = 0;
			String[] triangle = new String[goal];
			for (int i = 0; i < triangle.length; i++) {
				triangle[i] = "_";
			}
			System.out.println("▲すごろく▼");
			System.out.println(goal + "マス先にゴールがあります。");
			System.out.println("1,2,3の３つの目を持つ特別なサイコロ10個を、好きな数だけ振って駒を進めます。\n"
					+ "ぴったり上がりに止まれば終わりです。目の数が多ければ、余った目の数だけ戻ります。");
			// サイコロが11以上投げられるので要修正
			System.out.println("----------------------------------------------");
			while (position != goal) {
				triangle[position] = "▲";
				for (int i = 0; i < triangle.length; i++) {
					System.out.print(triangle[i] + " ");
				}
				System.out.println("|上がり！");
				triangle[position] = "_";
				System.out.print("残り" + (goal - position) + "マスです。サイコロの数は？");
				diceCount = new java.util.Scanner(System.in).nextInt();
				for (int i = 0; i < diceCount; i++) {
					int dice = (new java.util.Random().nextInt(4) + 1);
					diceSum += dice;
				}
				position += diceSum;
				System.out.println("出た目の合計" + diceSum);
				diceSum = 0;
				count++;
				if (position > goal) {
					position = goal - (position - goal);
				}
			}
			System.out.println("おめでとう！！ " + count + "回目で上がりです");
			System.out.print("もう一回やりますか？(1=Yes; 0=No!）");
			game = new java.util.Scanner(System.in).nextInt();
		}
	}
}