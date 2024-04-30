package kadai06addJibun;

public class Human01 {
	
	// ①名詞（フィールド）
	
	private String name;
	
	// ②家建築（コンストラクタ→under construction）
	
	public Human01 (){
		
	}
	
	public Human01 (String name){
		
		this.name = name;
		
	}
	
	// ③オープンスケ化（ゲッターセッター）

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ④動詞（情報出力用showInfoメソッド）
	
	public void info () {
		
		System.out.println("名前：" + name);
		
	}
	
	public void attack () {
		
		System.out.println("突撃ぃぃ！！");
		
	}


}
