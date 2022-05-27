package com.example.demo.chapter03.used;

/*
 * Greet実装クラス<br>
 * 朝の挨拶をする
 */

public class MorningGreet implements Greet{
	@Override
	public void greeting() {
		System.out.println("-------------");
		System.out.println("おはようございます！");
		System.out.println("-------------");
	}
}
