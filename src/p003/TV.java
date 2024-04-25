package p003;

public class TV {
	
	//名詞（フィールド/メンバ変数）
	int ch;
	
	//動詞（メソッド）
	void changeChannel ( int c ) {
		ch = c;
	}
	
	void displayChannel () {
		System.out.println("チャンネル" + ch);
		
	}

}
