package kadai06Keishou;

public class BookAction02 {

	public static void main(String[] args) {
		
		// ①＋②（Itemクラスの配列を生成しItemとBookのオブジェクトを複数格納する）
		
		Item[] dbList = {
			
				new Item("ロボット掃除機", 50000),
				new Book("鬼滅の包丁", 450, "GO峠こよはる"),
				new Book("１ピース", 500, "尾田A一郎")
			
		};
		
		//小さい方から = 大きい方へ
		
		// ③（繰り返し処理を利用して1件ずつ商品情報を出力する）
		
		for (Item manga : dbList) {
			
			manga.showInfo();
			System.out.println("---");
			
		}

	}

}
