package chapter02;

import java.util.ArrayList;
import java.util.List;


public class ListExercise {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// String型を格納できるListを用意する
		List<String> names = new ArrayList<>();
		
		// String型のデータを格納する
		names.add("太郎");
		names.add("ジロウ");
		names.add("SABUROU");
		
		// データを一件ずつ表示する
		for (String name : names) {
			System.out.println(name);
		}
	}

}
