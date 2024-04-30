package p011KeishouKapuseru.copy;

public class StartGu {

	public static void main(String[] args) {
		
		//子クラス（遺伝子入り）だけでおけ
		
		//「ボタン精製」
		
		Mobile m = new Mobile("090-0909-0909", "キャッキャウフフ");
		
		//「キャッキャウフフ」は元が親クラス
		
		//名詞「具」
		
//		m.setTelNo("090-0909-0909");
//		m.setMaker("キャッキャウフフ");
		
		//setTelNo(String telNo)　だから、（）
		
		//動詞「具」
		
		m.talk();
		m.takePicture();
		
	}

}
