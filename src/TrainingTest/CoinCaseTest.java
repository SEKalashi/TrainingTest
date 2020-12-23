package TrainingTest;

public class CoinCaseTest {
	int[] coinType = new int[6];

	public static void main(String[] args) {
		int sum = 0;

		CoinCaseTest c1 = new CoinCaseTest();
		for (int i = 0; i < 10; i++) {
			System.out.println("コインの種類を入力してください");
			// 6以降のコインが選べてしまうので要修正
			System.out.println("[ 0:1円 1:5円 2:10円 3:50円 4:100円 5:500円 ]");
			int cType = new java.util.Scanner(System.in).nextInt();
			System.out.println("コインの枚数を入力してください");
			int cCount = new java.util.Scanner(System.in).nextInt();
			c1.addCoins(cType, cCount);
		}
		System.out.println("各コインの枚数は以下");
		System.out.println("1円:" + c1.coinType[0] + "枚" + " 5円:" + c1.coinType[1] + "枚");
		System.out.println("10円:" + c1.coinType[2] + "枚" + " 50円:" + c1.coinType[3] + "枚");
		System.out.println("100円:" + c1.coinType[4] + "枚" + " 500円:" + c1.coinType[5] + "枚");
		for (int i = 0; i < c1.coinType.length; i++) {
			sum += c1.getCount(i);
		}
		System.out.println("総枚数は" + sum + "枚");
		System.out.println("総額は" + c1.getAmount() + "円");
	}

	public void addCoins(int coinType, int sheets) {
		this.coinType[coinType] += sheets;
	}

	public int getCount(int coinType) {
		return this.coinType[coinType];
	}

	public int getAmount() {
		int amount = 0;
		for (int i = 0; i < this.coinType.length; i++) {
			switch (i) {
			case 0:
				amount += this.coinType[i];
				break;
			case 1:
				amount += this.coinType[i] * 5;
				break;
			case 2:
				amount += this.coinType[i] * 10;
				break;
			case 3:
				amount += this.coinType[i] * 50;
				break;
			case 4:
				amount += this.coinType[i] * 100;
				break;
			case 5:
				amount += this.coinType[i] * 500;
				break;
			}
		}
		return amount;
	}
}
