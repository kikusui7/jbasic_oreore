package kadai06Keishou;

public class Item {
	
	// ①名詞（フィールド）
	
	private String name;
	private int price;
	
	// ②家建築（コンストラクタ→under construction）
	
	Item (){
		
	}
	
	Item (String name , int price){
		
		this.name = name;
		this.price = price;
		
	}
	
	// ③オープンスケ化（ゲッターセッター）

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
	
	// ④動詞（情報出力用showInfoメソッド）
	
	public void showInfo () {
		
		System.out.println("商品名：" + name);
		System.out.println("価格：" + price + "円");
		
	}

}
