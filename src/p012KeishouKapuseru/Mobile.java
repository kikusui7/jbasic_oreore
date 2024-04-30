package p012KeishouKapuseru;

public class Mobile extends Camera {
		 //　＝　子クラスの中に、親の遺伝子を注入する
	//注意！！「片親のみ」
	
	//「名詞」
	
	private String telNo;
	
	//コンストラクタ←｛目的｝名詞「具」
	
	public Mobile() {
	}
	
	public Mobile(String telNo, String maker) {
		this.telNo = telNo;
		super.maker = maker;
		
		//スーパークラスにあるにょ

	}

	//プライベートでも、「具」
	
	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	//「動詞」

	public void talk () {
		System.out.println("電話番号：" + telNo);
		System.out.println("会話中だにょ");

	}

}
