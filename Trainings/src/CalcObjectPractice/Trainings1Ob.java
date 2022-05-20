package CalcObjectPractice;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Trainings1Ob {

	// メインクラス

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 計算内容クラスのインスタンス化
		CalcOb calcOb = new CalcOb();

		// 入力パラメータを読み込む
		System.out.println("問題を選択してください\n"
				+ "1: 足し算\n"
				+ "2: 加減乗除\n"
				+ "3: 二回以上の加減\n"
				+ "4: ()付きの計算"
				);
		String input = br.readLine();
		
		if (Integer.parseInt(input) == 1) {
			// Calcクラス問1
			calcOb.question1();			
		} else if (Integer.parseInt(input) == 2) {
			// Calcクラス問2
			calcOb.question2();
		} else if (Integer.parseInt(input) == 3) {
			// Calcクラス問3
			calcOb.question3();
		} else if (Integer.parseInt(input) == 4) {
			// Calcクラス問4
			System.out.println();
			
		} else {
			System.out.println("1から4までの半角数字を選択してください");
			
		}
	}
	
}
