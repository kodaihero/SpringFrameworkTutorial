package CalcObjectPractice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcOb {
	// 演習問題
	//url: https://eng-entrance.com/java-question-algorithm

	// 文字入力ライブラリの宣言
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// 問1: 入力された2つの数の和を出力するプログラムを作成しなさい。
	// 入力する数は、共に整数とする。
	// 負の数も含む。負の数の場合は、数値の直前に空白を挟まずに「-」（マイナス）を付加して入力するものとし、数値の範囲は-10000～10000とする。
	public void question1 () throws IOException {
		System.out.println("二つの整数を半角スペースで区切って入力してください");
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

	public void question2 () throws IOException {	
		System.out.println("二つの整数と演算記号を入力してください");
		String inputForQ2 = br.readLine(); // 入力フォーム
		String[] numsForACalc = inputForQ2.split("");//入力値を空白で分解する

		int numC = Integer.parseInt(numsForACalc[0]);
		String calcChar = numsForACalc[1];
		int numD = Integer.parseInt(numsForACalc[2]);
		int endIn3Times = 0; // 問題を三回間違えた場合、終了するためのパラメーター
		int resultQ2 = 0; // 計算結果の表示
		boolean remainder = false; // 余りを表示するためのフラグ

		if (calcChar.equals("+")) {
			resultQ2 = numC + numD;
		} else if (calcChar.equals("-")) {
			resultQ2 = numC - numD;
		} else if (calcChar.equals("*")) {
			resultQ2 = numC * numD;
		} else if (calcChar.equals("/")) {
			resultQ2 = numC / numD;
			if (numC % numD != 0) {
				remainder = true;
			}
		} else {
			System.out.println("演算記号を入れてください");
			// 問題を三回間違えた場合、終了する
			endIn3Times++;
			if (endIn3Times > 3) {
				System.out.println("ホーム画面に戻ります");
			}
			question2();
		}
		System.out.print(resultQ2);

		// 割り算で余りが出た場合の処理
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

	public void question3 () throws IOException {
		System.out.println("三つ以上の整数とそれに対応した演算子を入力してください");
		String inputForQ3 = br.readLine();
		String[] numsForCalcs = inputForQ3.split("");
		String calcChar = null; // 演算子を格納するための変数
		Integer sum = 0; // 暫定の合計値を格納するための変数
		boolean remainder = false; // 余りを表示するためのフラグ
		int resultQ3 = 0; // 計算結果を格納するための変数

		// 
		for (int i=0; i<numsForCalcs.length; i++) {
			if(numsForCalcs[i].equals("+")
					|| numsForCalcs[i].equals("-")
					|| numsForCalcs[i].equals("*")
					|| numsForCalcs[i].equals("/")) {
				// 演算子を代入
				calcChar = numsForCalcs[i];
			}else {
				int num = Integer.parseInt(numsForCalcs[i]);
				if(calcChar != null) {
					if(calcChar.equals("+")) {
						sum += num;
					}else if (calcChar.equals("-")) {
						sum -= num;
					}else if (calcChar.equals("*")) {
						sum *= num;
					}else if (calcChar.equals("/")) {
						sum /= num;
					}else {
						System.out.println("入力内容に誤りがあります");
					}
				}else {
					sum = num;
				}
			}
		}
		resultQ3 = sum;
		System.out.print(resultQ3);
		// 割り算で余りが出た場合の処理
		if (remainder == true) {
			// System.out.println("..." + numC / numD);
		}
	}


	// 問4: 入力された加算／減算演算の結果を出力するプログラムを作成しなさい。

	// 入力する数は、すべて整数とする。
	// 演算記号は「+」(和) 「-」(差)を使用する。
	// 演算の式は、最低1回の演算を行うものとし、複数回の演算を行う場合もある。
	// 四則演算の記法に乗っ取り、先に行うべき演算は「（」および「）」でくくるものとし、入れ子構造も可とする。【正しい:  23 + 58 + 7 – ( 10 + 3 ) – ( 3 – ( 5 + 4  – ( 8 – 2 ) ) )】
	// 負の数も含む。負の数の場合は、数値の直前に空白を挟まずに「-」（マイナス）を付加して入力するものとし、数値の範囲は-10000～10000とする。
	// 演算の途中経過における取りうる値の反は-10000～10000とする。

	public void question4 () throws IOException {
		System.out.println("三つ以上の整数とそれに対応した演算子をスペース付きで入力してください");
		//String inputForQ4 = br.readLine();
		// String[] numbersForComplexCalcs = inputForQ4.split("");
		// int sum = calc(numbersForComplexCalcs,0,numbersForComplexCalcs.length - 1) ;
		
		
	}
}