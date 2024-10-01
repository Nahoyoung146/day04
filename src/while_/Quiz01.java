package while_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		String realid = null, realpassword = null, id = null, password = null;
		while (check) {
			System.out.println("1. 로그인\n2. 회원가입\n3. 나가기");
			System.out.print(">>> ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				if (realid != null && realpassword != null) {
					System.out.print("아이디입력 : ");
					id = sc.next();
					System.out.print("비밀번호 입력 : ");
					password = sc.next();
					if (realid.equals(id) && realpassword.equals(password)) {
						System.out.println("로그인완료");
						check = false;
					} else
						System.out.println("인증실패!!");
				}

				else
					System.out.println("회원가입 먼저 진행해주세요.");
				break;
			case 2:
				System.out.print("저장할 아이디 입력 : ");
				realid = sc.next();
				System.out.print("저장할 비밀번호 입력 : ");
				realpassword = sc.next();
				System.out.println("가입완료");
				break;
			case 3:
				System.out.println("프로그램 종료");
				check = false;
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
		}
	}
}