package kadai04;

import java.util.Scanner;

public class UserAction02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//ボタン生成
		
		User01 U2 = new User01();
		
		// 田中太郎（20）の情報を登録して出力
		
		System.out.println("会員を登録します");
		
		String your ;
		int jijii;
		
		System.out.print("名前：");
		your = scan.next();
		
		//左辺
		
		System.out.print("年齢：");
		jijii = scan.nextInt();
		
		U2.name = your;
		
		//右辺を繋げられる
		
		U2.age = jijii;
		
		
		System.out.println("---");
		System.out.println("会員を登録しました");
		
		// 鈴木一郎（25）の情報を登録して出力
		
		U2.showInfo();
		
	}

}
