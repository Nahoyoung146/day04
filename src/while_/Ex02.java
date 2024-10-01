package while_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		while (true) {
			if (i == 3) {
				break;
			}
			System.out.println(i++);
		}
		System.out.println("다음 문장들 실행!!!");

		for (; true;) {
			System.out.println("for : " + i++);
			if (i == 10)
				break;
		}
		System.out.println("다음 문장들 실행!!!");

		/*
		 * if(i<10) break; else System.out.println("다음 문장들 실행!!!"); break는 반복문안에서만 작동
		 */

		int num;
		while (true) {
			System.out.println("1. 입력");
			System.out.println("2. 종료");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("입력 기능입니다.");
				break;
			default:
				System.out.println("종료합니다.");
				break;
			}
			System.out.println("밖에 문장!!!");
			if (num == 2) {
				break;
			}
		}
	}
}