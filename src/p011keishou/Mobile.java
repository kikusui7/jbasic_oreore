package p011keishou;

public class Mobile extends Camera {
		 //　＝　子クラスを、親の遺伝子によって拡張する
	//注意！！「片親のみ」
	
	//「名詞」
	
	String telNo;
	
	//「動詞」
	
	public void talk () {
		System.out.println("電話番号：" + telNo);
		System.out.println("会話中だにょ");

	}

}
