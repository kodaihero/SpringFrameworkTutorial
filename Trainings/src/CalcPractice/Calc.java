package CalcPractice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
	// 演習問題
	//url: https://eng-entrance.com/java-question-algorithm

	// 問1: 入力された2つの数の和を出力するプログラムを作成しなさい。

	// 入力する数は、共に整数とする。
	// 負の数も含む。負の数の場合は、数値の直前に空白を挟まずに「-」（マイナス）を付加して入力するものとし、数値の範囲は-10000～10000とする。
	public static void question1 () throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("二つの数を半角スペースで区切って入力してください");
		String inputForQ1 = br.readLine(); // 入力フォーム
		String[] numsForSum = inputForQ1.split(" ");//入力値を空白で分解する

		int numA = Integer.parseInt(numsForSum[0]);
		int numB = Integer.parseInt(numsForSum[1]);
		System.out.println(numA + numB);
	}

	// 問2: 入力された四則演算の結果を出力するプログラムを作成しなさい。下記が条件だ。

	// 入力する数は、すべて整数とする。
	// 演算記号は「+」(和) 「-」(差) 「*」(積) 「/」(商)を使用する。
	// 四則演算の式は、1回の演算とし、2回以上の演算は行わない。（正しい：23 * 58 / 誤り: 23 + 58 + 7）
	// 商を求める際は、余りを「 … N」と表示する
	// 「0」(ゼロ)で割る式は入力しない
	// 負の数も含む。負の数の場合は、数値の直前に空白を挟まずに「-」（マイナス）を付加して入力するものとし、数値の範囲は-10000～10000とする。

	public static void question2 () throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("二つの数と演算記号を半角スペースで区切って入力してください");
		String inputForQ2 = br.readLine(); // 入力フォーム
		String[] numsForCalcs = inputForQ2.split(" ");//入力値を空白で分解する
		
		int numC = Integer.parseInt(numsForCalcs[0]);
		String calcChar = numsForCalcs[1];
		int numD = Integer.parseInt(numsForCalcs[2]);
		int i =0; // 問題を三回間違えた場合、終了するためのパラメーター
		int result = 0; // 計算結果の表示
		boolean remainder = false;
		
		if (calcChar.equals("+")) {
			result = numC + numD;
		} else if (calcChar.equals("-")) {
			result = numC - numD;
		} else if (calcChar.equals("*")) {
			result = numC * numD;
		} else if (calcChar.equals("/")) {
			result = numC / numD;
			if (numC % numD != 0) {
				remainder = true;
			}
		} else {
			System.out.println("演算記号を入れてください");
			// 問題を三回間違えた場合、終了する
			i++;
			if (i > 3) {
				System.out.println("ホーム画面に戻ります");
			}
			question2();
		}
		System.out.print(result);
		
		if (remainder == true) {
			System.out.println("..." + numC / numD);
		}
	}


	// 問3:入力された加算／減算演算の結果を出力するプログラムを作成しなさい。

	// 入力する数は、すべて整数とする。
	// 演算記号は「+」(和) 「-」(差)を使用する。
	// 演算の式は、最低1回の演算を行うものとし、複数回の演算を行う場合もある。（正しい:      23 + 58 + 7）
	// 負の数も含む。負の数の場合は、数値の直前に空白を挟まずに「-」（マイナス）を付加して入力するものとし、数値の範囲は-10000～10000とする。
	//演算の途中経過における取りうる値の反は-10000～10000とする。

	public static void question3 () {
		
	}


	// 問4:　入力された加算／減算演算の結果を出力するプログラムを作成しなさい。

	// 入力する数は、すべて整数とする。
	// 演算記号は「+」(和) 「-」(差)を使用する。
	// 演算の式は、最低1回の演算を行うものとし、複数回の演算を行う場合もある。
	// 四則演算の記法に乗っ取り、先に行うべき演算は「（」および「）」でくくるものとし、入れ子構造も可とする。【正しい:  23 + 58 + 7 – ( 10 + 3 ) – ( 3 – ( 5 + 4  – ( 8 – 2 ) ) )】
	// 負の数も含む。負の数の場合は、数値の直前に空白を挟まずに「-」（マイナス）を付加して入力するものとし、数値の範囲は-10000～10000とする。
	// 演算の途中経過における取りうる値の反は-10000～10000とする。

	public static void question4 () {

	}
}
