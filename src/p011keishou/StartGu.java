package p011keishou;

public class StartGu {

	public static void main(String[] args) {
		
		//子クラス（遺伝子入り）だけでおけ
		
		//「ボタン精製」
		
		Mobile m = new Mobile();
		
		//名詞「具」
		
		m.telNo = "090-0909-0909";
		m.maker = "キャッキャウフフ";
		
		//動詞「具」
		
		m.talk();
		m.takePicture();
		
	}

}
