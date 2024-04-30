package p018Keishou.kabe;

public class StartGu {

	public static void main(String[] args) {
		
		//子クラス（遺伝子入り）だけでおけ
		
		//「ボタン精製」
		
		Human01[] canon = new Human01[2];
		
		canon[0] = new Oku01();
		canon[1] = new Kudo01();

		
		//名詞「具」
		
		
		//動詞「具」
		
		canon[0].eat();
		canon[1].eat();

		for (Human01 h: canon) {
			h.eat();
		}
		
	}

}
