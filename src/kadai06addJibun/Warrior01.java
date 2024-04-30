package kadai06addJibun;

public class Warrior01 extends Human01 {
	
	// ①名詞（フィールド）
	
	private String job;
	
	// ②家建築（コンストラクタ→under construction）
	
	public Warrior01 (){
		
	}
	
	public Warrior01 (String name ,String job){
		
		super(name);
		this.job = job;
		
	}
	
	// ③オープンスケ化（ゲッターセッター）

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	
	// ④動詞（情報出力用showInfoメソッド）
	
	public void info () {
		
		System.out.print("種別：" + job);
		super.info();
		
	}
	
	public void attack () {
		
		System.out.println("「" + job + "」" + "は突撃ぃぃ！！");
		
	}


}
