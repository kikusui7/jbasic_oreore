package p015Keishou;

public class StartGu {

	public static void main(String[] args) {
		
		//子クラス（遺伝子入り）だけでおけ
		
		//「ボタン精製」
		
		Oku01 o = new Oku01();
		
		//先頭が（）なので、= o←「new Oku01」って言う倉庫の中から引っ張ってくるぞ～
		
		Kudo01 k = new Kudo01();
		
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
