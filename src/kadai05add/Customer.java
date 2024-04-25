package kadai05add;

public class Customer {

	//＜カプセル化＞
	//①「名詞」を同じクラス内からでしかアクセスできないようにする
	//②「メソッド（アクセッサ）」経由で、
	//フィールドにデータの代入（具）を行えるようにする
	//③「メソッド」経由なので、

	//名詞（フィールド/メンバ変数）
	private int id;
	private String name;

	//コンストラクタ
	
	public Customer (String name) {
		this.name = name;
		
		//nameに、～を入れる
		
	}
	
	//publicで「具」を入れられるように
	
	public Customer (int id , String name) {
		
		this.id = id;
		this.name = name;
		
		//nameに、～を入れる
		
	}

	//アクセッサ・メソッド（「具」のセッタ＆ゲッタ）の定義

	//動詞
	
	void showData() {
		System.out.println( id + "：" + name);

	}

}
