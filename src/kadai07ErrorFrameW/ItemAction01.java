package kadai07ErrorFrameW;

import java.util.ArrayList;
import java.util.List;

public class ItemAction01 {

	public static void main(String[] args) {
		
		// Itemクラスのリストを作成
		
		List<Item> denka = new ArrayList<>();
				
				// 商品をリストに追加（３つ）
		
		denka.add(new Item("ロボット掃除機", 50000));
		denka.add(new Item("ドラム", 500));
		denka.add(new Item("テレビ", 5));
		
		//｛注｝コンストラクタ時の「具（名）」？には、「new」
		
				
//				new Item("ロボット掃除機", 50000),
//				new Item("ドラム", 200000),
//				new Item("テレビ", 100000),
				
				//｛注｝（モノ）なので、;でなく,
		
		//拡張for文を利用して1件ずつ商品情報を出力する
		
		for (Item d : denka) {
			d.showInfo();
			System.out.println("---");
		}
		
	}

}
