package kadai04ObShikouIntDoushi;

public class Item01 {
	
	String name ;
	int price ;
	
	// フィールド（名前と価格を定義する）
	
	void name (String hondanyo) {
		System.out.println("名前：" + hondanyo);
	}
	
	void price (int en) {
		System.out.println("価格：" + en + "円");
	}
	
	void showInfo (String kireikirei, int zouzei) {
		System.out.println("名前：" + kireikirei);
		System.out.println("価格：" + zouzei + "円");
		System.out.println("価格：" + zouzei + "円");
	}
	
}
