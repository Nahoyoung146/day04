package while_;

import java.util.Scanner;

public class TeamQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 0;
		while (true) {
			System.out.println("-----------------Menu------------------");
			System.out.println("1. 콜라 / 300\n2. 사이다 / 300\n3. 커피 / 200\n4. 돈 넣기\n5. 잔돈 반환\n6. 종료");
			System.out.println("--------------------------------------");

			System.out.printf("현재금액 : %,d\n",m);
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			System.out.println();

			if (menu == 4) {
				System.out.print("돈을 넣어주세요 : ");
				int money = sc.nextInt();
				m += money;
			}

			else if (menu == 1) {
				if (m < 300)
					System.out.println("구매 불가");

				else
					System.out.println("콜라 맛있게 드세요\n");
				m -= 300;
			}

			else if (menu == 2) {
				if (m < 300)
					System.out.println("구매 불가");

				else
					System.out.println("사이다 맛있게 드세요\n");
				m -= 300;
			}

			else if (menu == 3) {
				if (m < 200)
					System.out.println("구매 불가");

				else
					System.out.println("커피 맛있게 드세요\n");
				m -= 300;
			}

			else if (menu == 5) {
				System.out.println(m + "원의 잔액이 반환됩니다.");
				m = 0;
			}

			else if (menu == 6) {
				System.out.println("프로그램 종료");
				break;
			}

			else
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
		}
	}
}