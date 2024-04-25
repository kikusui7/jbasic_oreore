package kadai04;

public class Itemkaishaku {
	// フィールド
	String name; //商品名
	int price;   //価格
	
	// 情報出力用showInfo()メソッド
	void showInfo() {
		int tax = (int)(price * 0.1); //消費税を算出
		
		//下の（）内の簡略化のために、先に計算を
		
		System.out.println("名前：" + name);
		System.out.println("価格（税抜き）：" + price + "円");
		System.out.println("価格（税込み）：" + (price + tax) + "円");
	}
}
