package kadai03;

import java.util.Scanner;

public class CalcPoints02kabe {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("購入金額：");
		int price = scan.nextInt();
		System.out.println("1:プレミア会員, 2:無料会員");
		System.out.print("会員ランク：");
		int rank = scan.nextInt();
		
		
		// 会員ランクによる判定
		scan.close();
	}
	
	static int getPoints(int price, boolean premier) {
		double per = premier == true ? 0.2 : 0.1;
		
		//premier以下、if文と同等
		
		int point = (int)(price * per);
		
		//直接の計算→（int）なぜ？←Sysoutではないため
		
		return point;

		// ポイント計算メソッド
	}
}
