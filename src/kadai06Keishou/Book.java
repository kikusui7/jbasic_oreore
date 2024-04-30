package kadai06Keishou;

public class Book extends Item {
	//｛注意｝「子クラス」が「親クラス」を継承する
	
	// ①名詞（フィールド）
	
	private String author;
	
	// ②家建築（コンストラクタ→under construction）
	
	//？superの「目的」
	//答：親の「名詞」を利用するために
	
//	
//	！ctrl + /　で範囲コメントアウト
//	
	public Book() {

	}
	
	//？全て必ず必要
	//答：オーバーロード（覚：コード）することが多いため、視覚的に分かりやすく

	public Book (String name , int price , String author) {
		
		super (name , price);
		this.author = author;
		
	}
	
	// ③オープンスケ化（ゲッターセッター）

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	// ④動詞（情報出力用showInfoメソッド）

	public void showInfo () {
		
		//オーバーライド（覚：上に乗る）
		
		super.showInfo();
		
		//｛注意｝
		
		System.out.println("著者：" + author);
		
	}


}
