package kadai05UConstKapuseru;

public class Item01 {

	//＜カプセル化＞
	//①「名詞」を同じクラス内からでしかアクセスできないようにする
	//②「メソッド（アクセッサ）」経由で、
	//フィールドにデータの代入（具）を行えるようにする
	//③「メソッド」経由なので、

	//名詞（フィールド/メンバ変数）
	private String name;
	private int price;

	//コンストラクタ
	
	Item01 () {
		
	}
	
	//= new Item01 「()」に対応
	
	Item01 (String name, int price) {
		//n = name;
		//p = price;
		
		this.name = name;
		this.price = price;
		
		//（上の？）nameに、～を入れる
		
	}

	//アクセッサ・メソッド（「具」のセッタ＆ゲッタ）の定義

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//動詞
	
	void showInfo() {
		System.out.println("商品名：" + name);
		System.out.println("価格：" + price + "円");

	}

}
