package kadai06Keishou;

public class ItemAction {

	public static void main(String[] args) {
		
		// ①ボタン精製（Itemオブジェクト（ロボット掃除機/50000円）を生成）
		
		Item i = new Item ("ロボット掃除機", 50000);
		
		// ③具｛動詞｝（商品情報を出力）
		
		i.showInfo();
		
		System.out.println("---");
		
		// Itemオブジェクト（洗濯機/200000円）を生成
		
		Item i2 = new Item ("洗濯機", 200000);
		
		// 商品情報を出力
		
		i2.showInfo();
		
	}

}
