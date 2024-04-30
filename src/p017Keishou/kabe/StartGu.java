package p017Keishou.kabe;

public class StartGu {

	public static void main(String[] args) {
		
		//子クラス（遺伝子入り）だけでおけ
		
		//「ボタン精製」
		
		Human01 h = new Human01 ();
		
//		Oku01 o = new Oku01();
		
//		Kudo01 k = new Kudo01();
		
		//名詞「具」
		
		o.name = "奥";
		o.age = 22;
		
		k.name = "工藤";
		k.age = 22;
		
		//動詞「具」
		
		o.eat();
		
		k.listen();
		
	}

}
