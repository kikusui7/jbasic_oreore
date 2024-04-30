package kadai06Keishou;

public class BookAction01 {

	public static void main(String[] args) {
		
		// ①ボタン精製（Bookクラスのオブジェクトを生成し変数b1に代入）
		
		Book b1 = new Book ("走れメロス", 450,"太宰治");
		
		// ③具｛動詞｝（書籍情報を出力）
		
		b1.showInfo();
		
		System.out.println("---");
		
		Item i1 = new Book("ホームズ", 600,"コナン");
		
		//？著者
		
		i1.showInfo();

	}

}
