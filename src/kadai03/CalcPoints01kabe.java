package kadai03;

public class CalcPoints01kabe {

	public static void main(String[] args) {
		int price = 1000;
		
		// プレミア会員のポイント計算 
		int p1 = getPoints(price, true);
		System.out.println("プレミア会員には" + p1 + "ポイント付与されます");

		// 無料会員のポイント計算 
		int p2 = getPoints(price, false);
		System.out.println("無料会員には" + p2 + "ポイント付与されます");
	}
	
	static int getPoints(int price, boolean premier) {
		double per = premier == true ? 0.2 : 0.1;
		
		//premier以下、if文と同等
		
		int point = (int)(price * per);
		
		//直接の計算→（int）なぜ？←Sysoutではないため
		
		return point;
		//返す値を確定しているだけ→受け取る方法は決まっているため。
	}

}
